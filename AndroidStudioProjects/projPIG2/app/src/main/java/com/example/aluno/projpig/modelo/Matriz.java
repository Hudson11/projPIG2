package com.example.aluno.projpig.modelo;

//modelo1
public class Matriz extends Animal{

    private int num_cios;

    private enum estado{
        COBERTA,
        DESCOBERTA,
        PRENHA,
        VÁZIA,
        PROB_REPRODUTIVO,
        LACTANTE,
        DESMAMADA
    };

    public Matriz() {
    }

    public Matriz(int num_cios, boolean vacinada) {
        super();
        this.num_cios = num_cios;
    }

    public int getNum_cios() {
        return num_cios;
    }

    public void setNum_cios(int num_cios) {
        this.num_cios = num_cios;
    }
}
