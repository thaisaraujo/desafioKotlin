package br.com.digitalhouse

import java.time.LocalDate

class DigitalHouseManager  {

    val listaDeAlunos : MutableList<Aluno> = mutableListOf()
    val listaDeProfessores : MutableList<Professor> = mutableListOf()
    val listaDeCursos : MutableList<Curso> = mutableListOf()
    val listaDeMatriculas: MutableList<Matricula> = mutableListOf()


    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaxAluno: Int){
        listaDeCursos.add(Curso(nome, codigoCurso, qtdMaxAluno))
    }

    fun excluirCurso(codigoCurso: Int){
        val temp = listaDeCursos.find {curso -> codigoCurso.equals(curso.codigoCurso) }
        if(temp != null)
            listaDeCursos.remove(temp)
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        listaDeProfessores.add(ProfessorAdjunto(nome, sobrenome, 0,codigoProfessor, quantidadeDeHoras))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        listaDeProfessores.add(ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int){
        val temp = listaDeProfessores.find{professor -> codigoProfessor.equals(professor.codigoProfessor)}
        if(temp != null)
            listaDeProfessores.remove(temp)
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int){
        listaDeAlunos.add(Aluno(nome, sobrenome, codigoAluno))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        val tempCurso = listaDeCursos.find {curso -> codigoCurso.equals(curso.codigoCurso)}
        val tempAluno = listaDeAlunos.find{aluno -> codigoAluno.equals(aluno.codigoAluno)}

        if(tempCurso != null && tempAluno != null){
            if(tempCurso.listaDeAlunos.size < tempCurso.qtdMaxAlunos){
                var data = LocalDate.now()
                listaDeMatriculas.add(Matricula(tempAluno,tempCurso,data))
                tempCurso.listaDeAlunos.add(tempAluno)
                println("Matrícula Realizada\nAluno:${tempAluno.nome} ${tempAluno.sobrenome} - Curso: ${tempCurso.nome}")
            }else{
                println("Não foi possível realizar a matrícula motivo: Turma Lotada")
            }
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val tempCurso = listaDeCursos.find{curso -> codigoCurso.equals(curso.codigoCurso)}
        val tempProfessorTitular = listaDeProfessores.find{professorTitular -> codigoProfessorTitular.equals(professorTitular.codigoProfessor)}
        val tempProfessorAdjunto = listaDeProfessores.find{professorAdjunto -> codigoProfessorAdjunto.equals(professorAdjunto.codigoProfessor)}

        if(tempCurso != null && tempProfessorTitular != null && tempProfessorAdjunto != null){
            tempCurso.professorTitular = tempProfessorTitular as ProfessorTitular
            tempCurso.professorAdjunto = tempProfessorAdjunto as ProfessorAdjunto
        }
    }








}