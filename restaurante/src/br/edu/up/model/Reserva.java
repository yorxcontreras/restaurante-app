package br.edu.up.model;

import java.util.Date;

public class Reserva {
    private Date data;
    private String nomeCliente;
    private int numeroPessoas;

    public Reserva(Date data, String nomeCliente, int numeroPessoas) {
        this.data = data;
        this.nomeCliente = nomeCliente;
        this.numeroPessoas = numeroPessoas;
    }

}