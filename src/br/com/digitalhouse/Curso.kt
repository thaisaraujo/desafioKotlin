package br.com.digitalhouse

class Curso (val nome: String, val codigoCurso: Int) {

    override fun equals(other: Any?): Boolean {
        return !(other == null || other != codigoCurso)
    }


}