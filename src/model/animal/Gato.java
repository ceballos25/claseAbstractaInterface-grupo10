package model.animal;

public class Gato extends Animal {
    protected boolean esEsterilizado;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre,edad,nombreDueno);
        this.costoConsulta = calcularCostoConsulta();
        this.esEsterilizado = esEsterilizado;
    }

    public double calcularCostoConsulta(){
        return 38000;
    }
}
