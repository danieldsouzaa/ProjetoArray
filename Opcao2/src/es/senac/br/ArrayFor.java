/*
Opção 02 - Criar um Projeto com comando de Repetição e Array
 */
package es.senac.br;

import javax.swing.JOptionPane;

public class ArrayFor {

    public static void main(String[] args) {

        int[] numeros = new int[3];

        int num;

        String leitura;

        for (int i = 0; i < 3; i++) {

            leitura = JOptionPane.showInputDialog("DIGITE 3 NUMEROS - " + i);

            numeros[i] = Integer.parseInt(leitura);

        }

        leitura = JOptionPane.showInputDialog("DIGITE O NUMERO QUE ESTA PROCURANDO");

        num = Integer.parseInt(leitura);

        int cont = 0;

        for (int i = 0; i < 3; i++) {

            if (numeros[i] == num) {

                cont = i;

            }

        }

        JOptionPane.showMessageDialog(null, "O NÚMERO PROCURADO APARECE NA POSIÇÃO: " + cont);

    }
    
}
