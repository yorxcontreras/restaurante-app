package br.edu.up.model;

public class Horario {
    private int hora;
    private boolean disponivel;

    public Horario(int hora) {
        this.hora = hora;
        this.disponivel = true;
    }

    public int getHora() {
        return hora;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        this.disponivel = false;
    }
}
