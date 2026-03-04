package estruturas;

public class Pilha {
     //push - empilhar
     //pop - desempilhar
     //peek - pegar e manipular o elemento topo

    public static void main(String[] args) {
        simularPilha();
    }

    public static void simularPilha() {
        int[] pilha = new int[3];
        int topo = -1; // Indica que a pilha está vazia

        // Elementos para empilhar
        int[] valoresParaInserir = {5, 8, 4, 7};

        // Empilhar: 5, 8, 4, 7
        for (int valor : valoresParaInserir) {
            if (topo < pilha.length - 1) {
                topo++;
                pilha[topo] = valor;
                System.out.println("Empilhado: " + valor);
            } else {
                System.out.println("Pilha cheia!");
            }
        }

        // Desempilhar duas vezes
        for (int i = 0; i < 2; i++) {
            if (topo >= 0) {
                System.out.println("Desempilhado: " + pilha[topo]);
                topo--;
            } else {
                System.out.println("Pilha vazia!");
            }
        }

        // Consulta do topo
        if (topo >= 0) {
            System.out.println("Topo atual: " + pilha[topo]);
        } else {
            System.out.println("Pilha vazia!");
        }

        // Desempilhar mais duas vezes
        for (int i = 0; i < 2; i++) {
            if (topo >= 0) {
                System.out.println("Desempilhado: " + pilha[topo]);
                topo--;
            } else {
                System.out.println("Pilha vazia!");
            }
        }
    }

}
