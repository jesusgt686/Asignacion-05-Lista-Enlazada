package linkedlist;

public class LinkedList {

    public static void main(String[] args) {
        
        ListaEnlazada<String> miLista = new ListaEnlazada<>();

        miLista.append("Perro");
        miLista.append("Gato");
        miLista.append("Pez");
        
        System.out.println("\nLista original:");
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println("Indice " + i + ": " + miLista.get(i));
        }
        
        System.out.println("Tamano inicial: " + miLista.size());

        miLista.insert("Pajaro", 1); 
        System.out.println("\nLista despues de insertar Pajaro:");
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println("Indice " + i + ": " + miLista.get(i));
        }

        String borrado = miLista.remove(0);
        System.out.println("\nSe borro el elemento: " + borrado);
        System.out.println("Lista despues del remove: ");
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(miLista.get(i));
        }

        System.out.println("\nLista invertida:");
        miLista.invertir();
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(miLista.get(i));
        }

        ListaEnlazada<String> lista2 = new ListaEnlazada<>();
        lista2.append("Tortuga");
        lista2.append("Hamster");
        
        miLista.concatenar(lista2);
        System.out.println("\nLista despues de concatenar las dos listas:");
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println("Indice " + i + ": " + miLista.get(i));
        }
        System.out.println("\nTamano despues de concatenar la segunda lista: " + miLista.size());

        miLista.clear();
        System.out.println("Tamano despues de usar clear: " + miLista.size());
    }
}