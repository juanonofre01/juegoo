/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leydeohm;

import java.util.Scanner;

/**
 *
 * @author PC
 */

public class LeyDeOhm {

    private static double calcularVoltaje(double corriente, double resistencia) {
        double voltaje = 0;
        return voltaje / resistencia; 
    }

    private static double calcularResistencia(double voltaje, double corriente) {
        double resistencia = 0;
        return corriente * resistencia;
    }
    
    public static double calcularCorriente(double voltaje, double resistencia) {
        return voltaje / resistencia;
    }

    /**
     * @param args the command line arguments
     */
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(" Elija que quiere calcular ");
        System.out.print(" (1) corriente: Amperaje ");
        System.out.print(" (2) voltaje: Voltios ");
        System.out.print(" (3) Resistencia: ohmios ");
        Scanner sc = new Scanner(System.in);

        
        int eleccion = (int) sc.nextDouble();
            if (eleccion==1) {


            System.out.print(" Ingrese el valor de la diferencia de potencial (V): ");
            double voltaje = sc.nextDouble();
            
            System.out.print(" Ingrese el valor de la resistencia (R): ");
            double resistencia = sc.nextDouble();
            
            double corriente = calcularCorriente(voltaje, resistencia);
            
            System.out.println(" La corriente es: " + corriente + " Amperios");
            }
        
            if(eleccion==2){


                System.out.print("Ingrese el valor de la corriente (I): ");
                double corriente = sc.nextDouble();

                System.out.print("Ingrese el valor de la resistencia (R): ");
                double resistencia = sc.nextDouble();

                double voltaje = calcularVoltaje(corriente, resistencia);

                System.out.println(" El voltaje es: " + voltaje + " Voltios");
            }
            
            if (eleccion==3) {
            System.out.print(" Ingrese el valor del voltaje (V): ");
            double voltaje = sc.nextDouble();
            
            System.out.print(" Ingrese el valor de la corriente (I): ");
            double corriente = sc.nextDouble();
            
            double resistencia = calcularResistencia(voltaje, corriente);
            
            System.out.println(" La resistencia es: " + resistencia + " Ohmios");
            }
        
        }
}
