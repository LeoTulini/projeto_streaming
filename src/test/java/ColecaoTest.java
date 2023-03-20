import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ColecaoTest {

    @Test
    public void deveAdicionarUmaObraNaColecao(){
        Colecao netflix = new Colecao();
        Obra Vingadores3 = new Obra(001,"Vingadores 3",2018, "Leonardo", Arrays.asList("Robert Downey", "Chris Evans"), Tipo.FILME);
        Obra Vingadores4 = new Obra(002,"Vingadores 4",2020, "Joao", Arrays.asList("Robert Downey", "Chris Evans"), Tipo.FILME);
        Obra GOT = new Obra(003,"Game Of Thrones",2021, "Felipe", Arrays.asList("Pedro Pascal", "Bella Ramsey"), Tipo.SERIADO);
        netflix.adicionar(Vingadores3);
        netflix.adicionar(Vingadores4);
        netflix.adicionar(GOT);

        System.out.println(netflix.imprimirColecao());
    }

    @Test
    public void deveRetornarAConsultaPorNomeDoObjeto(){
        Colecao netflix = new Colecao();
        Obra Vingadores3 = new Obra(001,"Vingadores 3",2018, "Leonardo", Arrays.asList("Robert Downey", "Chris Evans"), Tipo.FILME);
        Obra Vingadores4 = new Obra(002,"Vingadores 4",2020, "Joao", Arrays.asList("Robert Downey", "Chris Evans"), Tipo.FILME);
        Obra GOT = new Obra(003,"Game Of Thrones",2021, "Felipe", Arrays.asList("Pedro Pascal", "Bella Ramsey"), Tipo.SERIADO);
        netflix.adicionar(Vingadores3);
        netflix.adicionar(Vingadores4);
        netflix.adicionar(GOT);

        //System.out.println(netflix.imprimirColecao());
        System.out.println(netflix.consultarObra("Game Of Thrones"));
        //Obra@c818063 v3
        //Obra@3f0ee7cb v4
        //Obra@75bd9247 GOT
    }
}
