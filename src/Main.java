import interfaces.Vacunable;
import interfaces.Asegurable;
import model.animal.Animal;
import model.animal.Gato;
import model.animal.Perro;
import model.animal.Ave;

public class Main {
    public static void main(String[] args) {


        // 1
        Animal perro = new Perro("Rex",    5, "Carlos",  "Labrador");
        Animal gato  = new Gato ("Misu",   3, "Valeria", true);
        Animal ave   = new Ave  ("Piolín", 2, "Miguel",  150.0);


        // 2
        System.out.println("FICHAS");
        perro.fichaPresentacion();
        gato.fichaPresentacion();
        ave.fichaPresentacion();

        // 3
        System.out.println("VACUNAS");

        if (perro instanceof Vacunable) {
            Vacunable vPerro = (Vacunable) perro;
            vPerro.registratVacuna("Rabia");
            vPerro.registratVacuna("Parvovirus");
            System.out.println("Vacunas de Rex: " + vPerro.getVacunasAplicadas());
        }

        if (gato instanceof Vacunable) {
            Vacunable vGato = (Vacunable) gato;
            vGato.registratVacuna("Panleucopenia");
            vGato.registratVacuna("Calicivirus");
            System.out.println("Vacunas de Misu: " + vGato.getVacunasAplicadas());
        }

        // 4
        System.out.println("PÓLIZAS");
        Clinica clinica = new Clinica("VetCare", "Calle 45 #12-30");

        Asegurable[] asegurables = {
                (Asegurable) perro,
                (Asegurable) gato,
                clinica
        };

        for (Asegurable a : asegurables) {
            System.out.println("Póliza : " + a.obtenerNumeroPoliza());
            System.out.printf ("Prima  : $%.0f%n%n", a.calcularPrimaSeguro());
        }

        // 5
        System.out.println("CONEJO");
        Animal conejo = new Conejo("Bunny", 1, "Laura");
        conejo.imprimirFicha();


    }
}
