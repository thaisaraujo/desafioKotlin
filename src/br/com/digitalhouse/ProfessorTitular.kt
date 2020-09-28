package br.com.digitalhouse

class ProfessorTitular (nome: String, sobrenome: String, tempoCasa: Int, codigoProfessor: Int, val especialidade : String)
                       : Professor(nome, sobrenome, tempoCasa, codigoProfessor){

    override fun toString(): String {
        return "${super.toString()} | especialidade:$especialidade (titular)"
    }
}