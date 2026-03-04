package algoritmos;

import javax.swing.*;

public class ManipulacaoArrays {
    public static void main(String[] args) {
        int[] meuVetor = {10, 20, 30, 40, 50};
        int[][] minhaMatriz = {{1, 2}, {3, 4}};

        int resultadoVetor = calcularSomaVetor(meuVetor);
        int resultadoMatriz = calcularSomaMatriz(minhaMatriz);

        System.out.println("Soma do Vetor fixo: " + resultadoVetor);
        System.out.println("Soma da Matriz fixa: " + resultadoMatriz);

        executarComInputUsuario();
    }

    public static int calcularSomaVetor(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static int calcularSomaMatriz(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public static void executarComInputUsuario() {
        int[] vetSoma = new int[3];
        for (int i = 0; i < vetSoma.length; i++) {
            vetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        }

        int total = calcularSomaVetor(vetSoma);
        System.out.println("Soma total do input: " + total);
    }
}
