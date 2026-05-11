import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas = {
            new Person("Juan",25,new int[] {10,15,20}),
            new Person("Ana",19,new int[] {15,15,20} ),
            new Person("Carlos",30,new int[] {10,10,10}),
            new Person("Maria",22,new int[] {20,15,20}),
            new Person("Diego",15,new int[] {20,10,20}),
        };
        //Imprimir
        //Ordenar
        //Imprimir

        System.out.println("------Original-----");
        for (Person person : personas){
            System.out.println(person);
        }

        PersonController orden = new PersonController();
        orden.sortPersonByAge(personas);

        System.out.println("------Ordenadas por edad------");
        for (Person person : personas) {
            System.out.println(person);
        }

        orden.sortPersonByName(personas);

        System.out.println("------Ordenadas por nombre------");
        for (Person person : personas) {
            System.out.println(person);
        }

        orden.sortPersonbyAvrNotas(personas);

        System.out.println("-----Ordenadas por promedio-----");
        for(Person person: personas){
            System.out.println(person);
        }

        orden.sortPersonByNameValue(personas);

        System.out.println("-------Valor de nombre -------");
        for (Person person : personas) {
            System.out.println(person);
        }
    }
}
