package pilha;

import java.util.LinkedList;
import java.util.Stack;

public class TestaPilhaJava {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("Elemento 1");
        pilha.push("Elemento 2");
        pilha.push("Elemento 3");
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
    }
}
