fun main() {

    val manager = DigitalHouseManager()

    manager.registrarProfessorTitular("Garrosh", "Hellscream", 130, 2, "Lógica")
    manager.registrarProfessorTitular("Arthas", "Menethil", 66, 16, "Kotlin")

    manager.registrarProfessorAdjunto("General", "Nazgrim", 1, 120, 26)
    manager.registrarProfessorAdjunto("Bolvar", "Fordragon", 10, 150, 21)

    manager.registrarCurso("Full Stack", 20001, 3)
    manager.registrarCurso("Android", 20002, 2)

    manager.alocarProfessores(20001, 130, 120)
    manager.alocarProfessores(20002, 66, 150)

    manager.matricularAluno("Vitor", "Zen", 24)
    manager.matricularAluno("Gabriel", "Veiga", 420)
    manager.matricularAluno("Vitória", "Ficagna", 4280)
    manager.matricularAluno("Matheus", "Lynth", 666)
    manager.matricularAluno("Gudailo", "Nascimento", 85)

    manager.matricularAlunoAoCurso(24, 20001)
    manager.matricularAlunoAoCurso(420, 20001)
    manager.matricularAlunoAoCurso(4280, 20002)
    manager.matricularAlunoAoCurso(666, 20002)
    manager.matricularAlunoAoCurso(85, 20002)



}