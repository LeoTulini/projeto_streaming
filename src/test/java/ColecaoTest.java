import org.junit.Test;

import java.util.Arrays;

public class ColecaoTest {

    @Test
    public void deveAdicionarUmaObraNaColecao(){
        Colecao netflix = new Colecao();
        Audiovisual Vingadores3 = new Audiovisual(001,"Vingadores 3",2018, "Leonardo", Arrays.asList("Robert Downey", "Chris Evans"), Genero.FILME);
        Audiovisual Vingadores4 = new Audiovisual(002,"Vingadores 4",2020, "Joao", Arrays.asList("Robert Downey", "Chris Evans"), Genero.FILME);
        Audiovisual GOT = new Audiovisual(003,"Game Of Thrones",2021, "Felipe", Arrays.asList("Pedro Pascal", "Bella Ramsey"), Genero.SERIADO);
        netflix.adicionar(Vingadores3);
        netflix.adicionar(Vingadores4);
        netflix.adicionar(GOT);

        System.out.println(netflix.imprimirColecao());
    }

    @Test
    public void deveRetornarAConsultaPorNomeDoObjeto(){
        Colecao netflix = new Colecao();
        Audiovisual Vingadores3 = new Audiovisual(001,"Vingadores 3",2018, "Leonardo", Arrays.asList("Robert Downey", "Chris Evans"), Genero.FILME);
        Audiovisual Vingadores4 = new Audiovisual(002,"Vingadores 4",2020, "Joao", Arrays.asList("Robert Downey", "Chris Evans"), Genero.FILME);
        Audiovisual GOT = new Audiovisual(003,"Game Of Thrones",2021, "Felipe", Arrays.asList("Pedro Pascal", "Bella Ramsey"), Genero.SERIADO);
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
