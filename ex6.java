import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[10];
        int x, i;
        for (i = 0; i < 10; i++) {
            System.out.println("Informe um numero do vetor");
            vet[i] = sc.nextInt();
        }
        System.out.println("Informe x!");
        x = sc.nextInt();

        for (i = 0; i < 10; i++) {
            if(vet[i] % x ==0){
                System.out.println(vet[i]);
            }
        }
    }
}
