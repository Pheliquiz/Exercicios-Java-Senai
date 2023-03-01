package ads.aula3tb;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        
        System.out.println("Digite outro número: ");
        int b = sc.nextInt();

        
        if (a > b) {
            System.out.println("A diferença entre " + a + " e " + b + "é de " + (a - b));
        } else {
            System.out.println("A diferença entre " + b + " e " + a + "é de " + (b - a));
        }

    }

}
