public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
      
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("NumeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("NumeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("NumeroUm é igual a numeroDois? " + simNao);
    }
}
