package Ex_1_Sistema_Gerenciamento_Cursos;

import java.util.Scanner;
import Ex_1_Sistema_Gerenciamento_Cursos.Aluno;

/*
Exercício 1: Sistema de Gerenciamento de Cursos
Você precisa criar um sistema para gerenciar cursos em uma universidade. Identifique
as classes conceituais, seus atributos e associações considerando que na universidade
existem vários cursos de graduação, cada curso possui disciplinas distribuídas nos
semestres, há um quadro de professores que a cada semestre ficam responsáveis por
ministrar disciplinas. Os acadêmicos se matriculam a cada semestre em sua respectiva
turma. Uma turma representa um determinado semestre do curso.
*/

/*
Aluno --> vai tar dentro da turma
Curso
Disciplina --> vai tar dentro do curso
Professor --> vai tar dentro da diciplina
Turma --> vai tar dentro do curso
*/

public class Main {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        imprimir("...:::Sistema de Gerenciamento de Cursos:::...");

        //objeto aluno01
        Aluno aluno01 = new Aluno();
        aluno01.setRa("Estudou em escola particular vida todinha");
        aluno01.setNome("Jubiscleison");
        aluno01.setSobrenome("da Silva");
        aluno01.setCpf(12345678);
        aluno01.setEmail("jubis@gmail.com");
        aluno01.setDataNascimento(19082022);

        //objeto curso01
        Curso curso01 = new Curso();
        curso01.setCodigo(011);
        curso01.setNome("Ciência da Computação");
        curso01.setCargaHorariaTotal(3600);
        curso01.setQuantidadeSemestres(8);

        //objeto disciplina01 - dentro de curso01
        //dentro de disciplina01 o professor01
        Professor professor01 = new Professor(033, "Edmar", "Costa e Silva" , 666696967, "edmito@gmail.com" , "Doutorado em matematica");
        Disciplina disciplina01 = new Disciplina(022, "Cálculo 2", 20, "Áreas");
        disciplina01.setProfessor(professor01);
        
    }

    public static void imprimir(String text) {
        System.out.println(text);
    }
}