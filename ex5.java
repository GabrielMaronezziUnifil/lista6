
import java.util.Scanner;


public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float vet[] = new float[5];
        int opcao,i;
        for(i = 0;i<5;i++){
            System.out.println("informe o numero de vet");
            vet[i] = sc.nextFloat();
        }
        do {
            System.out.println("0 - para finalizar");
            System.out.println("1 - para mostrar na ordem deireta");
            System.out.println("2 - para mostrar na ordem inversa");

            opcao = sc.nextInt();
            if (opcao == 1){
                for( i = 0;i<5;i++){
                    System.out.println(vet[i]);
                }
            }else if(opcao == 2){
                for(i = 4;i>=0;i--){
                    System.out.println(vet[i]);
                }
            }else if((opcao < 0) || (opcao > 2)){
                System.out.println("codigo invalido");
            }
        }while (opcao != 0);

    }
}