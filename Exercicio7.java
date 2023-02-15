package ads.aula3tb;

import java.util.Scanner;

public class Exercicio7 {
  
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite um número REAL: ");
        int numero = sc.nextInt();
        
        if (numero > 0){
            System.out.println("Raiz quadrada do número: " + Math.sqrt(numero));
        } else {
            System.out.println("Número ao quadrado: " + Math.pow(numero, 2));
        }
       
    }
    
}
