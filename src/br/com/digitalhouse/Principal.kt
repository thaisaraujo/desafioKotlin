package br.com.digitalhouse

fun main(){

    val digitalHouseManager = DigitalHouseManager()

    println("\n\nREGISTRO DE PROFESSORES TITULARES E ADJUNTOS" )
    digitalHouseManager.registrarProfessorTitular("Severo","Snape", 123,"Full Stack")
    digitalHouseManager.registrarProfessorTitular("Minerva", "McGonagall", 456, "Mobile Android")
    digitalHouseManager.registrarProfessorAdjunto("Luna", "Lovegood", 789, 8)
    digitalHouseManager.registrarProfessorAdjunto("Hermione", "Granger", 183, 6)
    println(digitalHouseManager.listaDeProfessores)

    println("\n\nREGISTRO DOS CURSOS")
    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)
    println(digitalHouseManager.listaDeCursos)

    println("\n\nALOCOÇÃO DE PROFESSORES")
    digitalHouseManager.alocarProfessores(20001,123,789)
    digitalHouseManager.alocarProfessores(20002,456,183)
    println(digitalHouseManager.listaDeCursos)


    println("\n\nREGISTRO DOS ALUNOS")
    digitalHouseManager.registrarAluno("Harry", "Potter", 1101)
    digitalHouseManager.registrarAluno("Rony", "Weasley", 1102)
    digitalHouseManager.registrarAluno("Draco", "Malfoy", 2201)
    digitalHouseManager.registrarAluno("Gina", "Weasley", 2202)
    digitalHouseManager.registrarAluno("Lílian","Evans Potter", 2203)
    println(digitalHouseManager.listaDeAlunos)

    println("\n\nMATRICULA DOS ALUNOS")
    digitalHouseManager.matricularAluno(1101,20001)
    digitalHouseManager.matricularAluno(1102,20001)
    digitalHouseManager.matricularAluno(2201,20002)
    digitalHouseManager.matricularAluno(2202,20002)
    digitalHouseManager.matricularAluno(2203,20002)
    println("\n\n${digitalHouseManager.listaDeMatriculas}")


}