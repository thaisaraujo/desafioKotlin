package br.com.digitalhouse

import java.time.LocalDate

class Matricula(val aluno: Aluno, val curso: Curso, var data: LocalDate) {

    override fun toString(): String {
        return "\nMatricula - Aluno:${aluno.nome} ${aluno.sobrenome} | Curso:${curso.nome} | Data:$data"
    }
}