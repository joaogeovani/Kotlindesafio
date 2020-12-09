data class Curso(val nome : String,
                 val codigoDeCurso : Int,
                 val quantidadeMaximaDeAlunos : Int) {

    val alunosMatriculados = mutableListOf<Aluno>()

    var professorTitular : ProfessorTitular? = null
    var professorAdjunto : ProfessorAdjunto? = null

    fun adicionarUmAluno (umAluno : Aluno) : Boolean {

        if (alunosMatriculados.size < quantidadeMaximaDeAlunos) {
            alunosMatriculados.add(umAluno)
            return true

        }
        return false
    }

    fun excluirUmAluno (umAluno: Aluno) {
        alunosMatriculados.remove(umAluno)
    }


}