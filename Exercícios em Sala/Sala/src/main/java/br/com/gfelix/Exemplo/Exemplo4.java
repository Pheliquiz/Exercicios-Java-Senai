package br.com.gfelix.example4;

import java.util.Scanner;

public class Exemplo4 {

    public static void main(String[] args) {
       
        int n1, n2, i;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor inicial: ");
        n1 = sc.nextInt();
        
        System.out.println("Digite um valor final");
        n2 = sc.nextInt();
        
        for(i = n1 ; i <= n2; i++){
            
            System.out.println("i - " + i);
            
        }
        
    }
    
}
