package ads.aula3tb;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número positivo: ");
        int numero = sc.nextInt();
        
        if (numero > 0){
            System.out.println("Raiz quadrada de " + numero+ " = "+ Math.pow(numero, 2));
        } else {
            System.out.println("Número inválido");
        }
        
    }
    
}
