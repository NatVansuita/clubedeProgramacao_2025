import java.util.Scanner;

public class Palavra {

    private String palavra;
    private String dica;
    private Tema tema;

    public Palavra(String palavra, String dica) {
        this.palavra = palavra;
        this.dica = dica;
    }

    public String getPalavra() {
        return palavra;
    }

    public String getDica() {
        return dica;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public Tema getTema() {
        return tema;
    }

    public char[] VetorLetras(String resposta) {
        resposta.toLowerCase();
        return resposta.toCharArray();
    }

    public boolean Verificar(Resposta resposta) {
        char[] vetPalavra = palavra.toCharArray();
        char[] vetResposta = resposta.VetorLetras(resposta.getPalavra());
        int cont = 0;

        if (vetResposta.length == 1) {
            for (int i = 0; i < vetPalavra.length; i++) {
                if (vetPalavra[i] == vetResposta[0]) {
                    cont++;
                }
            }
            if (cont == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            if (palavra.equals(resposta.getPalavra())) {
                return true;
            } else {
                return false;
            }
        }
    }

    public int ReceberDica(Palavra palavraSorteada, Boneco boneco) {
        Scanner ler = new Scanner(System.in);
        int receber = 0;
        while (receber != 1 && receber != 2) {
            System.out.println("Deseja obter uma dica?\n1 - SIM\t2 - NÃO");
            receber = ler.nextInt();
            if (receber != 1 && receber != 2)
                System.out.println("Opção inválida! Digite novamente.");
        }
        return receber;
    }
}
