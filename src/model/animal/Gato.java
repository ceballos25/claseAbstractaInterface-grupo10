package model.animal;

import interfaces.Asegurable;
import interfaces.Vacunable;

public class Gato extends Animal implements Vacunable, Asegurable {
    protected boolean esEsterilizado;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre,edad,nombreDueno);
        this.costoConsulta = calcularCostoConsulta();
        this.esEsterilizado = esEsterilizado;
    }

    public double calcularCostoConsulta(){
        return 38000;
    }

    @Override
    public void registratVacuna(String nombre) {

    }

    @Override
    public int getVacunasAplicadas() {
        return 0;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "";
    }
}
