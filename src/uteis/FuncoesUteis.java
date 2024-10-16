
package uteis;

public class FuncoesUteis {
	// Método para verificar CPF
    public static boolean verificarCPF(String cpf) {
        // Verifica se o CPF não é nulo e tem 11 caracteres
        if (cpf == null || cpf.length() != 11) {
            return false; // CPF inválido
        }
        return true; // CPF válido
    }
	
	
	//Método para calcular IMC(Índice de Massa Corporal) == peso/altura
	public static double calculoIMC(double peso, double altura) {
		return 
			peso / (altura * altura);		
	}
	
	// Método para avaliar o aluno
	public static String avaliarAluno(Aluno aluno) {
		if (aluno.getPresenca() >= 0 || aluno.getPresenca() <= 100){
			if(aluno.getNota() >= 5 && aluno.getPresenca() >= 75) {
				return "Aprovado";
			} else {
				return "Reprovado";
			}
		} else {
			return "A porcentagem informada deve estar entre 0 e 100.";
		}
	}
	
	
}