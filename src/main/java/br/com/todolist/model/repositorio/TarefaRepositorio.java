package br.com.todolist.model.repositorio;

import java.util.List;

import br.com.todolist.model.Tarefa;

public interface TarefaRepositorio {

	public void adicionar(Tarefa tarefa);
	public List<Tarefa> listar();
	
}
