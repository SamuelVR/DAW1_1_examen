/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author DAW130
 */
public class Animal {
    private String especie;
    private String nome;
    private int peso;
    
    public Animal(){
    }

    public Animal(String especie, String nome, int peso){
        this.especie = especie;
        this.nome = nome;
        this.peso = peso;
    }
    
    public String DevolveEspecie(){
        return this.especie;
    }
    
    public String DevolveNome(){
        return this.nome;
    }
    
    public void ModificaNome(String nome){
        this.nome = nome;
    }
    
}
