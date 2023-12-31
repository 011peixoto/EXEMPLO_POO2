package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Aluno;
import br.senai.sp.jandira.model.Pessoas;

public class App {
    public static void main(String[] args) {
        //Exemplo POO
        Pessoas pessoas1 = new Pessoas("João", 18);
        Pessoas pessoas2 = new Pessoas("Maria", 26);

        pessoas1.getNome();
        pessoas2.getNome();

        //Exemplo Encapsulamento
        System.out.println(pessoas1.getNome());
        System.out.println(pessoas2.getNome());
        //Exemplo Herança
        Pessoas aluno1 = new Aluno("Gustavo", 19, 1988);
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getIdade());

        //Exemplo Polimorfismo
        aluno1.passarTempo();
        System.out.println(aluno1.getSaldo());

        //Exemplo Abstração
        aluno1.notaFinal(8,7);

    }
}
