import java.util.Scanner;

/*
Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido
Codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim. Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram
cada tipo de combustível, conforme exemplo.
*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contA=0, contGas=0, contDiesel=0;
        int cod = sc.nextInt();

        while(cod != 4){

            if (cod == 1){
                contA++;
            }
            if (cod == 2){
                contGas++;
            }
            if (cod == 3){
                contDiesel++;
            }

            cod = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool:" + contA);
        System.out.println("Gasolina: " + contGas);
        System.out.println("Diesel: " + contDiesel);

    }
}
