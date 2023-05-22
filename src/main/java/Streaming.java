import java.util.ArrayList;

public class Streaming {
    private String nome;
    private double valorAssinatura;
    private ArrayList<Filme> filmes = new ArrayList<>();
    private ArrayList<Seriado> seriados = new ArrayList<>();
    public Streaming(String nome,
                     ArrayList filmes,
                     ArrayList seriados,
                     double valorAssinatura) {

        setNome(nome);
        setValorAssinatura(valorAssinatura);
        setFilmes(filmes);
        setSeriados(seriados);}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Filme> getFilmes() {
        return filmes;
    }
    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
    public void addFilme(Filme filme) {
        this.filmes.add(filme);
    }
    public ArrayList<Seriado> getSeriados() {
        return seriados;
    }
    public void setSeriados(ArrayList<Seriado> seriados) {
        this.seriados = seriados;
    }
    public void addSerie(Seriado seriado) {
        this.seriados.add(seriado);
    }
    public double getValorAssinatura() {
        return valorAssinatura;
    }
    public void setValorAssinatura(double valorAssinatura) {
        this.valorAssinatura = valorAssinatura;
    }
}
