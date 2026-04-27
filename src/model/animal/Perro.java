package model.animal;

import interfaces.Asegurable;
import interfaces.Vacunable;

import java.util.ArrayList;
import java.util.List;

public class Perro extends Animal implements Vacunable, Asegurable {
    private String raza;
    private List<String> vacunas = new ArrayList<>();

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre,edad,nombreDueno);
        this.costoConsulta = calcularCostoConsulta();
        this.raza = raza;
    }

    public double calcularCostoConsulta(){
        return 45000 + (3000 * getEdad());
    }

    @Override
    public void registraVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return 0;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000 * getEdad();

    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + nombre.toUpperCase().replace(" ", "_");
    }
}
