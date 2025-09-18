public class Boneco {

    private int chances;
    private char[] boneco = { 'O', '|', '/', '\\', '|', '/', '\\' };

    public Boneco() {
        this.chances = 7;
    }

    public int getChances() {
        return chances;
    }

    public char[] getBoneco() {
        return boneco;
    }

    public void DescontarChance() {
        this.chances--;
    }

    public boolean VerificarJogo() {
        if (this.chances == 0) {
            return true;
        } else {
            return false;
        }
    }

}
