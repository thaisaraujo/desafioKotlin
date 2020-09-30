package br.com.digitalhouse

import java.time.LocalDate

class DigitalHouseManager  {

    val listaDeAlunos : MutableList<Aluno> = mutableListOf()
    val listaDeProfessores : MutableList<Professor> = mutableListOf()
    val listaDeCursos : MutableList<Curso> = mutableListOf()
    val listaDeMatriculas: MutableList<Matricula> = mutableListOf()


    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaxAluno: Int){
        val temp = Curso(nome, codigoCurso, qtdMaxAluno)

        if(!listaDeCursos.contains(temp)) {
            listaDeCursos.add(temp)
            println("Curso ${temp.nome} Registrado")
        }else{
            println("Código do Curso Duplicado")
        }
    }

    fun excluirCurso(codigoCurso: Int){
        val temp = listaDeCursos.find {curso -> curso.equals(codigoCurso) }
        if(temp != null){
            listaDeCursos.remove(temp)
            println("Curso ${temp.nome} Removido")
        }else{
            println("Curso não encontrado")
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        val temp = ProfessorAdjunto(nome, sobrenome, 0,codigoProfessor, quantidadeDeHoras)

        if(!listaDeProfessores.contains(temp)){
            listaDeProfessores.add(temp)
            println("Professor ${temp.nome} ${temp.sobrenome} Registrado")
        }else{
            println("Código do Professor Adjunto Duplicado")
        }
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        val temp = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)

        if(!listaDeProfessores.contains(temp)){
            listaDeProfessores.add(temp)
            println("Professor ${temp.nome} ${temp.sobrenome} Registrado")
        }else{
            println("Código do Professor Titular Duplicado")
        }
    }

    fun excluirProfessor(codigoProfessor: Int){
        val temp = listaDeProfessores.find{professor -> professor.equals(codigoProfessor)}
        if(temp != null) {
            listaDeProfessores.remove(temp)
            println("Professor ${temp.nome} ${temp.sobrenome} Removido")
        }else{
            println("Professor não encontrado")
        }
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int){
        val temp = Aluno(nome, sobrenome, codigoAluno)

        if(!listaDeAlunos.contains(temp)) {
            listaDeAlunos.add(temp)
            println("Aluno ${temp.nome} ${temp.sobrenome} Registrado")
        }else{
            println("Código de Aluno Duplicado")
        }
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        val tempCurso = listaDeCursos.find {curso -> curso.equals(codigoCurso)}
        val tempAluno = listaDeAlunos.find{aluno -> aluno.equals(codigoAluno)}

        if(tempCurso != null && tempAluno != null){
            if(tempCurso.adicionarUmAluno(tempAluno)){
                val data = LocalDate.now()
                listaDeMatriculas.add(Matricula(tempAluno,tempCurso,data))
                println("Matrícula Realizada - Aluno:${tempAluno.nome} ${tempAluno.sobrenome} - Código:${tempAluno.codigoAluno} - Curso: ${tempCurso.nome}")
            }else{
                println("Não foi possível realizar a matrícula do aluno ${tempAluno.nome} ${tempAluno.sobrenome}. Motivo: Turma Lotada")
            }
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val tempCurso = listaDeCursos.find{curso -> curso.equals(codigoCurso)}
        val tempProfessorTitular = listaDeProfessores.find{professorTitular -> professorTitular.equals(codigoProfessorTitular)}
        val tempProfessorAdjunto = listaDeProfessores.find{professorAdjunto -> professorAdjunto.equals(codigoProfessorAdjunto)}

        if(tempCurso != null && tempProfessorTitular != null && tempProfessorAdjunto != null){
            tempCurso.professorTitular = tempProfessorTitular as ProfessorTitular
            tempCurso.professorAdjunto = tempProfessorAdjunto as ProfessorAdjunto
        }else{
            println("Não foi possivel alocar Professores no Curso")
        }
    }

    fun consultarCurso(codigoAluno: Int) {
        for(matricula in listaDeMatriculas){
            if(matricula.aluno.equals(codigoAluno))
                println("O aluno ${matricula.aluno.nome} ${matricula.aluno.sobrenome} realizou matricula no curso ${matricula.curso.nome} em ${matricula.data}")
        }
    }

}