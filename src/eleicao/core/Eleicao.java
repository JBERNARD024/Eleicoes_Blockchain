/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eleicao.core;

import com.github.lgooddatepicker.components.DatePicker;
import eleicao.utils.SecurityUtils;
import java.io.Serializable;
import java.security.KeyPair;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author João Vieira e Pedro Almeida
 */
public class Eleicao implements Serializable{
    private ArrayList<Eleitor> eleitores;
    private ArrayList<Candidato> candidatos;
    private ArrayList<Voto> votos;
    private ArrayList<Integer> resultados;
    private LocalDate dataInic;
    private LocalDate dataFim;
    private LocalTime horaInic;
    private LocalTime horaFim;
    private String nome;
    private String descricao;
    private KeyPair kp;
    private byte [] imagem;
    
    /**
     *
     * @param eleitores
     * @param candidatos
     * @param votos
     * @param resultados
     * @throws java.lang.Exception
     */

    
    public Eleicao(ArrayList<Eleitor> eleitores, ArrayList<Candidato> candidatos, ArrayList<Voto> votos, ArrayList<Integer> resultados) throws Exception {
        kp = SecurityUtils.generateRSAKeyPair();
        this.eleitores = eleitores;
        this.candidatos = candidatos;
        this.votos = votos;
        this.resultados = resultados;
    }

    public Eleicao(ArrayList<Eleitor> eleitores, ArrayList<Candidato> candidatos, ArrayList<Voto> votos, ArrayList<Integer> resultados, LocalDate dataInic, LocalDate dataFim, LocalTime horaInic, LocalTime horaFim, String nome, String descricao, byte[] imagem)  {
        this.eleitores = eleitores;
        this.candidatos = candidatos;
        this.votos = votos;
        this.resultados = resultados;
        this.dataInic = dataInic;
        this.dataFim = dataFim;
        this.horaInic = horaInic;
        this.horaFim = horaFim;
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Eleitor> getEleitores() {
        return eleitores;
    }

    /**
     *
     * @param eleitores
     */
    public void setEleitores(ArrayList<Eleitor> eleitores) {
        this.eleitores = eleitores;
    }

    /**
     *
     * @return
     */
    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    /**
     *
     * @param candidatos
     */
    public void setCandidatos(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    /**
     *
     * @return
     */
    public ArrayList<Voto> getVotos() {
        return votos;
    }

    /**
     *
     * @param votos
     */
    public void setVotos(ArrayList<Voto> votos) {
        this.votos = votos;
    }

    /**
     *
     * @return
     */
    public ArrayList<Integer> getResultados() {
        return resultados;
    }

    /**
     *
     * @param resultados
     */
    public void setResultados(ArrayList<Integer> resultados) {
        this.resultados = resultados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public LocalDate getDataInic() {
        return dataInic;
    }

    public void setDataInic(LocalDate dataInic) {
        this.dataInic = dataInic;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public LocalTime getHoraInic() {
        return horaInic;
    }

    public void setHoraInic(LocalTime horaInic) {
        this.horaInic = horaInic;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }
}
