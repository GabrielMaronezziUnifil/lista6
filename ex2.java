import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[5];
        int soma=0;
        for (int i = 0;i<5;i++){
            System.out.println("informe os numeros do vetor");
            vet[i] = sc.nextInt();
            soma = soma + vet[i];
        }
        Arrays.sort(vet);
        for (int i = 0;i<5;i++){
            System.out.println(vet[i]);
        }
        System.out.println(vet[0]+"é o menor numero");
        System.out.println(vet[4]+"é o maior numero");
        System.out.println("a soma dos numeros juntos deu"+soma);
    }
}
