package ads.aula3tb;

import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do professor: ");
        String nomeProfessor = sc.nextLine();
        
        System.out.println("Digite as horas trabalhadas/ Aulas dadas: ");
        double horasTrabalho = sc.nextDouble();
        
        System.out.println("Digite o dígito do nível do professor: ");
        int nivelProfessor = sc.nextInt();
        
        if (horasTrabalho > 0) {
            if (nivelProfessor == 1){
                System.out.printf("Salário professor " + nomeProfessor + " é de R$ %.2f" , (horasTrabalho * 12.00));
            } else if (nivelProfessor == 2){
                System.out.printf("Salário professor " + nomeProfessor + " é de R$ %.2f" , (horasTrabalho * 17.00));
            } else if (nivelProfessor == 3) {
                System.out.printf("Salário professor " + nomeProfessor + " é de R$ %.2f" , (horasTrabalho * 25.00));
            } else {
                System.out.println("Nível inválido");
            }
        } else {
            System.out.println("Sem salário");
        }
    }
    
}
