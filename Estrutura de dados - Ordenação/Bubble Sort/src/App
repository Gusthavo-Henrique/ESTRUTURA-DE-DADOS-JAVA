public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[20]; 
        for(int i = 0 ; i < vetor.length ; i++) {
            vetor[i] = (int) (Math.random()*100);
            System.out.println(vetor[i]);
        }
        for(int i = 0 ; i < vetor.length ; i++) {
            for(int j = i + 1 ; j < vetor.length ; j++) {
                if(vetor[i] > vetor[j] ) {
                    int aux = 0;
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }   
        }
        System.out.println("----------Ordenado--------------");
        for(int i = 0 ; i < vetor.length ; i++) {
            System.out.println(vetor[i]);
        }
    }
}
