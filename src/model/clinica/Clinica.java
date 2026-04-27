package model.clinica;

import interfaces.Asegurable;


public class Clinica implements Asegurable {

    String nombre;
    String direccion;
    boolean asegurable;

    public Clinica(String nombre, String direccion, boolean asegurable) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.asegurable = asegurable;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 5000000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "";
    }
}
