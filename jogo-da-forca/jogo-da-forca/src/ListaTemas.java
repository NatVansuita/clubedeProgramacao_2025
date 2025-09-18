import java.util.ArrayList;
import java.util.Random;

public class ListaTemas {

    private ArrayList<Tema> listaTemas;

    public ListaTemas() {
        listaTemas = new ArrayList<>();
    }

    public void adicionarTema(Tema tema) {
        listaTemas.add(tema);
    }

    public void setListaTemas(ArrayList<Tema> listaTemas) {
        this.listaTemas = listaTemas;
    }

    public Tema SortearTema() {
        Random r = new Random();
        int aleatorio = r.nextInt(this.listaTemas.size());
        return this.listaTemas.get(aleatorio);
    }

}
