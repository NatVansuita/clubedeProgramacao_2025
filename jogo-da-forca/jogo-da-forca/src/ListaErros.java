import java.util.ArrayList;

public class ListaErros {

    private ArrayList<String> respostasErradas;

    public ListaErros() {
        respostasErradas = new ArrayList<>();
    }

    public void AdicionarResposta(String resposta) {
        if (this.respostasErradas.size() >= 1) {
            this.respostasErradas.add(" - " + resposta);
        } else {
            this.respostasErradas.add(resposta);
        }
    }

    public void PrintarErrros() {
        for (int i = 0; i < respostasErradas.size(); i++) {
            System.out.print(respostasErradas.get(i));
        }
    }

}
