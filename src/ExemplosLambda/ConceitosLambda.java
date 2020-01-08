package ExemplosLambda;

public class ConceitosLambda {

    // Exemplo de método pré Java 8
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("True Collors");
            }
        }).run();

        /** Sam - Single Abstract method
           Qualquer interface que tenha apenas um método abtrato
           Ao instanciar uma classe dessa, com lambda o java já entende
           do que se trata.

           Exemplos:
        **/

        // Explicação:
        //         Parametro da função
        new Thread(() ->
                // Corpo da função
                System.out.println("True Collors")).run();

    }
}
