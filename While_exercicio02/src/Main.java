import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x!=0 && y!=0) {

            if (x>0 && y>0) { // x e y maiores que 0
                System.out.println("primeiro");
            }
            if (x<0 && y>0){ // x menor que zero, y maior que 0
                System.out.println("segundo");
            }
            if (x<0 && y<0) { // x e y menores que 0
                System.out.println("terceiro");
            }
            if (x>0 && y<0){ // x maior que 0, y menor que 0
                System.out.println("quarto");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
