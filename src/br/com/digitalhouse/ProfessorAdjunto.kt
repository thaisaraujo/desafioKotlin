package br.com.digitalhouse

class ProfessorAdjunto (nome: String, sobrenome: String, tempoCasa: Int, codigoProfessor: Int, var horasMonitoria : Int)
                       : Professor(nome, sobrenome, tempoCasa, codigoProfessor) {

    override fun toString(): String {
        return "${super.toString()} | horasMonitoria:$horasMonitoria (adjunto)"
    }
}