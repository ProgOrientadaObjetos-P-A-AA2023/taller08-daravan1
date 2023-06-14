/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese 1 para un estudiante a distancia y 2 para un estudiante presencial:");
            int op = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Ingrese nombres");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String cedula = entrada.nextLine();

            if (op == 1) {
                DocenteNombramiento docente = new DocenteNombramiento();
                docente.establecerNombre(nombre);
                docente.establecerNombre(cedula);

                System.out.println("Ingrese sueldo basico:");
                double sueldob = entrada.nextDouble();
                docente.establecerSueldoBasico(sueldob);

                System.out.println("Ingrese número de horas extras:");
                int horas = entrada.nextInt();
                docente.establecerNumeroExtra(horas);

                System.out.println("Ingrese valor de horas extras:");
                double valorh = entrada.nextDouble();
                docente.establecerValorExtra(valorh);

                docente.calcularSueldoTotal();
                System.out.printf("%s", docente);
                entrada.nextLine();

            } else if (op == 2) {

                DocenteFactura docente = new DocenteFactura();
                docente.establecerNombre(nombre);
                docente.establecerNombre(cedula);

                System.out.println("Ingrese el valor de la factura:");
                double valorf = entrada.nextDouble();

                docente.establecerValorFactura(valorf);
                docente.establecerIva();
                docente.calcularCancelar();

                System.out.printf("%s", docente);
                entrada.nextLine();

            } else {
                System.out.println("Opcion invalida\n");
            }
            System.out.println("Desea salir: ingrese 'S'");
            String salir = entrada.nextLine();
            if (salir.equals("S")) {
                bandera = false;
            }

        }
    }
}
