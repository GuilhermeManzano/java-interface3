package model.entities;

import model.services.Colaborador;

public class Estagiario extends Pessoa implements Colaborador {
	public Estagiario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estagiario(String nome, String cargo, int hora, float valorBase) {
		super(nome, cargo, hora, valorBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float obtemSalario(float valorBase) {
		return cargaHoraria(hora) * valorBase;
	}

	@Override
	public float cargaHoraria(int hora) {
		return 20 * hora;
	}
}
