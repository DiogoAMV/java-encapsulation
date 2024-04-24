public class FichaTecnica {
    private String tipo;
    private String descricao;

    public FichaTecnica(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }
}
