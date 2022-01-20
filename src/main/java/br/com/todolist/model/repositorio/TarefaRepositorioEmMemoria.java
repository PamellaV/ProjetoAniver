package br.com.todolist.model.repositorio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.todolist.model.Tarefa;

public class TarefaRepositorioEmMemoria implements TarefaRepositorio {
	
	private Set<Tarefa> tarefas = new HashSet<Tarefa>();

	public void adicionar(Tarefa tarefa) {
		tarefas.add(tarefa);
	}

	public List<Tarefa> listar() {
		List<Tarefa> todas = new ArrayList<Tarefa>();
		todas.addAll(tarefas);
		return todas;
	}

	
	
}
