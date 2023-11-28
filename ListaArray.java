package exemplos;
import java.util.ArrayList;
 
public class ListaArray {
    public static void main(String[] args) {
        // Criar um ArrayList
        ArrayList<Integer> lista = new ArrayList<>();
 
        // Adicionar elementos ao ArrayList
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
 
        // Exibir o ArrayList antes da adi��o
        System.out.println("ArrayList antes da adi��o: " + lista);
 
        // Adicionar um novo elemento ao ArrayList
        int novoElemento = 6;
        lista.add(novoElemento);
 
        // Exibir o ArrayList ap�s a adi��o
        System.out.println("ArrayList ap�s a adi��o: " + lista);
    }
}
