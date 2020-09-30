package br.com.digitalhouse

class Aluno(val nome:String, val sobrenome: String, val codigoAluno: Int) {

    override fun equals(other: Any?): Boolean {
        return !(other == null || other != this.codigoAluno)
    }

    override fun toString(): String {
        return "\nAluno - Nome:$nome $sobrenome | codigoAluno:$codigoAluno"
    }


}