import java.util.ArrayList;

public class Colecao {
    private ArrayList<Obra> disponiveis;

    public Colecao(){
        disponiveis = new ArrayList<>();
    }

    public void adicionar(Obra obra){
        disponiveis.add(obra);
    }

    public void remover(Obra obra){
        disponiveis.remove(obra);
    }

    public ArrayList imprimirColecao(){
        return this.disponiveis;
    }

    public Obra consultarObra(String nomeDaObra){
        for(var i=0;i<disponiveis.size();i++){
            if (disponiveis.get(i).getNome().equals(nomeDaObra)){
                return disponiveis.get(i);
            }
            }
        return null;
        }
    }




