import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class Filme extends Audiovisual{

    private String sinopse;
    private int duracao;
    private int classificacaoIdade;
    private ArrayList<Streaming> streamings;
    public Filme(String titulo,
                 int anoLancamento,
                 String diretor,
                 List atores,
                 Genero genero,
                 double nota,
                 String sinopse,
                 int duracao,
                 int classificacaoIdade,
                 List<Streaming> streamings) {
        super(titulo, anoLancamento, diretor, atores, genero, nota);
        setSinopse(sinopse);
        setDuracao(duracao);
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getClassificacaoIdade() {
        return classificacaoIdade;
    }

    public void setClassificacaoIdade(int classificacaoIdade) {
        this.classificacaoIdade = classificacaoIdade;
    }

    public void reproduzir() {};

    public void buscarFilme() throws IOException {
        String urlBase = "http://www.omdbapi.com/";
        String chaveApi = "e991f82e";

        String urlStr = urlBase + "?apikey=" + chaveApi + "&t=" + titulo;
        URL url = new URL(urlStr);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        Scanner scanner = new Scanner(conn.getInputStream());
        String response = scanner.useDelimiter("\\A").next();

        // Ler arquivo json (response)

        scanner.close();
        conn.disconnect();
    }
}
