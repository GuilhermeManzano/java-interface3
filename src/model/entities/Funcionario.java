package model.entities;

import model.services.Colaborador;

public class Funcionario extends Pessoa implements Colaborador {
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, String cargo, int hora, float valorBase) {
		super(nome, cargo, hora, valorBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float obtemSalario(float valorBase) {
		return cargaHoraria(hora) * valorBase * 2;
	}

	@Override
	public float cargaHoraria(int cargaHora) {
		return 20 * hora;
	}
}
