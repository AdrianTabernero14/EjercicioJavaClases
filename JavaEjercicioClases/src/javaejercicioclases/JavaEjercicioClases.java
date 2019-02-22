/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicioclases;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class JavaEjercicioClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona objeto1 = new Persona();

        System.out.println("Introduzca sus datos:"
                + "\n 1.Nombre:");
        objeto1.setNombre(sc.next());
        System.out.println("\n 2. Edad: ");
        objeto1.setEdad(sc.nextInt());
        System.out.println("\n 3. Sexo: ");
        objeto1.setSexo(sc.next().charAt(0));
        System.out.println("\n 4. Peso: ");
        objeto1.setPeso(sc.nextDouble());
        System.out.println("\n 5. Altura: ");
        objeto1.setAltura(sc.nextDouble());
        Persona objeto2 = new Persona();
        objeto2.setNombre(objeto1.getNombre());
        objeto2.setEdad(objeto1.getEdad());
        objeto2.setSexo(objeto1.getSexo());
        System.out.println("Introduce el peso del segundo objeto: ");
        objeto2.setPeso(sc.nextDouble());
        System.out.println("Introduce la altura del segundo objeto: ");
        objeto2.setAltura(sc.nextDouble());
        Persona objeto3 = new Persona("Manuel", 18, 'H', 75, 1.72);
        objeto1.generaDNI();
        objeto2.generaDNI();
        objeto3.generaDNI();
        System.out.println(objeto1);

        if (objeto1.calcularIMC() == -1) {
            System.out.println("Estas por debajo de tu peso ideal");
        } else if (objeto1.calcularIMC() == 0) {
            System.out.println("Estas en el peso ideal");
        } else if (objeto1.calcularIMC() == 1) {
            System.out.println("Tienes sobrepeso");
        }
        System.out.println(objeto2);
        ;
        if (objeto2.calcularIMC() == -1) {
            System.out.println("Estas por debajo de tu peso ideal");
        } else if (objeto2.calcularIMC() == 0) {
            System.out.println("Estas en el peso ideal");
        } else if (objeto2.calcularIMC() == 1) {
            System.out.println("Tienes sobrepeso");
        }
        System.out.println(objeto3);

        if (objeto3.calcularIMC() == -1) {
            System.out.println("Estas por debajo de tu peso ideal");
        } else if (objeto3.calcularIMC() == 0) {
            System.out.println("Estas en el peso ideal");
        } else if (objeto3.calcularIMC() == 1) {
            System.out.println("Tienes sobrepeso");
        }

        if (objeto1.esMayorDeEdad() == true) {
            System.out.println(objeto1.getNombre() + " Es mayor de edad");
        } else {
            System.out.println(objeto1.getNombre() + " No es mayor de edad");
        }

        if (objeto2.esMayorDeEdad() == true) {
            System.out.println(objeto2.getNombre() + " Es mayor de edad");
        } else {
            System.out.println(objeto2.getNombre() + " No es mayor de edad");
        }

        if (objeto3.esMayorDeEdad() == true) {
            System.out.println(objeto3.getNombre() + " Es mayor de edad");
        } else {
            System.out.println(objeto3.getNombre() + " No es mayor de edad");
        }

        System.out.println(objeto1);
        System.out.println(objeto2);
        System.out.println(objeto3);
    }

}
