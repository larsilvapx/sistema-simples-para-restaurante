package servicos;

import modelo.ItemPedido;
import modelo.Pedido;
import modelo.Prato;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<Prato> cardapio = new ArrayList<>();
    private List<Pedido>  pedidos = new ArrayList<>();


    public void cadastrarPedido(String nome, double preco){
        Prato prato = new Prato(nome, preco);
        cardapio.add(prato);
        System.out.println("Prato cadastrado com sucesso!");

    }
    public void listarCardapio(){
        if(cardapio.isEmpty()){
            System.out.println("Cardapio vazio");
            return;
        }
        for(int i = 0; i < cardapio.size(); i ++){
            Prato p = cardapio.get(i);
            System.out.println(i + " - " + p.getNome() + "( R$ " + p.getPreco() + ")");
        }
    }
    public Prato buscarPrato(int indice){
        if(indice < 0 || indice >= cardapio.size()){
            return null;
        }
        return cardapio.get(indice);
    }
    public void abrirPedido(int numeroMesa){
        Pedido pedido = new Pedido(numeroMesa);
        pedidos.add(pedido);
        System.out.println("Pedido aberto para a mesa :" + numeroMesa);

    }
    public Pedido buscarPedido(int numeroMesa){
        for(Pedido pedido : pedidos){
            if(pedido.getNumeroMesa() == numeroMesa && !pedido.isFechado()){
                return pedido;
            }
        }
        return null;
    }
    public void adicionarItemPedido(int numeroMesa, int indicePrato, int quantidade){
    Pedido pedido = buscarPedido(numeroMesa);
    Prato prato = buscarPrato(indicePrato);

    if(pedido == null){
        System.out.println("Pedido não encontrado!");
        return;
    }
    if(prato == null){
        System.out.println("Prato invalido!");
        return;
    }
        ItemPedido item = new ItemPedido(prato, quantidade);
        pedido.adicionarItem(item);
        System.out.println("Item adicionado com sucesso");

    }
    public void fecharPedido(int numeroMesa){
        Pedido pedido = buscarPedido(numeroMesa);

        if(pedido == null){
            System.out.println("Pedido não encontrado");
            return;
        }
        pedido.fecharPedido();
        System.out.println("Pedido da mesa " + numeroMesa + "fechado");
        System.out.println(("Total: R$ " + pedido.calcularTotal()));

    }
}
