import lista.ListaEncadeada;

public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.adiciona(1);
        lista.adiciona(5);
        lista.adiciona(2);
        System.out.println(lista.toString());

        ListaEncadeada<Integer> lista2 = new ListaEncadeada<Integer>();
        lista2.adicionaInicio(1);
        lista2.adicionaInicio(5);
        lista2.adicionaInicio(2);
        System.out.println(lista2.toString());

    }
}
