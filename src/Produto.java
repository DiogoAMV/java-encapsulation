public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private Estoque estoque;
    private Atributos atributos;
    private FichaTecnica fichaTecnica;

    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public void setFichaTecnica(FichaTecnica fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
    }

    public void mostraDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + estoque.getQuantidade());
        System.out.println("Atributos: " + atributos.getTipo() + " - " + atributos.getValor());
        System.out.println("Ficha Técnica: " + fichaTecnica.getTipo() + " - " + fichaTecnica.getDescricao());
    }
}
