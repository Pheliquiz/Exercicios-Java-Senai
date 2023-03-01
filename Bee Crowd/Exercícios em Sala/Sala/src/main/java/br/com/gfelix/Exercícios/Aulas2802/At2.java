package br.com.gfelix.Exercícios.Aulas2802;


public class At2 {
    
    public static void main(String[] args) {
        int soma = 6;
        for (int i = 0;soma<= 190; i++){
           System.out.println(i + " mais " + soma + " é " + (soma + i));
           soma += i; 
        }
        
    }
    
}
