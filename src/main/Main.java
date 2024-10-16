package main;

import uteis.*;

public class Main {

    public static void main(String[] args) {
        
        // Aluno com CPF inválido
        Aluno alunoInvalido = new Aluno("Duda", "1234567890A", 70.0, 1.65, 9.0, 40);
        
        // Verificação do CPF inválido
        if (FuncoesUteis.verificarCPF(alunoInvalido.getCpf())) {
            double imcInvalido = FuncoesUteis.calculoIMC(alunoInvalido.getPeso(), alunoInvalido.getAltura());
            String avaliacaoInvalida = FuncoesUteis.avaliarAluno(alunoInvalido);
            System.out.println(alunoInvalido.getInsert() + "IMC: " + imcInvalido + "\n" + "Avaliação: " + avaliacaoInvalida + "\n");
        } else {
            System.out.println("CPF inválido: " + alunoInvalido.getCpf());
        }

        // Aluno com CPF válido e aprovado
        Aluno aluno = new Aluno("Taynara", "56660701905", 50.0, 1.72, 8.0, 90);
        
        // Verificação do CPF válido
        if (FuncoesUteis.verificarCPF(aluno.getCpf())) {
            double imc = FuncoesUteis.calculoIMC(aluno.getPeso(), aluno.getAltura());
            String avaliacao = FuncoesUteis.avaliarAluno(aluno);
            System.out.println(aluno.getInsert() + "IMC: " + imc + "\n" + "Avaliação: " + avaliacao + "\n");
        } else {
            System.out.println("CPF inválido: " + aluno.getCpf());
        }
    }
}
