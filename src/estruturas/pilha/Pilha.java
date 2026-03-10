package estruturas.pilha;

// push - Adiciona um elemento no topo
// pop - Remove e retorna o elemento do topo
// peek - Apenas espia o topo sem remover


public class Pilha {
    private int[] elementos;
    private int topo;
    private int capacidade;


    public Pilha(int tamanho) {
        this.capacidade = tamanho;
        this.elementos = new int[tamanho];
        this.topo = -1; // Indica que a pilha está vazia
    }

    public void push(int valor) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow: A pilha está cheia!");
        }
        elementos[++topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Empty: A pilha está vazia!");
        }
        return elementos[topo--];
    }

    public int peek() {
        if (isEmpty()) return -1;
        return elementos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == capacidade - 1;
    }

    public void exibirPilha() {
        if (isEmpty()) {
            System.out.println("\n[ ] Pilha vazia");
            return;
        }
        System.out.println("\n--- Estado Atual da Pilha ---");
        for (int i = topo; i >= 0; i--) {
            System.out.println("| " + elementos[i] + " |" + (i == topo ? " <- TOPO" : ""));
        }
        System.out.println("-------");
    }
}