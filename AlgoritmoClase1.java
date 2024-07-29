/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmoclase1;
import java.util.Scanner;

/**
 *
 * @author Ricardo Menjivar
 */
public class AlgoritmoClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        //Definicion de variables
        int i, numArticulos;
        String nomv, nomc;
        double dx, dy, dz, tp;
        numArticulos=3; dx=0.03; dy=0.04; dz=0.05; tp=0;

        //Definicion de arreglos
        String[] nom = new String[numArticulos];// Nombre articulos
        double[] pn = new double[numArticulos]; // Precio nombre
        double[] c = {dx, dy, dz};        // Descuentos
        double[] pd = new double[numArticulos]; // Precio con descuento

        //Entrada
        System.out.print("Ingresa el nombre del vendedor: ");
        nomv = entrada.nextLine();

        System.out.print("Ingresa el nombre del cliente: ");
        nomc = entrada.nextLine();

    
        for (i=0; i<numArticulos; i++)
        {
                System.out.print("Ingresa el nombre del producto N°"+ (i+1)+" :");
                nom[i] = entrada.nextLine();

                System.out.print("Ingresa el precio del producto N°"+ (i+1)+" :");
                pn[i] = Double.parseDouble(entrada.nextLine());

                // Calcular precio con descuento
                pd[i] = pn[i] * (1- c[i]);
        }

        // Calcular total a pagar
        for (i=0; i<numArticulos; i++)
        {
         tp = pd[i];
        }
        //Salida

        System.out.print("Nombre del vendedor: "+nomv + ". Nombre del cliente: "+nomc+"\n");

        for (i=0; i<numArticulos; i++)
        {
            System.out.print("Articulo "+(i+1)+": " + pn[i] +"\n");
            System.out.print("Precio del articulo "+(i+1)+": " +pn[i] + "\n");
            System.out.print("Precio con descuento del articulo " + (i+1) + ": " + pd[i] + "\n");            
        }
        System.out.print("Total a pagar: "+tp);
    }
}
