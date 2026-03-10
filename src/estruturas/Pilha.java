package estruturas;

// push - Adiciona um elemento no topo
// pop - Remove e retorna o elemento do topo
// peek - Apenas espia o topo sem remover


public class Pilha {
    private int[] elementos;
    private int topo;
    private int capacidade;

    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha(5);

        minhaPilha.push(10);
        minhaPilha.push(20);
        minhaPilha.push(30);
        minhaPilha.push(40);
        minhaPilha.push(50);

        System.out.println("No topo agora: " + minhaPilha.peek()); // Saída: 30

        int removido = minhaPilha.pop();
        System.out.println("Removi o: " + removido); // Saída: 30

        System.out.println("Novo topo: " + minhaPilha.peek()); // Saída: 20

        minhaPilha.exibirPilha();

    }

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