public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 1, 29.90);
        Atributos atributo1 = new Atributos("Tamanho", "M");
        Atributos atributo2 = new Atributos("Cor", "Azul");
        FichaTecnica fichaTecnica = new FichaTecnica("Material", "Algodão");
        Estoque estoque = new Estoque("Principal", 100);

        produto.setAtributos(atributo1);
        produto.setAtributos(atributo2);
        produto.setFichaTecnica(fichaTecnica);
        produto.setEstoque(estoque);

        produto.mostraDados();

        estoque.incrementaEstoque(50);
        System.out.println("Quantidade em estoque: " + estoque.getQuantidade());

        estoque.decrementaEstoque(30);
        System.out.println("Quantidade em estoque: " + estoque.getQuantidade());
    }
}