import java.util.Arrays;

public class Jogo {

    private ListaTemas listaTemas = new ListaTemas();
    // dar um jeito melhor de preencher depois

    public void Iniciar() {
        this.listaTemas.adicionarTema(PreencherLista());
        ListaErros listaErros = new ListaErros();
        ListaRespostas listaRespostas = new ListaRespostas();

        boolean dica = false, terminouJogo = false, novoJogo;
        Tema sorteioTema = this.listaTemas.SortearTema();
        Palavra sorteioPalavra = sorteioTema.getListaPalavras().SortearPalavra();
        Boneco boneco = new Boneco();
        Tela tela = new Tela(sorteioPalavra);
        tela.PreencherVet();
        Usuario usuario = new Usuario(0, 0, 0, 0);
        // precisa eliminar possíveis erros de entrada com caracteres especiais
        
        while (boneco.getChances() != 0 && !terminouJogo) {
            usuario.setQntdJogos();
            tela.PrintarForca(listaErros, sorteioTema);
            String resp = tela.lerTentativa();
            Resposta resposta = new Resposta(resp);

            if (listaRespostas.ContemResposta(resposta)) {
                tela.mostrarMensagem("Você já digitou essa resposta. Digite novamente.");

            } else {
                boolean res = sorteioPalavra.Verificar(resposta);
                if (res) {
                    if (resposta.getPalavra().equals(sorteioPalavra.getPalavra())) {
                        tela.setVetPalavra(resposta.getPalavra().toCharArray());
                        tela.PrintarForca(listaErros, sorteioTema);
                        terminouJogo = true;
                    } else {
                        tela.CompletarPalavra(resposta, sorteioPalavra);
                    }
                } else {
                    tela.MontarBoneco(boneco);
                    boneco.DescontarChance();
                    listaErros.AdicionarResposta(resposta.getPalavra());
                }
            }
            listaRespostas.AdicionarPalavra(resposta);

            if (boneco.getChances() < 4 && !dica) {
                dica = tela.PrintarDica(sorteioPalavra, sorteioPalavra.ReceberDica(resposta, boneco));
                if (dica) {
                    usuario.setQntdDicas();
                }
            }

            if (Arrays.equals(tela.getVetPalavra(), sorteioPalavra.getPalavra().toCharArray())) {
                tela.mostrarMensagem("O jogo temrinou");
                terminouJogo = true;
                usuario.setQntdVitorias();
            }
            if (boneco.getChances() == 0) {
                usuario.setQntdErros();
            }
        }
    }

    public Tema PreencherLista() {
        ListaPalavras listaPalavras = new ListaPalavras();
        String[] palavras = {
                "natacao",
                "golfe",
                "atletismo"
        };

        String[] dicas = {
                "Modalidade aquática, esporte olímpico.",
                "Usa-se um taco para acertar a bolinha.",
                "Engloba diversas modalidades, como saltos e arremessos."
        };

        for (int i = 0; i < palavras.length; i++) {
            Palavra Novapalavra = new Palavra(palavras[i], dicas[i]);
            listaPalavras.AdicionarPalavra(Novapalavra);
        }

        Tema novoTema = new Tema("Esporte", listaPalavras);
        return novoTema;
    }
}