import java.util.Random;
import java.util.List;
import java.util.ArrayList;


public class ex4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int vet[] = new int[10];

        for (int i = 0; i < 20; i++) {
            vet[i] = aleatorio.nextInt(30);
        }

        for (int i = 0; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; i++) {
                if (vet[i] == vet[j]) {

                }
            }
        }

    }
}
