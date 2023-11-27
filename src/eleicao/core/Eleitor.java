/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eleicao.core;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author joaob
 */
public class Eleitor implements Serializable {

    private String CC;
    private String nome;
    private Date dataNasc;
    private char sexo;
    private byte[] password;
    private byte[] imagem;
    private boolean voted;
    
    /**
     * @param nome
     * @param numAluno
     * @param dataNasc
     * @param sexo
     * @param pass
     * @param imagem
     *
     */
    
    public Eleitor(String nome, String numAluno, Date dataNasc, char sexo ,byte[] imagem) throws Exception {
        this.CC = numAluno;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.imagem = imagem;
        voted = false;
    }

    /**
     *
     * @param e1
     */
    public Eleitor(Eleitor e1) {
        this.CC = e1.getCC();
        this.nome = e1.getNome();
        this.dataNasc = e1.getDataNasc();
        this.sexo = e1.getSexo();
        this.password = e1.getPassword();
        this.imagem = e1.getImagem();
        this.voted = e1.isVoted();
    }

    /**
     *
     * @return
     */
    public String getCC() {
        return CC;
    }

    /**
     *
     * @param CC
     */
    public void setCC(String CC) {
        this.CC = CC;
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
    public Date getDataNasc() {
        return dataNasc;
    }

    /**
     *
     * @return
     */
    public String getDatatoString() {
        return dataNasc.getDate() + "/" + (dataNasc.getMonth() + 1) + "/" + (dataNasc.getYear() + 1900);
    }

    /**
     *
     * @param dataNasc
     */
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     *
     * @return
     */
    public int idadeEleitor() {
        Date hj = new Date();
        int idade;
        int dn = dataNasc.getDate();
        int mn = dataNasc.getMonth() + 1;
        int an = dataNasc.getYear() + 1900;
        int dhj = hj.getDate();
        int mhj = hj.getMonth() + 1;
        int ahj = hj.getYear() + 1900;
        if (dn > dhj) {
            idade = (((ahj * 12) - (an * 12)) + (mhj - mn) - 1) / 12;
        } else {
            idade = (((ahj * 12) - (an * 12)) + (mhj - mn)) / 12;
        }
        return idade;
    }

    /**
     *
     * @return
     */
    public char getSexo() {
        return sexo;
    }

    /**
     *
     * @param sexo
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     *
     * @return
     */
    public byte[] getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(byte[] password) {
        this.password = password;
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
        return CC + " "
                + sexo + " "
                + dataNasc.getDate() + "/" + (dataNasc.getMonth() + 1) + "/" + (dataNasc.getYear() + 1900) + " "
                + nome;
    }

    public boolean isVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }

}
