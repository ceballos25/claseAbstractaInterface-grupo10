package model.animal;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String nombreDueno;
    protected double costoConsulta;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }


    public abstract double calcularCostoConsulta();

    public String fichaPresentacion() {
        return "Ficha de presentación\n" + "Nombre: " + nombre + "\nEdad: " +
                edad + "\nNombre dueño: " + nombreDueno + "\nCosto consulta: " +
                calcularCostoConsulta();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }
}