package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroMesa;
    private List<ItemPedido> itens = new ArrayList<>();
    private boolean fechado;


    public Pedido(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.itens = new ArrayList<>();
        this.fechado = false;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void adicionarItem(ItemPedido item){
        if(fechado){
            System.out.println("O pedido já esta fechado, não é possivel adicionar");
            return;
        }
        itens.add(item);
    }
    public double calcularTotal(){
        double total = 0;

        for (ItemPedido item : itens){
            total += item.calcularSubtotal();
        }
        return total;
    }
    public void fecharPedido(){
        if(itens.isEmpty()){
            System.out.println("Não é possivel fechar o item vazio");
            return;
        }
        this.fechado = true;
    }
}


