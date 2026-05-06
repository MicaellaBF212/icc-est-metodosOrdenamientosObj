import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] persona = {
            new Person("Juan",25),
            new Person("Ana",19),
            new Person("Carlos",30),
            new Person("Maria",22),
            new Person("Diego",15),
        };
        //Imprimir
        //Ordenar
        //Imprimir

        for (Person person : persona){
            System.out.println(person);
        }
        System.out.println("------Ordenadas por edad------");
        PersonController(persona);
    }
}
