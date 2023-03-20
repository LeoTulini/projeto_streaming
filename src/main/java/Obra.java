import java.util.ArrayList;
import java.util.List;

public class Obra {

    private int codigo;
    private String nome;
    private int ano;
    private String diretor;
    private List principaisAtores;
    private Tipo tipo;

    public Obra(int codigo, String nome, int ano, String diretor, List principaisAtores, Tipo tipo){
        this.codigo = codigo;
        this.nome = nome;
        this.ano = ano;
        this.diretor = diretor;
        this.principaisAtores = principaisAtores;
        this.tipo = tipo;
    }

    public String getNome(){
        return this.nome;
    }
}