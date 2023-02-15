package ads.aula3tb;

import java.util.Scanner;


public class Exercicio1Sexo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char sexMas = 'M';
        char sexFem = 'F';
        
        
        System.out.println("Digite seu sexo: ");
        char nome = sc.next().charAt(0);
        
         /* if ((nome.equals("M")) || (nome.equals("F"))) {
            System.out.println("Sexo binário");
        }else {
            System.out.println("Sexo não binário");
        } */
        
        if (nome == 'M') {
            System.out.println("Sexo binário");
        } else if (nome == 'F') {
            System.out.println("Sexo binário");
        } else {
            System.out.println("Sexo não binário ");
        }
        
    }
    
}
