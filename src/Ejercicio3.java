import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        //En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
        //
        //Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
        //String[] nombres = {"", "", "", ""}

        List<String> listaCompra = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lista de la compra:");
        String objeto1 = scanner.nextLine();
        System.out.println("Añade otro elemento:");
        String objeto2 = scanner.nextLine();
        System.out.println("Añade el ultimo elemento:");
        String objeto3 = scanner.nextLine();

        listaCompra.add(objeto1);
        listaCompra.add(objeto2);
        listaCompra.add(objeto3);

        System.out.println("Esta es tu lista de la compra: ");

        for (String item : listaCompra){
            System.out.println(item);

        }
    }
}
