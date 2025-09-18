import java.util.ArrayList;

public class ListaRespostas {
    private ArrayList<String> listaRespostas;

    public ListaRespostas() {
        this.listaRespostas = new ArrayList<>();
    }

    public void AdicionarPalavra(Resposta resposta) {
        this.listaRespostas.add(resposta.getPalavra());
    }

    public ArrayList<String> getListaRespostas() {
        return listaRespostas;
    }

    public boolean ContemResposta(Resposta resposta) {
        boolean encontrou = false;
        for (int i = 0; i < this.listaRespostas.size(); i++) {
            if (this.listaRespostas.get(i).contains(resposta.getPalavra())) {
                encontrou = true;
            }
        }
        return encontrou;
    }
}
