package com.mycompany.exercicio12;

import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O número maior é " + numero1);
        } else {
            if (numero1 == numero2) {
                JOptionPane.showMessageDialog(null, "Os númeos são iguais!");
            } else {
                JOptionPane.showMessageDialog(null, "O número maior é: " + numero2);

            }
        }
    }
}
