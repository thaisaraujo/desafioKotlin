package br.com.digitalhouse

class Curso (val nome: String, val codigoCurso: Int, var qtdMaxAlunos: Int){

    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto

    val listaDeAlunos = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
            return !(other == null || other != codigoCurso)
        }

    override fun toString(): String {
        var temProfTitular : String = ""
        var tempProfAdjunto : String = ""
        var tempListaAluno : String = ""

        try {
            if(professorTitular != null){
                temProfTitular = professorTitular.toString()
            }else{
                temProfTitular = "Professor Titular Não Alocado"
            }

            if(professorAdjunto != null){
                tempProfAdjunto = professorAdjunto.toString()
            }else{
                tempProfAdjunto = "Professor Adjunto Não Alocado"
            }

            if(listaDeAlunos != null && listaDeAlunos.isNotEmpty()){
                tempListaAluno = listaDeAlunos.toString()
            }else{
                tempListaAluno = "Não há Lita de Alunos"
            }
            return "\nCurso - Nome$nome | Código do Curso:$codigoCurso | Max de Alunos:$qtdMaxAlunos | $temProfTitular | $tempProfAdjunto | $tempListaAluno"

        }catch (ex : Exception){
            return "\nCurso - Nome$nome | Código do Curso:$codigoCurso | Max de Alunos:$qtdMaxAlunos"
        }
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