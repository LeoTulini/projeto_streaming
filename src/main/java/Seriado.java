import java.util.ArrayList;
import java.util.List;

public class Seriado extends Audiovisual{

    private int numTemporadas;
    private int numEpisodios;
    private int classificacao;
    private double nota;
    private ArrayList<Streaming> streamings;

    public Seriado(String titulo,
                   int anoLancamento,
                   String diretor,
                   List principaisAtores,
                   Genero genero,
                   int numTemporadas,
                   int numEpisodios,
                   int classificacao,
                   double nota,
                   List<Streaming> streamings) {

        super(titulo, anoLancamento, diretor, principaisAtores, genero);
        setNumTemporadas(numTemporadas);
        setNumEpisodios(numEpisodios);
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public int getNumEpisodios() {
        return numEpisodios;
    }

    public void setNumEpisodios(int numEpisodios) {
        this.numEpisodios = numEpisodios;
    }

    public void reproduzir() {};
}
