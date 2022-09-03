import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float vet[] = new float[10];
        int cont=0;
        float soma = 0;

        for (int i = 0; i<10;i++){
            System.out.println("Informe o "+ (i +1)+"° elemento do vetor!");
            vet[i] = sc.nextFloat();
            if (vet[i] > 0){
                soma = soma + vet[i];
            } else if(vet[i]<0){
                cont++;
            }
        }
        System.out.println(cont+ " elementos do vetor sao negativos");
        System.out.println("A soma dos numeros positivos é igual a:"+ soma);
    }
}
