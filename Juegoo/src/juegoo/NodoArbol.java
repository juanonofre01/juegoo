/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoo;

/**
 *
 * @author PC
 */
public class NodoArbol {
    int dato;
    String nombre;
    NodoArbol hijoIzquierdo, hijoderecho;
    
    public NodoArbol(int d, String nom){
        this.dato=d;
        this.nombre=nom;
        this.hijoIzquierdo=null;
        this.hijoderecho=null;
    }
    
    public String toString(){
        return nombre + " su dato es "+ dato;
    }
}
