/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoo;

/**
 *
 * @author PC
 */
public class ArbolBinario {
    NodoArbol raiz;
    public ArbolBinario(){
        raiz=null;
    }
    //metodo para incertar un nodo en el arbol
    public void agregarNodo(int d, String nom){
        NodoArbol nuevo = new NodoArbol(d, nom);
        if (raiz==null) {
            raiz=nuevo;
        }else{
            NodoArbol auxiliar=raiz;
            NodoArbol padre;
            
            while (true) {
                padre=auxiliar;
                
                if (d<auxiliar.dato) {
                    auxiliar=auxiliar.hijoIzquierdo;
                    
                    if (auxiliar==null) {
                        padre.hijoIzquierdo=nuevo;
                        return;
                    }
                }else{
                    auxiliar=auxiliar.hijoderecho;
                    if (auxiliar==null) {
                        padre.hijoderecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    //metodo para saber cuando el arbol esta vacio
    public boolean estaVacio(){
        return raiz==null;
    }
    //metodo para recorrer el arbol InOrden
    public void inOrden(NodoArbol r){
        if (r!=null) {
            inOrden(r.hijoIzquierdo);
            System.err.println(r.dato);
            inOrden(r.hijoderecho);
        }
    }
    //metodo para recorrer el arbol PreOrden
    
    public void preOrden(NodoArbol r){
        if (r!=null) {
            System.err.println(r.dato);
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoderecho);
        }
    }
    
    //metodo para recorrer el arbol postOrden
    
    public void postOrden(NodoArbol r){
        if (r!=null) {
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoderecho);
            System.err.println(r.dato);
        }
    }
}
