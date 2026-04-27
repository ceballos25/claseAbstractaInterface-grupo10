import model.animal.Animal;
import model.animal.Gato;
import model.animal.Perro;
import model.animal.Ave;

public class Main {
    public static void main(String[] args) {
         Animal perro1 = new Perro("Pepito",3,"Fabian Moreno","Pitbull");
         Animal gato1 = new Gato("Michi",5,"Andrez Gomez", false);
         Animal ave1 = new Ave("Ave Maria", 3,"Laura Castro", 500);

        //System.out.println(perro1.fichaPresentacion());
        //System.out.println(perro1.fichaPresentacion());
        System.out.println(ave1.fichaPresentacion());


    }
}
