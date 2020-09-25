package br.com.digitalhouse

class Curso (val nome: String, val codigoCurso: Int, var professorTitular: ProfessorTitular,
             var professorAdjunto: ProfessorAdjunto, var qtdMaxAlunos: Int, val listaDeAlunos : MutableList<Aluno>) {

    override fun equals(other: Any?): Boolean {
        return !(other == null || other != codigoCurso)
    }


    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if(!listaDeAlunos.contains(umAluno)) {
            listaDeAlunos.add(umAluno)
            return true
        } else {
            return false
        }
    }

    fun excluirUmAluno(umAluno: Aluno){
        if(listaDeAlunos.contains(umAluno))
            listaDeAlunos.remove(umAluno)
    }


}