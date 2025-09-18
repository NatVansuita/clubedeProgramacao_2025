public class Tema {

    private String nomeTema;
    ListaPalavras listaPalavras = new ListaPalavras();

    public Tema(String nomeTema, ListaPalavras listaPalavras) {
        this.nomeTema = nomeTema;
        this.listaPalavras = listaPalavras;
    }

    public String getNomeTema() {
        return nomeTema;
    }

    public void setNomeTema(String nomeTema) {
        this.nomeTema = nomeTema;
    }

    public ListaPalavras getListaPalavras() {
        return listaPalavras;
    }

}
