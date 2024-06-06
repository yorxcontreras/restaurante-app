package br.edu.up.view;

import br.edu.up.controller.ReservaController;
import br.edu.up.daos.GerenciadorDeArquivos;
import br.edu.up.model.Horario;

import java.util.List;
import java.util.Scanner;

public class SistemaReservaRestaurante {
    private ReservaController reservaController;
    private Scanner scanner;

    public SistemaReservaRestaurante() {
        this.reservaController = new ReservaController();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Bem-vindo ao sistema de reserva do restaurante!");

        while (true) {
            System.out.println("Por favor, escolha uma opção:");
            System.out.println("1. Fazer reserva");
            System.out.println("2. Verificar disponibilidade");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    fazerReserva();
                    break;
                case 2:
                    verificarDisponibilidade();
                    break;
                case 3:
                    GerenciadorDeArquivos gerenciador = new GerenciadorDeArquivos();
                    List<Horario> horarios  = reservaController.getHorarios();
                    gerenciador.salvar(horarios);
                    System.out.println("Obrigado por usar o sistema de reserva do restaurante!");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private void fazerReserva() {
        List<Horario> horariosDisponiveis = reservaController.getHorariosDisponiveis();
        if (horariosDisponiveis.isEmpty()) {
            System.out.println("Desculpe, não há horários disponíveis para reserva.");
            return;
        }

        System.out.println("Horários disponíveis para reserva:");
        for (Horario horario : horariosDisponiveis) {
            System.out.println(horario.getHora() + " horas");
        }

        System.out.println("Por favor, insira o horário desejado para a reserva:");
        int horaEscolhida = scanner.nextInt();

        Horario horarioReserva = null;
        for (Horario horario : horariosDisponiveis) {
            if (horario.getHora() == horaEscolhida) {
                horarioReserva = horario;
                break;
            }
        }

        if (horarioReserva == null) {
            System.out.println("Horário inválido.");
            return;
        }

        System.out.println("Por favor, insira o número de pessoas para a reserva:");
        int numPessoas = scanner.nextInt();

        reservaController.fazerReserva(horarioReserva, numPessoas);
    }

    private void verificarDisponibilidade() {
        List<Horario> horariosDisponiveis = reservaController.getHorariosDisponiveis();
        if (horariosDisponiveis.isEmpty()) {
            System.out.println("Não há horários disponíveis para reserva.");
        } else {
            System.out.println("Horários disponíveis para reserva:");
            for (Horario horario : horariosDisponiveis) {
                System.out.println(horario.getHora() + " horas");
            }
        }
    }
}