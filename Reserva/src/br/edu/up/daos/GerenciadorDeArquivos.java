package br.edu.up.daos;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Horario;

public class GerenciadorDeArquivos {

    public void salvar(List<Horario> horarios) {
        for (int i = 10; i <= 21; i++) {
            horarios.add(new Horario(i));
        }
    }
    public List<Horario> carregar(){
        return new ArrayList<>();
    }


}
