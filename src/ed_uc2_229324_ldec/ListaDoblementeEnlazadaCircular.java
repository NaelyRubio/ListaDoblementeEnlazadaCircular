/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_uc2_229324_ldec;

/**
 *
 * @author naely
 */
public class ListaDoblementeEnlazadaCircular {
    
 private nodoLDEC inicio;
    private int tam;

    public ListaDoblementeEnlazadaCircular() {
        this.inicio = null;
        this.tam = 0;
    }

    /**
     * Verifica si la lista está vacía
     */
    public boolean isEmpty() {
        return inicio == null;
    }

    /**
     * Devuelve el tamaño de la lista
     */
    public int size() {
        return tam;
    }

    /**
     * Inserta un nodo al inicio
     */
    public boolean addFirst(int dato) {
        nodoLDEC nuevo = new nodoLDEC(dato);
        if (isEmpty()) {
            nuevo.siguiente = nuevo.anterior = nuevo;
            inicio = nuevo;
        } else {
            nodoLDEC ultimo = inicio.anterior;
            nuevo.siguiente = inicio;
            nuevo.anterior = ultimo;
            inicio.anterior = nuevo;
            ultimo.siguiente = nuevo;
            inicio = nuevo;
        }
        tam++;
        return true;
    }

    /**
     * Inserta un nodo al final
     */
    public boolean addLast(int dato) {
        if (addFirst(dato)) {
            inicio = inicio.siguiente; // Mover el inicio para que el nuevo nodo quede al final
            return true;
        }
        return false;
    }

    /**
     * Elimina el primer nodo
     */
    public boolean removeFirst() {
        if (isEmpty()) return false;

        if (tam == 1) {
            inicio = null;
        } else {
            nodoLDEC ultimo = inicio.anterior;
            inicio = inicio.siguiente;
            inicio.anterior = ultimo;
            ultimo.siguiente = inicio;
        }
        tam--;
        return true;
    }

    /**
     * Elimina el último nodo
     */
    public boolean removeLast() {
        if (isEmpty()) return false;

        if (tam == 1) {
            inicio = null;
        } else {
            nodoLDEC ultimo = inicio.anterior;
            nodoLDEC nuevoUltimo = ultimo.anterior;
            nuevoUltimo.siguiente = inicio;
            inicio.anterior = nuevoUltimo;
        }
        tam--;
        return true;
    }

    /**
     * Verifica si un dato está en la lista
     */
    public boolean contains(int dato) {
        if (isEmpty()) return false;
        nodoLDEC actual = inicio;
        do {
            if (actual.dato == dato) return true;
            actual = actual.siguiente;
        } while (actual != inicio);
        return false;
    }

    /**
     * Obtiene el elemento en la posición indicada
     */
    public int getElement(int index) {
        if (index < 0 || index >= tam) return Integer.MIN_VALUE;
        nodoLDEC actual = inicio;
        for (int i = 0; i < index; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    /**
     * Elimina todos los elementos de la lista
     */
    public void clear() {
        inicio = null;
        tam = 0;
    }

    /**
     * Devuelve una representación en texto de la lista
     */
    public String toString() {
        if (isEmpty()) return "Lista vacía";
        StringBuilder sb = new StringBuilder();
        nodoLDEC actual = inicio;
        do {
            sb.append(actual.dato).append(" <-> ");
            actual = actual.siguiente;
        } while (actual != inicio);
        return sb.append("(circular)").toString();
    }
} 
