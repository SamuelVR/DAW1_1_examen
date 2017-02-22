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
public class Responsable {
    private String nome;
    private String apelidos;
    Animal mascota;
    
    public Responsable(){};
    
    public Responsable(String nome, String apelidos, Animal mascota){
        this.nome = nome;
        this.apelidos = apelidos;
        this.mascota = mascota;
    }
    
    public void EstablecerNome(String nome){
        this.nome = nome;
    }
    
    public String NomeMascota(){
        return mascota.DevolveNome();
    }
}
    
