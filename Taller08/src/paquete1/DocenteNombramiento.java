/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

public class DocenteNombramiento extends Docente {

    private double sueldoBasico;
    private double valorExtra;
    private int numeroExtra;
    private double sueldoTotal;

    public void establecerSueldoBasico(double sb) {
        sueldoBasico = sb;
    }

    public void establecerValorExtra(double v) {
        valorExtra = v;
    }

    public void establecerNumeroExtra(int n) {
        numeroExtra = n;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (valorExtra * numeroExtra);
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerValorExtra() {
        return valorExtra;
    }

    public int obtenerNumeroExtra() {
        return numeroExtra;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombres: %s"
                + "\nIdentificación: %s"
                + "\nSueldo base: %.2f"
                + "\nNúmero de horas extras: %d"
                + "\nValor horas extra: %.2f"
                + "\nSueldo total: %.1f\n",
                obtenerNombre(),
                obtenerCedula(),
                obtenerSueldoBasico(),
                obtenerNumeroExtra(),
                obtenerValorExtra(),
                obtenerSueldoTotal());

        return reporte;
    }
}
