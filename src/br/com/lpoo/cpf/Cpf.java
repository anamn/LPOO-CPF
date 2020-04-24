package br.com.lpoo.cpf;

public class Cpf {

	private String cpf;

	public Cpf(String cpf) {
		this.setCpf(cpf);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (ValidaCpf.isCPF(cpf)) {
			this.cpf = cpf;
			System.out.println("Cpf valido");
		} else {
			throw new CpfInvalidoException("Cpf inválido");
		}
	}
}
