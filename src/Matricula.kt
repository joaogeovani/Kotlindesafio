import java.text.SimpleDateFormat
import java.util.*

data class Matricula (val aluno : Aluno, val curso : Curso) {

    private val dataFormat = SimpleDateFormat("dd/MM/yyyy")
    val dataDeMatricula = dataFormat.format(Date())

    init {

        println("Aluno ${aluno.nome} ${aluno.sobrenome} foi matriculado " +
        "para o curso de ${curso.nome} na data de $dataDeMatricula")
    }

}