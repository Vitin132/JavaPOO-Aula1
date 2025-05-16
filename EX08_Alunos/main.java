/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX08_Alunos;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        
        Alunos aluno = new Alunos();
        
        
        System.out.println("Qual o nome do Aluno?");
        aluno.nome = sc.nextLine();
        
        System.out.println("Qual o número da matrícula?");
        aluno.matricula = sc2.nextInt();
        
        System.out.println("As notas do aluno são: "+aluno.notas);
        
        
        
        System.out.println(aluno.calcularMedia());
        
        
    }
    
}
