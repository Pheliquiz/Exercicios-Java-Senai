package ads.aula3tb;

import java.util.Scanner;

public class Exercicio8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int A = sc.nextInt();
        
        if (A > 0) {
            System.out.println(A + " ao quadrado é = " + Math.pow(A, 2));
            System.out.println("Raiz quadrada de " + A + " é = " + Math.sqrt(A));
        } else {
            System.out.println("Número inválido");
        }
        
    }
}
