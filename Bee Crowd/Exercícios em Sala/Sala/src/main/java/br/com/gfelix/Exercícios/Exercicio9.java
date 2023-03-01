package br.com.gfelix.Exercícios;

import java.util.Scanner;

public class Exercicio9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Multiplicação com for
        
        int num = sc.nextInt();
        
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " vezes " + num +  " é = " + (num * i));
        }
        
    }
    
}
