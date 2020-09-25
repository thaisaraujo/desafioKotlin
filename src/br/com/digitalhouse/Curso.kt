package br.com.digitalhouse

class Curso (val nome: String, val codigoCurso: Int, var professorTitular: ProfessorTitular,
             var professorAdjunto: ProfessorAdjunto, qtdMaxAlunos: Int, listaDeAlunos : MutableList<Aluno>) {

    override fun equals(other: Any?): Boolean {
        return !(other == null || other != codigoCurso)
    }


}