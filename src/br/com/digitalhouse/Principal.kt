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

    println("\n-------------------------------------------------------------------------------------------------------------")
    println("-------------------------------------------------------------------------------------------------------------\n")
    println("TESTE DE PROFESSOR, CURSO e ALUNO COM MESMO CÓDIGO")
    digitalHouseManager.registrarProfessorTitular("Dolores"," Umbridge", 123,"Front End")
    digitalHouseManager.registrarProfessorAdjunto("Horácio", "Slughorn", 789, 10)
    digitalHouseManager.registrarCurso("Back End", 20001, 5)
    digitalHouseManager.registrarAluno("Sirius", "Black", 1101)


    println("\n-------------------------------------------------------------------------------------------------------------")
    println("-------------------------------------------------------------------------------------------------------------\n")
    println("TESTE DE MÉTODOS NÃO USADOS ANTES")
    digitalHouseManager.registrarCurso("UX Design", 30002, 10)
    digitalHouseManager.registrarProfessorTitular("Rúbeo", "Hagrid", 321, "Product Designer")
    digitalHouseManager.registrarAluno("Tom", "Riddle", 3301)
    digitalHouseManager.matricularAluno(3301,30002)

    val tempCurso = digitalHouseManager.listaDeCursos.find { c -> c.equals(30002) }
    val tempAluno = digitalHouseManager.listaDeAlunos.find { a -> a.equals(3301) }
    if (tempAluno != null)
        tempCurso?.excluirUmAluno(tempAluno)
    digitalHouseManager.excluirCurso(30002)
    digitalHouseManager.excluirProfessor(321)


    println("\n-------------------------------------------------------------------------------------------------------------")
    println("-------------------------------------------------------------------------------------------------------------\n")
    println("RESULTADO FINAL DAS OPERAÇÕES")
    println("${digitalHouseManager.listaDeCursos}\n\n")
    println("${digitalHouseManager.listaDeAlunos}\n\n")
    println("${digitalHouseManager.listaDeProfessores}\n\n")
    println("${digitalHouseManager.listaDeMatriculas}\n\n")

}