package pilha;

public class Pilha<T> {
    private No<T> inicio = null;
    private No<T> fim = null;
    private int tamanho = 0;

    // adiciona um elemento no final
    public void emplilha(T elemento) {
        No<T> novoNo = new No<T>(elemento);
        if (tamanho == 0) {
            this.inicio = novoNo;
        } else {
            this.fim.setProximo(novoNo);
        }
        this.fim = novoNo;
        this.tamanho++;
    }

    public No<T> busca(int posicao) {
        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }

    // retorna o elemento de uma posição
    public T get(int posicao) {
        return busca(posicao).getElemento();
    }

    // retorna a quantidade de nós
    public int tamanho() {
        return this.tamanho;
    }

    // percorre a lista e imprime seus elementos
    public void percorre() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.println(atual.getElemento());
            atual = atual.getProximo();
        }
    }

    // busca um elemento pelo valor
    public int buscaElemento(T elemento) {
        No<T> atual = inicio;
        int pos = 0;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return pos;
            }
            atual = atual.getProximo();
            pos++;
        }
        return -1; // não encontrado
    }

    // remove do final
    public void desempilha() {
        if (tamanho == 0) {
            throw new IllegalStateException("pilha vazia");
        }
        if (tamanho == 1) {
            this.inicio = null;
            this.fim = null;
        } else {
            No<T> penultimo = busca(tamanho - 2);
            penultimo.setProximo(null);
            this.fim = penultimo;
        }
        this.tamanho--;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        No<T> atual = inicio;
        while (atual != null) {
            sb.append(atual.getElemento());
            if (atual.getProximo() != null) {
                sb.append(", ");
            }
            atual = atual.getProximo();
        }
        sb.append("]");
        return sb.toString();
    }
}
