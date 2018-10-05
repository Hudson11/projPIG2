package com.example.aluno.projpig.modelo;

import java.util.Date;

public class Animal {

    private int id;
    private int qtdTetos;
    private String nome;
    private Date dataNasc;
    private String raça;
    private String sexo;
    private double peso;
    private boolean vacina;

    private String nomePai;
    private Date dataNascP;
    private String nomeMae;
    private Date dataNascM;

    private enum ambiente{
        BAIA,
        MATERNIDADE,
        GALPÃO,
        CRECHÊ
    };

    public Animal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtdTetos() {
        return qtdTetos;
    }

    public void setQtdTetos(int qtdTetos) {
        this.qtdTetos = qtdTetos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacina() {
        return vacina;
    }

    public void setVacina(boolean vacina) {
        this.vacina = vacina;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Date getDataNascP() {
        return dataNascP;
    }

    public void setDataNascP(Date dataNascP) {
        this.dataNascP = dataNascP;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Date getDataNascM() {
        return dataNascM;
    }

    public void setDataNascM(Date dataNascM) {
        this.dataNascM = dataNascM;
    }
}
