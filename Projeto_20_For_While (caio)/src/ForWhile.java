public class ForWhile {
    public static void main(String[] args) {

        int contFor, contWhile;

        //for(inicialização; condição; incremento)
        for(contFor = 0; contFor < 5; contFor++)
            System.out.println("valor do contFor: " + contFor);

        contWhile = 0; // Inicialização do while

        //while(condição)
        while (contWhile < 5) {
        System.out.println("valor do contWhile: " + contWhile);
        contWhile++; // incremento do while
      }
   }
}