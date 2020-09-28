package br.com.digitalhouse

fun main(){

    val digitalHouseManager = DigitalHouseManager()

    println("\n")
    digitalHouseManager.registrarProfessorTitular("Severo","Snape", 123,"Full Stack")
    digitalHouseManager.registrarProfessorTitular("Minerva", "McGonagall", 456, "Mobile Android")
    digitalHouseManager.registrarProfessorAdjunto("Luna", "Lovegood", 789, 8)
    digitalHouseManager.registrarProfessorAdjunto("Hermione", "Granger", 183, 6)
    println("\nREGISTRO DE PROFESSORES TITULARES E ADJUNTOS" )
    println(digitalHouseManager.listaDeProfessores)


    println("\n-------------------------------------------------------------------------------------------------------------\n")
    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)
    println("\nREGISTRO DOS CURSOS")
    println(digitalHouseManager.listaDeCursos)


    println("\n-------------------------------------------------------------------------------------------------------------\n")
    digitalHouseManager.alocarProfessores(20001,123,789)
    digitalHouseManager.alocarProfessores(20002,456,183)
    println("\nALOCOÇÃO DE PROFESSORES")
    println(digitalHouseManager.listaDeCursos)


    println("\n-------------------------------------------------------------------------------------------------------------\n")
    digitalHouseManager.registrarAluno("Harry", "Potter", 1101)
    digitalHouseManager.registrarAluno("Rony", "Weasley", 1102)
    digitalHouseManager.registrarAluno("Draco", "Malfoy", 2201)
    digitalHouseManager.registrarAluno("Gina", "Weasley", 2202)
    digitalHouseManager.registrarAluno("Lílian","Evans Potter", 2203)
    println("\nREGISTRO DOS ALUNOS")
    println(digitalHouseManager.listaDeAlunos)


    println("\n-------------------------------------------------------------------------------------------------------------\n")
    digitalHouseManager.matricularAluno(1101,20001)
    digitalHouseManager.matricularAluno(1102,20001)
    digitalHouseManager.matricularAluno(2201,20002)
    digitalHouseManager.matricularAluno(2202,20002)
    digitalHouseManager.matricularAluno(2203,20002)
    println("\nLISTA DE MATRICULAS")
    println(digitalHouseManager.listaDeMatriculas)

    println("\n-------------------------------------------------------------------------------------------------------------\n")
    println("CONSULTAR CURSO MATRICULADO")
    digitalHouseManager.consultarCurso(1101)
    }


