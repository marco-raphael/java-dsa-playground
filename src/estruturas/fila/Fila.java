package estruturas.fila;

// enqueue - Adiciona um elemento no final da fila
// dequeue - Remove e retorna o elemento do início da fila
// peek - Espia o início sem remover
// printQueue - Espia a fila inteira

public class Fila {
    private final int[] dados;
    private int inicio;
    private int fim;
    private int tamanho;
    private final int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public void enqueue(int valor) {
        if (isFull()) {
            throw new RuntimeException("Queue Overflow: A fila está cheia!");
        }
        // Avança o fim de forma circular
        fim = (fim + 1) % capacidade;
        dados[fim] = valor;
        tamanho++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue Empty: A fila está vazia!");
        }
        int valorRemovido = dados[inicio];
        // Avança o início de forma circular
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return valorRemovido;
    }

    public int peek() {
        if (isEmpty()){
            throw new RuntimeException("Queue Empty: Não é possível espiar uma fila vazia!");
        }
        return dados[inicio];
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("\n[ ] Fila vazia");
            return;
        }

        System.out.println("\n--- Estado Atual da Fila ---");
        System.out.print("Início -> ");

        for (int i = 0; i < tamanho; i++) {
            int indiceReal = (inicio + i) % capacidade;
            System.out.print("| " + dados[indiceReal] + " | ");
        }

        System.out.println("<- Fim");
        System.out.println("-------");
    }
}