package br.com.digitalhouse

class Curso (val nome: String, val codigoCurso: Int, var qtdMaxAlunos: Int){

    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto

    val listaDeAlunos = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
            return !(other == null || other != this.codigoCurso)
        }

    override fun toString(): String {
        try {
            return "\nCurso - Nome$nome | Código do Curso:$codigoCurso | Max de Alunos:$qtdMaxAlunos" +
                    " | Professor Titular: ${professorTitular.nome} ${professorTitular.sobrenome}" +
                    " | Professor Adjunto: ${professorAdjunto.nome} ${professorAdjunto.sobrenome}" +
                    " | Lista de Alunos: ${listaDeAlunos.toString()}"
        }catch (ex : Exception){
            return "\nCurso - Nome$nome | Código do Curso:$codigoCurso | Max de Alunos:$qtdMaxAlunos" +
                    " | Professor Titular não alocado" +
                    " | Professor Adjunto não alocado" +
                    " | Não há lista de alunos"
        }
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if(listaDeAlunos.size < qtdMaxAlunos) {
            listaDeAlunos.add(umAluno)
            return true
        } else {
            return false
        }
    }

    fun excluirUmAluno(umAluno: Aluno) {
        if (listaDeAlunos.contains(umAluno)) {
            listaDeAlunos.remove(umAluno)
            println("Aluno ${umAluno.nome} ${umAluno.sobrenome} removido do Curso ${this.nome}")
        } else {
            println("Aluno não encontrado na lista do Curso")
        }
    }


}