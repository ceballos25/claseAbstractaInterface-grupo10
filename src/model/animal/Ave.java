package model.animal;

public class Ave extends Animal {
    protected double pesoGramos;

    public Ave(String nombre, int edad, String nombreDueno, double pesoGramos) {
        super(nombre,edad,nombreDueno);
        this.costoConsulta = calcularCostoConsulta();
        this.pesoGramos = pesoGramos;
    }

    public double calcularCostoConsulta(){
        return 28000 + (500 * getPesoGramos());
    }

    public double getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(double pesoGramos) {
        this.pesoGramos = pesoGramos;
    }
}
