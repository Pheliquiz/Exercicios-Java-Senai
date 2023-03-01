package ads.aula3tb;

import java.util.Scanner;

public class Exercicio2ParImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int input = sc.nextInt();

        if (input % 2 == 0) {
            if (input > 0) {
                System.out.println("Número par e positivo");
            } else {
                System.out.println("Número par e negativo");
            }
        } else {
            if (input > 0) {
                System.out.println("Número ímpar e positivo");
            } else {
                System.out.println("Número ímpar e negativo");
            }
        }

    }

}
