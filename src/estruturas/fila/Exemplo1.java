package estruturas.fila;

public class Exemplo1 {
    public static void main(String[] args) {
        // Criando uma fila com capacidade para 5 senhas de atendimento
        System.out.println("🏦 Iniciando o sistema de senhas (Capacidade: 5)");
        Fila filaAtendimento = new Fila(5);

        // 1. Enfileirando (Chegaram 3 clientes)
        System.out.println("\n--- 📥 Entrada de Clientes ---");
        filaAtendimento.enqueue(101);
        filaAtendimento.enqueue(102);
        filaAtendimento.enqueue(103);
        filaAtendimento.printQueue();
        // Esperado: Início -> | 101 | | 102 | | 103 | <- Fim

        // 2. Espiando (Quem é o próximo?)
        System.out.println("\n👀 Próximo a ser atendido (peek): " + filaAtendimento.peek());

        // 3. Desenfileirando (Atendendo 2 clientes)
        System.out.println("\n--- ✅ Atendimento ---");
        System.out.println("Cliente chamado: " + filaAtendimento.dequeue());
        System.out.println("Cliente chamado: " + filaAtendimento.dequeue());
        filaAtendimento.printQueue();
        // Esperado: Início -> | 103 | <- Fim (Sobraram espaços nos índices 0 e 1)

        // 4. Testando a Mágica Circular (Enchendo a fila com os espaços que sobraram)
        System.out.println("\n--- 🔄 Forçando a Volta Circular ---");
        System.out.println("Chegaram mais 4 clientes...");
        filaAtendimento.enqueue(104);
        filaAtendimento.enqueue(105);
        filaAtendimento.enqueue(106);
        // O cliente 107 vai ocupar o índice 0 do array físico, pois o ponteiro deu a volta!
        filaAtendimento.enqueue(107);

        filaAtendimento.printQueue();
        // Esperado na tela (ordem lógica): Início -> | 103 | | 104 | | 105 | | 106 | | 107 | <- Fim

        // 5. Verificando o estado final
        System.out.println("\nA fila está cheia? " + (filaAtendimento.isFull() ? "\nSim" : "\nNao"));

        // Se você tentar adicionar mais um aqui (ex: filaAtendimento.enqueue(108);)
        // o programa vai lançar aquela exceção "Queue Overflow" que criamos!
    }
}
