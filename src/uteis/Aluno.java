package uteis;

public class Aluno extends Pessoa{
	private double nota;
	private int presenca;
	
	public Aluno(String nome, String cpf, double peso, double altura, double nota, int presenca) {
		super(nome, cpf, peso, altura);
		this.nota = nota;
		this.presenca = presenca;
	}

	public double getNota(){
		return nota;
	}
	
	public int getPresenca(){
		return presenca;
	}
	
    @Override
    public String getInsert() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nPeso: " + getPeso() + "\nAltura: " + getAltura() + "\nNota: " + nota + "\nPresença: " + presenca + "\n";
    }
}
