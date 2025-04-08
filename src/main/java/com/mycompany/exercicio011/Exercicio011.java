/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio011;

/**
 *
 * @author Fabricio de Aguiar
 */

/**Faça um programa em JAVA que solicite 1 número inteiro, verificar
se o mesmo é múltiplo de 2 e mostrar a resposta mesmo que
negativa:*/

import javax.swing.JOptionPane;

public class Exercicio011 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro que seja múltiplo de 2: "));
        if ((numero % 2) == 0) {
            JOptionPane.showMessageDialog(null, "Seu número é multiplo de 2");

        } else {
            JOptionPane.showMessageDialog(null, "Seu número não é múltiplo de 2");

        }

    }
}
