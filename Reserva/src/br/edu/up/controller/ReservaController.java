package br.edu.up.controller;

import br.edu.up.model.Horario;
import br.edu.up.model.ReservaModel;

import java.util.ArrayList;
import java.util.List;

public class ReservaController {
    private List<Horario> horarios;

    public ReservaController() {
        this.horarios = new ArrayList<>();
        // Inicializa os horários disponíveis (Considerando que o restaurante abre 10h e fecha 21h)
        for (int i = 10; i <= 21; i++) {
            horarios.add(new Horario(i));
        }
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
            ReservaModel reserva = new ReservaModel(horario, numPessoas);
            System.out.println("Reserva confirmada para " + numPessoas + " pessoas às " + horario.getHora() + " horas.");
        } else {
            System.out.println("Desculpe, este horário já está reservado. Por favor, escolha outro horário.");
        }
    }
}

