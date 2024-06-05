package br.edu.up.controller;

import br.edu.up.daos.GerenciadorDeArquivos;
import br.edu.up.model.Horario;

import java.util.ArrayList;
import java.util.List;

public class ReservaController {
    private List<Horario> horarios;

    public ReservaController() {
        GerenciadorDeArquivos gerenciador = new GerenciadorDeArquivos();
        this.horarios = gerenciador.carregar();

        }

    public List<Horario> getHorariosDisponiveis() {
        List<Horario> horariosDisponiveis = new ArrayList<>();
        for (Horario horario : horarios) {
            if (horario.isDisponivel()) {
                horariosDisponiveis.add(horario);
            }
        }
        return horariosDisponiveis;
    }

    public void fazerReserva(Horario horario, int numPessoas) {
        if (horario.isDisponivel()) {
            horario.reservar();
            System.out.println("Reserva confirmada para " + numPessoas + " pessoas às " + horario.getHora() + " horas.");
        } else {
            System.out.println("Desculpe, este horário já está reservado. Por favor, escolha outro horário.");
        }
    }

    public List<Horario> getHorarios() {
        return horarios;
    }
}
//commit fix