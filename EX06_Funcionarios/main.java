/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX06_Funcionarios;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        funcionario func = new funcionario();
        
        System.out.println("Qual o nome do funcionário?");
        func.nome = sc.nextLine();
        
        System.out.println("Qual o departamento no qual o funcionario trabalha? ");
        func.departamento = sc.nextLine();
        
        System.out.println("Qual o salario do funcionario?");
        func.salario = sc2.nextDouble();
        
        //System.out.println("Digite o valor percentual do aumento:");
        //func.numero = sc2.nextDouble();
        
       
        
        System.out.println("Valor do salário com aumento: "+func.aumentarSalario());
        
        
        
    }
    
    
}
