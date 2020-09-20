package model.entities;

public abstract class Pessoa {
	private String nome;
	private String cargo;
	protected int hora;
	protected float valorBase;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, String cargo, int hora, float valorBase) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.hora = hora;
		this.valorBase = valorBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public float getValorBase() {
		return valorBase;
	}

	public void setValorBase(float valorBase) {
		this.valorBase = valorBase;
	}

	@Override
	public String toString() {
		return "Nome:" + nome + ", cargo:" + cargo + ", carga horária:" + hora + ", valor base:" + valorBase;
	}
}
