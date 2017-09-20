package br.com.ClassesInternas;

public class Pessoa {
	private String nome;
	private String cpf;
	private String telefone;
	private String enderešo;
	
	public Pessoa(String nome, String cpf, String telefone, String enderešo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.enderešo = enderešo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	
	
}
