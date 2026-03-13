package estruturas.pilha;

public class Exemplo1 {

    public static void main (String[] args){
        Pilha minhaPilha = new Pilha(5);

        for(int i = 1; i <= 5; i++){
            minhaPilha.push(i * 10);
            minhaPilha.printStack();
        }

        System.out.println("No topo agora: " + minhaPilha.peek());

        int removido = minhaPilha.pop();
        System.out.println("Removi o: " + removido);

        System.out.println("Novo topo: " + minhaPilha.peek());

        minhaPilha.printStack();
    }
}
