import java.util.Scanner;

public class Tela {

    private Palavra palavaraSorteada;
    private char[] vetPalavra;
    private char[] bonecoTela = { ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
    private String dica = "";
    private Scanner ler = new Scanner(System.in);

    public Tela(Palavra palavaraSorteada) {
        this.palavaraSorteada = palavaraSorteada;
        this.vetPalavra = new char[palavaraSorteada.getPalavra().toCharArray().length];
    }

    public Palavra getPalavaraSorteada() {
        return palavaraSorteada;
    }

    public char[] getVetPalavra() {
        return vetPalavra;
    }

    public void setVetPalavra(char[] palavra) {
        this.vetPalavra = palavra;
    }

    public void PrintarForca(ListaErros erros, Tema temaSorteado) {
        System.out.println("\n\nTEMA: " + temaSorteado.getNomeTema().toUpperCase());
        System.out.print(this.dica);
        System.out.println("___________________");
        System.out.println("|                 |");
        System.out.println("|                 " + bonecoTela[0]);
        System.out.println("|                " + bonecoTela[2] + bonecoTela[1] + bonecoTela[3]);
        System.out.println("|                 " + bonecoTela[4]);
        System.out.println("|                " + bonecoTela[5] + " " + bonecoTela[6]);
        System.out.println("|");
        System.out.print("|\t");
        for (int i = 0; i < this.vetPalavra.length; i++) {
            System.out.print(this.vetPalavra[i] + " ");
        }
        System.out.print("\nRespostas erradas: ");
        erros.PrintarErrros();
    }

    public boolean PrintarDica(Palavra palavraSorteada, int receber) {
        if (receber == 1) {
            this.dica = "DICA: " + palavraSorteada.getDica() + "\n";
            return true;
        } else {
            return false;
        }

    }

    public char[] PreencherVet() {
        for (int i = 0; i < this.vetPalavra.length; i++) {
            this.vetPalavra[i] = '_';
        }
        return this.vetPalavra;
    }

    public char[] CompletarPalavra(Resposta resposta, Palavra sorteioPalavra) {

        for (int posic = 0; posic < sorteioPalavra.getPalavra().toCharArray().length; posic++) {
            if (resposta.getPalavra().toCharArray()[0] == palavaraSorteada.getPalavra().toCharArray()[posic])
            this.vetPalavra[posic] = resposta.getPalavra().toCharArray()[0];
            else if (resposta.getPalavra().equals(this.palavaraSorteada.getPalavra()))
            this.vetPalavra = resposta.getPalavra().toCharArray();
            
        }
        return this.vetPalavra;
    }

    public void MontarBoneco(Boneco boneco) {
        int cont = 7 - boneco.getChances();
        this.bonecoTela[cont] = boneco.getBoneco()[cont];
    }

    public String lerTentativa() {
        System.out.println("\nDigite sua resposta: ");
        return ler.nextLine();
    }

    public void mostrarMensagem(String string) {

        System.out.println(string);
    }
}
