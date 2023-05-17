public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[10];
        for(int i = 0 ; i < vetor.length ; i++) {
            vetor[i] = (int) (Math.random()*vetor.length);
            System.out.println(vetor[i]);
        }
        int aux;
        for(int i = 0 ; i <vetor.length; i++) {
            for(int j = i +1 ; j < vetor.length ; j++) {
                if(vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("--------------ORDENAÇÃO SELECT-------------");
        for(int i = 0 ; i < vetor.length ; i++) {
            System.out.println(vetor[i]);
        }
    }
}

