package br.senai.sp.jandira.model;

public class Aluno extends Pessoas {

    @Override
    public void passarTempo() {
        System.out.println(getNome() + " esta fazendo atividade de Java");
    }

    private  int matricula;
    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
