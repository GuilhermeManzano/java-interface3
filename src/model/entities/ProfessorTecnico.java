package model.entities;

import model.services.Professor;

public class ProfessorTecnico extends Pessoa implements Professor {
	public ProfessorTecnico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfessorTecnico(String nome, String cargo, int hora, float valorBase) {
		super(nome, cargo, hora, valorBase);
		// TODO Auto-generated constructor stub
	}

	private boolean mestrado;
	private boolean doutorado;
	
	public ProfessorTecnico(boolean mestrado, boolean doutorado) {
		super();
		this.mestrado = mestrado;
		this.doutorado = doutorado;
	}
	
	public boolean isMestrado() {
		return mestrado;
	}

	public void setMestrado(boolean mestrado) {
		this.mestrado = mestrado;
	}

	public boolean isDoutorado() {
		return doutorado;
	}

	public void setDoutorado(boolean doutorado) {
		this.doutorado = doutorado;
	}

	@Override
	public float obtemSalario(float valorBase) {
		return cargaHoraria(hora) * valorBase * 3;
	}

	@Override
	public float cargaHoraria(int hora) {
		return 20 * hora;
	}

	@Override
	public float obtemTitulacao() {
		return 0;
	}

	@Override
	public float mestrado() {
		return (float) (obtemSalario(valorBase) * 1.20);
	}

	@Override
	public float doutorado() {
		return (float) (obtemSalario(valorBase) * 1.50);
	}
}
