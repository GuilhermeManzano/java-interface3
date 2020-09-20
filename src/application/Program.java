package application;

import java.util.Scanner;

import model.entities.Estagiario;
import model.entities.Funcionario;
import model.entities.ProfessorGraduacao;
import model.entities.ProfessorTecnico;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Estagiario es1 = new Estagiario("Carlos", "Estagiário", 6, 5.0f);
		System.out.println(es1.toString());
		float salario = es1.obtemSalario(es1.getValorBase());
		System.out.println("Salário do " + es1.getCargo() + ": " + salario);
		System.out.println();
		
		Funcionario f1 = new Funcionario("Roberto", "Funcionario", 8, 10f);
		System.out.println(f1.toString());
		salario = f1.obtemSalario(f1.getValorBase());
		System.out.println("Salário do " + f1.getCargo() + ": " + salario);
		System.out.println();

		ProfessorTecnico pt1 = new ProfessorTecnico("Amanda", "Professora Técnica", 8, 20f);
		System.out.println(pt1.toString());
		salario = pt1.obtemSalario(pt1.getValorBase());
		System.out.println("Tem mestrado?");
		try {
			boolean mestre = sc.nextBoolean();
			if (mestre == true) {
				System.out.println("Tem doutorado?");
				boolean doutor = sc.nextBoolean();
				if (doutor == true) {
					salario = pt1.doutorado();
				} else {
					salario = pt1.mestrado();
				}
			} 
			System.out.println("Salário do " + pt1.getCargo() + ": " + salario);
			System.out.println();
		} catch (Exception InputMismatchException) {
			System.out.println("ERRO!! Digite true ou false");
			sc.close();
		} 	

		ProfessorGraduacao pg1 = new ProfessorGraduacao("Marcelo", "Professor Graduacao", 10, 25f);
		System.out.println(pg1.toString());
		salario = pg1.obtemSalario(pg1.getValorBase());
		System.out.println("Tem mestrado?");
		try {
			boolean mestre = sc.nextBoolean();
			if (mestre == true) {
				System.out.println("Tem doutorado?");
				boolean doutor = sc.nextBoolean();
				if (doutor == true) {
					salario = pt1.doutorado();
				} else {
					salario = pt1.mestrado();
				}
			} 
			System.out.println("Salário do " + pt1.getCargo() + ": " + salario);
			System.out.println();
		} catch (Exception InputMismatchException) {
			System.out.println("ERRO!! Digite true ou false");
			sc.close();
		} 	
		
		sc.close();
	}
}
