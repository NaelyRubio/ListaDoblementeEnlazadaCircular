/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_uc2_229324_ldec;

/**
 *
 * @author naely
 */
public class nodoLDEC {

    int dato;
    nodoLDEC anterior;
    nodoLDEC siguiente;

    public nodoLDEC(int dato) {
        this.dato = dato;
        this.anterior = this.siguiente = null;
    }
}
