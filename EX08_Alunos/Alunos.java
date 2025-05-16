/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX08_Alunos;

/**
 *
 * @author Vitor
 */
public class Alunos {

    String nome;
    int matricula;

    double[] notas = {8, 8, 7.5};

    double calcularMedia() {

        double soma = 0;

        for (double nota : notas) {

            soma += nota;

        }
        return soma / notas.length;

    }

}
