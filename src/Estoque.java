public class Estoque {
    private String tipo;
    private int quantidade;

    public Estoque(String tipo, int quantidade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int incrementaEstoque(int quantidade) {
        this.quantidade += quantidade;
        return this.quantidade;
    }

    public int decrementaEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return this.quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
            return -1;
        }
    }
}
