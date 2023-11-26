/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eleicao.core;

import java.io.Serializable;

/**
 *
 * @author joaob
 */
public class Voto implements Serializable{
    private Candidato c;
    
    /**
     * @param c    
     */
    public Voto(Candidato c){
        this.c = c;
    }

    public Candidato getCandidato() {
        return c;
    }

    public void setCandidato(Candidato c) {
        this.c = c;
    }  

    @Override
    public String toString() {
        return c.toString();
    }
    
}
