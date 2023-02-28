package ads.aula3tb;

import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if (A > B){
            System.out.println(A + " é o maior número");
        } else {
            System.out.println(B + " é o maior número");
        }
        
    }
    
}
