import java.util.Locale;
import java.util.Scanner;

/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
*/
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            double v1 = sc.nextDouble(); // primeiro valor tem peso 2
            double v2 = sc.nextDouble(); // o segundo valor tem peso 3
            double v3 = sc.nextDouble(); //o terceiro valor tem peso 5

            double media = (v1*2.0+v2*3.0+v3*5.0)/10.0;

            System.out.printf("%.1f",media);
        }
        sc.close();

    }
}
