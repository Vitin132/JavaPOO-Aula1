/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX06_Funcionarios;

/**
 *
 * @author Vitor
 */
public class funcionario {
    
    String nome;
    double salario;
    String departamento;
    double percentual = 0.10;
    
    
    double aumentarSalario(){
        
        
        
        return  salario + (salario * percentual);
          
        
        
    }
    
    
    
}
