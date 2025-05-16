/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX05_Circulo;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        Circulos circulo = new Circulos();
        
        System.out.println("Digite o valor do raio do círculo: ");
        circulo.raio = sc.nextDouble();
        
        System.out.println("O valor da área do círculo é: "+circulo.calcularArea());
        
        System.out.println("O valor da área do círculo é: "+circulo.calcularCircunferencia());
        
        
        
    }
    
}
