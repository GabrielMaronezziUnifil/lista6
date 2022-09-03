import java.util.Random;


public class ex3 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int vet[] =new  int[10];

        for (int i = 0;i<10;i++){
            vet[i] = aleatorio.nextInt(30);
        }
        for (int i = 0;i<10;i++){
            System.out.println(vet[i]);
        }
        for (int i = 0;i<10;i++){
            for (int j = i+ 1;j<10;j++){
                if(vet[i] == vet[j]){
                    System.out.println(vet[i]+" foi repetido");
                }
            }
        }
    }
}
