/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.*;
/**
 *
 * @author DAW130
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Animal can = new Animal();
    Animal gato = new Animal("Gato", "Kity", 15);
    can.ModificaNome("Marcelo");
    System.out.println("El perro se llama " +can.DevolveNome());
    Animal elefante = new Animal("Elefante","Dumbo",1700);
    Responsable dono1 = new Responsable("Samuel","Vila",elefante);
    System.out.println("El dueño de la mascota es " +dono1.NomeMascota());
    
    }
    
}
