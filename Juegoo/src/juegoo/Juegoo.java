/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegoo;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Juegoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0, elemento;
        String nombre;
        ArbolBinario arbolito = new ArbolBinario();
        
        do{
            try {
                opcion= Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo\n"
                        + "2. Recorer el arbol InOrden\n"
                        + "3. Recorer el arbol en PreOrden\n"
                        + "4. Recorer el arbol en PostOrden\n"
                        + "5. Salir\n"
                        + "Elije una opcion...","Arboles Binarios"
                        , JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el numero del nodo","Agregando Nodo",
                                JOptionPane.QUESTION_MESSAGE));
                        nombre=JOptionPane.showInputDialog(null,
                                "Ingresa el nombre del juego...",
                                JOptionPane.QUESTION_MESSAGE);
                        arbolito.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if (!arbolito.estaVacio()) {
                            arbolito.inOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, " El Arbol esta vacío",
                                "Cuidado", JOptionPane.QUESTION_MESSAGE);                        }
                        break;
                    case 3:
                        if (!arbolito.estaVacio()) {
                            arbolito.preOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, " El Arbol esta vacío",
                                "Cuidado", JOptionPane.QUESTION_MESSAGE);                        }
                        break;
                        
                    case 4:
                        if (!arbolito.estaVacio()) {
                            arbolito.postOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, " El Arbol esta vacío",
                                "Cuidado", JOptionPane.QUESTION_MESSAGE);                        }
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada",
                                "Fin", JOptionPane.QUESTION_MESSAGE);
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta",
                                "Cuidado", JOptionPane.QUESTION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, " Error " + n.getMessage());
            }
        }while (opcion!=5);
    }
    
}
