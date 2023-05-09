import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[1000];

        for(int i = 0; i < vetor.length ; i++) {
            vetor[i] = (int) (Math.random() * 10000);
            System.out.println(vetor[i]);
        }
        Scanner scan = new Scanner(System.in);
        boolean b = false;
        System.out.println("Qual valor a ser buscado?");
        int busca = scan.nextInt();
        int posição = 0;
        for (int i = 0 ; i < vetor.length ; i++) {
            if (vetor[i] == busca) {
                posição = i;
                b = true;
                break;
            }
        }
        if (b == true) {
            System.out.println("O seu número existe e está na posição: " +(posição+1));
        }
        else {
            System.out.println("Seu numero nao existe");
        }scan.close();
    }
}
