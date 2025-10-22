package lista;

public class ListaEncadeada<T> {
    private No<T> inicio = null;
    private No<T> fim = null;
    private int tamanho = 0;

    // adiciona um elemento
    public void adiciona(T elemento) {
        No<T> novoNo = new No<T>(elemento);
        if (tamanho == 0) {
            this.inicio = novoNo;
        } else {
            this.fim.setProximo(novoNo);
        }
        this.fim = novoNo;
        this.tamanho++;
    }

    public void adicionaInicio(T elemento) {
        No<T> novoNo = new No<T>(elemento);
        if (tamanho == 0) {
            this.fim = novoNo;

        } else {
            novoNo.setProximo(inicio);
        }
        this.inicio = novoNo;
        this.tamanho++;
    }


    public No<T> busca(int posicao){
        No<T> noAtual = this.inicio;
        for(int i =0;i<posicao;i++){
            noAtual=noAtual.getProximo();
        }
        return noAtual;
    }

    public void adiciona(int posicao, T elemento){
        if (posicao==0){
            this.adicionaInicio(elemento);
        }else{
            if(posicao == tamanho){
                this.adiciona(elemento);
            }else{
                No<T> noAnterior = busca(posicao-1);
                No<T> proximoNo = noAnterior.getProximo(); //ou busca(posicao);
                No<T> novoNo = new No<T>(elemento);
                noAnterior.setProximo(novoNo);
                novoNo.setProximo(proximoNo);
                this.tamanho++;
            }
        }
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + ", fim=" + fim + ", tamanho=" + tamanho + "]";
    }

}
