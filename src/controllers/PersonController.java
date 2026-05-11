package controllers;

import models.Person;

public class PersonController {

    //Metodo que ordena un arreglo de persona 
    //por su EDAD (age), con metodo insercion.
    public void sortPersonByAge(Person[] personas){
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i-1;
            while(j>=0 && personas[j].getEdad()> aux.getEdad()){
                personas[j+1] =personas[j];
                j--;
            }
            personas[j+1] = aux;
        }
    }
    //Metodo que ordena un arreglo de persona
    //por su Nombre(name), con un metodo 
    public void sortPersonByName(Person[] personas){
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i-1;
            while(j>=0 && personas[j].getName().compareTo(aux.getName())>0){
                personas[j+1] =personas[j];
                j--;
            }
            personas[j+1] = aux;
        }
    }
    // Metodo ordena las personas segun el Promedio de sus notas con seleccion
    public void sortPersonbyAvrNotas(Person[] personas){
        for (int i = 0; i < personas.length; i++) {
            int index = i;

            for(int j = i+1; j<personas.length; j++){
                //Comparacion para actualizar el indice
                if(personas[j].getEdad()<personas[index].getEdad()){
                    index = j;
                }
            }
            // pregunto si el index != de i 
            // entonces cambio posiciones
            if (i != index) {
                Person aux = personas[i];
                personas[i] = personas[index];
                personas[index] = aux;
                
            }
            
        }
    }

    /*
    Ordenar el arreglo de personas por un valor de su nombre, el valor del nombre sera la cantidad de letras, donde las vocales 
    valen 5 y consonantes valen el valor de la edad 
    ej: Juan 20                             ej:Ana 80 
    20 + 5 + 5 + 20 = 50                    5 + 80 + 5 = 90
     */
    public void sortPersonByNameValue(Person[] personas){

    }
}
            
