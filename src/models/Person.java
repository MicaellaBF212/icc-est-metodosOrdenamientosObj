package models;

import java.util.Arrays;

public class Person {
    private String name;
    private int edad;
    private int[] notas;
    

    public Person(String name, int edad, int[] notas) {
        this.name = name;
        this.edad = edad;
        this.notas = notas;

    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", edad=" + edad + ", notas=" + Arrays.toString(notas) + ", Valor nombre= " + valueName()+ "]";
    }



    public int getPromedio(){
        //Calcular el promedio
        //(SUMO todas las notas)/cantidad de notas o arreglo
        int suma = 0;
        for (int i : notas) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public int valueName(){
        int value = 0;
        for(int i = 0; i<name.length();i++){
            char letra = name.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
                value += 5;
            else 
                value += edad;
        }
        return value;
    }
}
