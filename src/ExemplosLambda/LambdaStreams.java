package ExemplosLambda;

import java.util.Arrays;
import java.util.List;

public class LambdaStreams {
    // JAVA 8: Funções Lambda

    // API DE STREAM

    //Stream - fluxo de dados

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // Pegando os dados e filtrando os pares
        list.stream().filter(item -> item % 2 == 0).forEach(item -> System.out.println(item));
    }




}
