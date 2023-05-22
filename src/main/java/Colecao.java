import java.util.ArrayList;

public class Colecao {
    private String nome;
    private ArrayList<Audiovisual> disponiveis = new ArrayList<>();

    public Colecao(){
        setNome(nome);
        setDisponiveis(disponiveis);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDisponiveis(ArrayList<Audiovisual> disponiveis) {
        this.disponiveis = disponiveis;
    }

    public void adicionar(Audiovisual audiovisual){
        disponiveis.add(audiovisual);
    }

    public void remover(Audiovisual audiovisual){
        disponiveis.remove(audiovisual);
    }

    public ArrayList imprimirColecao(){
        return this.disponiveis;
    }

    public Audiovisual consultarObra(String nomeDaObra){
        for(var i=0;i<disponiveis.size();i++){
            if (disponiveis.get(i).getTitulo().equals(nomeDaObra)){
                return disponiveis.get(i);
            }
            }
        return null;
        }
    }




