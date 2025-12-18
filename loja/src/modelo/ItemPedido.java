package modelo;

public class ItemPedido {

    private Prato prato;
    private int quantidade;

    public ItemPedido(Prato prato, int quantidade) {


        this.prato = prato;
        this.quantidade = quantidade;

    }

    public double calcularSubtotal() {
        return prato.getPreco() * quantidade;
    }
    public void mostrarItem(){
        System.out.println(quantidade + "prato" + prato.getNome() + " = " +
                          String.format("&.2f", calcularSubtotal()));
    }
    public Prato getPrato() {
        return prato;
    }

    public int getQuantidade() {
        return quantidade;
    }
}


