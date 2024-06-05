package br.edu.up.model;

public class ReservaModel {
    private Horario horario;
    private int numPessoas;

    public ReservaModel(Horario horario, int numPessoas) {
        this.horario = horario;
        this.numPessoas = numPessoas;
    }

    public Horario getHorario() {
        return horario;
    }

    public int getNumPessoas() {
        return numPessoas;
    }
}
//commit fix