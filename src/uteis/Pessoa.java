package uteis;

public abstract class Pessoa {
	//Declarando variáveis
	private String nome;
	private String cpf;
	private double peso;
	private double altura;
	
	// Construtor da classe
	public Pessoa(String nome, String cpf, double peso, double altura) {
		this.nome = nome;
		this.cpf = cpf;
		this.peso = peso;
		this.altura = altura;
	}
	
	//Getters
	public String getNome(){
		return nome;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public double getPeso(){
		return peso;
	}
	
	public double getAltura(){
		return altura;
	}
	
	//para dar override
    public abstract String getInsert();

}