public class Usuario {
    private int qntdErros, qntdJogos, qntdVitorias, qntdDicas;

    public Usuario(int qntdErros, int qntdJogos, int qntdVitorias, int qntdDicas) {
        this.qntdErros = qntdErros;
        this.qntdJogos = qntdJogos;
        this.qntdVitorias = qntdVitorias;
        this.qntdDicas = qntdDicas;
    }

    public int getQntdErros() {
        return qntdErros;
    }

    public void setQntdErros() {
        this.qntdErros++;
    }

    public int getQntdJogos() {
        return qntdJogos;
    }

    public void setQntdJogos() {
        this.qntdJogos++;
    }

    public int getQntdVitorias() {
        return qntdVitorias;
    }

    public void setQntdVitorias() {
        this.qntdVitorias++;
    }

    public int getQntdDicas() {
        return qntdDicas;
    }

    public void setQntdDicas() {
        this.qntdDicas++;
    }

    
}