package model.animal;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre,edad,nombreDueno);
        this.costoConsulta = calcularCostoConsulta();
        this.raza = raza;
    }

    public double calcularCostoConsulta(){
        return 45000 + (3000 * getEdad());
    }

}
