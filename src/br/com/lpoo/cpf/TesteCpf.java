package br.com.lpoo.cpf;

import java.util.Scanner;

public class TesteCpf {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Inserir Cpf: \n");
		Cpf cpf = new Cpf();
		cpf.setCpf(ler.next());

	}
}
