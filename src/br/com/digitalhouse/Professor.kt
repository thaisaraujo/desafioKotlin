package br.com.digitalhouse

abstract class Professor (val nome: String, val sobrenome: String, val tempoCasa: Int, val codigoProfessor: Int) {

    override fun equals(other: Any?): Boolean {
           return !(other == null || other != codigoProfessor)
    }


}