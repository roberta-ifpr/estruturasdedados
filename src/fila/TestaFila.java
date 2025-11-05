package fila;
import java.util.LinkedList;
import java.util.Queue;
public class TestaFila {
    public static void main(String[] args) {
        Queue fila = new LinkedList<>();
        fila.add("Atendimento 1");
        fila.add("Atendimento 2");
        fila.add("Atendimento 3");

        System.out.println(fila);
        System.out.println(fila.peek());
        fila.remove();
        System.out.println(fila);
        
    }
    
}
