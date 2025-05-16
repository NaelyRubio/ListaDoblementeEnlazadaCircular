/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_uc2_229324_ldec;

/**
 *
 * @author naely
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ListaDoblementeEnlazadaCircular lista = new ListaDoblementeEnlazadaCircular();

        System.out.println("¿La lista está vacía?: " + lista.isEmpty());
        System.out.println("Tamaño actual: " + lista.size());

        System.out.println("\n-- Agregando elementos al inicio --");
        lista.addFirst(30);
        lista.addFirst(20);
        lista.addFirst(10);
        System.out.println("Lista: " + lista);
        System.out.println("Tamaño: " + lista.size());

        System.out.println("\n-- Agregando elementos al final --");
        lista.addLast(40);
        lista.addLast(50);
        System.out.println("Lista: " + lista);
        System.out.println("Tamaño: " + lista.size());

        System.out.println("\n-- Contiene 20?: " + lista.contains(20));
        System.out.println("Contiene 100?: " + lista.contains(100));

        System.out.println("\n-- Obtener elemento en posición 2 --");
        System.out.println("Elemento: " + lista.getElement(2));

        System.out.println("\n-- Eliminar primer elemento --");
        lista.removeFirst();
        System.out.println("Lista: " + lista);
        System.out.println("Tamaño: " + lista.size());

        System.out.println("\n-- Eliminar último elemento --");
        lista.removeLast();
        System.out.println("Lista: " + lista);
        System.out.println("Tamaño: " + lista.size());

        System.out.println("\n-- Limpiar lista --");
        lista.clear();
        System.out.println("Lista: " + lista);
        System.out.println("Tamaño: " + lista.size());
        System.out.println("¿Está vacía?: " + lista.isEmpty());
    }
}
