import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[10000];
        
        for (int i = 0 ; i <vetor.length ; i++) {
            vetor[i] = i * 2;
            System.out.println(vetor[i]);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual número vc busca?");
        int elemento = scan.nextInt();

        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while (inicio <= fim) {
            meio = (int) (( inicio + fim )/2);
            if (vetor[meio] == elemento) {
                achou = true;
                break;
            }
            else if(vetor[meio] < elemento){
                inicio = meio + 1;
            }
            else {
                fim = meio - 1;
            }
        }
        if (achou == true) {
            System.out.println("Achou ");
        }
        else {
            System.out.println("Não achou");
        }scan.close();
    }
    //BUSCA BINARIA O(log n)
}
