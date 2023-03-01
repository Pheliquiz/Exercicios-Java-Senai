package br.com.gfelix.Exercícios.Aulas2802;

import java.util.Scanner;

public class At1 {
    
    public static void main(String[] args) {
        int soma = 1;
        for (int i  = 0; soma <= 100; i++){
            System.out.println(i + " mais " + soma + " é " + (soma + i));
            soma += i;
        }
        
    }
    
}
