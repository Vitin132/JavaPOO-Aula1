/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_Circulo;

/**
 *
 * @author Vitor
 */
public class Circulos {
    
    double raio;
    
    
    double calcularArea(){
        
        double area = Math.PI * raio * raio;
        return area;
    }
    
    double calcularCircunferencia(){
        
        double circunferencia = 2 * Math.PI * raio;
        return circunferencia;
        
    }
    
}
