package model.animal;

import interfaces.Asegurable;
import interfaces.Vacunable;

public class Perro extends Animal implements Vacunable, Asegurable {
    private String raza;

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre,edad,nombreDueno);
        this.costoConsulta = calcularCostoConsulta();
        this.raza = raza;
    }

    public double calcularCostoConsulta(){
        return 45000 + (3000 * getEdad());
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
        return (8000 * getEdad());

    }

    @Override
    public String obtenerNumeroPoliza() {
        return "";
    }
}
