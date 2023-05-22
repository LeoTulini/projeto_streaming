import java.util.List;

public abstract class Audiovisual {

    protected String titulo;
    protected int anoLancamento;
    protected String diretor;
    protected List atores;
    protected Genero genero;
    protected double nota;

    public Audiovisual(String titulo,
                       int anoLancamento,
                       String diretor,
                       List atores,
                       Genero genero,
                       double nota){

        setTitulo(titulo);
        setAnoLancamento(anoLancamento);
        setDiretor(diretor);
        setAtores(atores);
        setGenero(genero);]
        setNota(nota);
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public List getAtores() {
        return atores;
    }

    public void setAtores(List atores) {
        this.atores = atores;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public abstract void reproduzir();
}