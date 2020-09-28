package br.com.digitalhouse

open class Professor (val nome: String, val sobrenome: String, val tempoCasa: Int, val codigoProfessor: Int) {

    override fun equals(other: Any?): Boolean {
        return !(other == null || other != codigoProfessor)
    }

    override fun toString(): String {
        return "\nNome:$nome $sobrenome | tempoCasa:$tempoCasa | codigoProfessor:$codigoProfessor"
    }


}