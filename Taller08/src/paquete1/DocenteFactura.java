/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA H
 */
public class DocenteFactura extends Docente {

    private double valorFactura;
    private double cancelar;
    private double iva;

    public void establecerValorFactura(double vf) {
        valorFactura = vf;
    }

    public void establecerIva() {
        iva = 0.1;
    }

    public void calcularCancelar() {
        cancelar = valorFactura - (valorFactura * iva);
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerCancelar() {
        return cancelar;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombres: %s"
                + "\nIdentificación: %s"
                + "\nValor factura: %.2f"
                + "\nIva: %.2f"
                + "\nValor a cancelar: %.2f\n",
                obtenerNombre(),
                obtenerCedula(),
                obtenerValorFactura(),
                obtenerIva(),
                obtenerCancelar());

        return reporte;
    }

}
