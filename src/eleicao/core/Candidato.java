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
public class Candidato implements Serializable{

    private  int idCandidato;
    private String nome;
    private String sigla;
    private byte[] imagem;

    /**
     * @param idCandidato
     * @param nome
     * @param sigla
     * @param imagem
    */
    public Candidato(int idCandidato, String nome, String sigla, byte[] imagem) {
        this.idCandidato = idCandidato;
        this.nome = nome;
        this.sigla = sigla;
        this.imagem = imagem;
    }
    
    /**
     *
     * @return
     */
    public int getIdCandidato() {
        return idCandidato;
    }

    /**
     *
     * @param idCandidato
     */
    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getSigla() {
        return sigla;
    }

    /**
     *
     * @param sigla
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     *
     * @return
     */
    public byte[] getImagem() {
        return imagem;
    }

    /**
     *
     * @param imagem
     */
    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    
    @Override
    public String toString() {
        return idCandidato + " " + sigla + " " + nome;
    }
}
