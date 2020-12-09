fun main() {

    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarProfessorTitular("Garrosh", "Hellscream", 130, 2, "Lógica")
    digitalHouseManager.registrarProfessorTitular("Arthas", "Menethil", 66, 16, "Kotlin")

    digitalHouseManager.registrarProfessorAdjunto("General", "Nazgrim", 1, 120, 26)
    digitalHouseManager.registrarProfessorAdjunto("Bolvar", "Fordragon", 10, 150, 21)

    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    digitalHouseManager.alocarProfessores(20001, 130, 120)
    digitalHouseManager.alocarProfessores(20002, 66, 150)

    digitalHouseManager.matricularAluno("Vitor", "Zen", 24)
    digitalHouseManager.matricularAluno("Gabriel", "Veiga", 420)
    digitalHouseManager.matricularAluno("Vitória", "Ficagna", 4280)
    digitalHouseManager.matricularAluno("Matheus", "Lynth", 666)
    digitalHouseManager.matricularAluno("Gudailo", "Nascimento", 85)

    digitalHouseManager.matricularAlunoAoCurso(24, 20001)
    digitalHouseManager.matricularAlunoAoCurso(420, 20001)
    digitalHouseManager.matricularAlunoAoCurso(4280, 20002)
    digitalHouseManager.matricularAlunoAoCurso(666, 20002)
    digitalHouseManager.matricularAlunoAoCurso(85, 20002)



}