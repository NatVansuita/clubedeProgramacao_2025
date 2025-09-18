public class Resposta extends Palavra {

    private String resposta;

    public Resposta(String resposta) {
        super(null, null);
        this.resposta = resposta;
    }

    @Override
    public String getPalavra() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
