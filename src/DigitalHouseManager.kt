class DigitalHouseManager {

    private val cursos = mutableListOf<Curso>()
    private val alunos = mutableListOf<Aluno>()
    private val professores = mutableListOf<Professor>()
    private val matriculas = mutableListOf<Matricula>()

    fun registrarCurso (nome : String, codigoDoCurso : Int, quantidadeMaximaDeAlunos : Int) {
        val curso = Curso(nome, codigoDoCurso, quantidadeMaximaDeAlunos)
        cursos.add(curso)
    }

    fun excluirCurso (codigoCurso : Int) {
        for (curso in cursos) {
            if (curso.codigoDeCurso == codigoCurso) {
                cursos.remove(curso)
            }
        }
    }

    fun registrarProfessorAdjunto (nome : String, sobrenome : String,tempoDeCasa: Int, codigoProfessor : Int, quantidadeDeHoras : Int) {
        val professorAdjunto = ProfessorAdjunto (nome, sobrenome, tempoDeCasa, codigoProfessor, quantidadeDeHoras)
        professores.add(professorAdjunto)
    }

    fun registrarProfessorTitular (nome : String, sobrenome : String, codigoProfessor : Int, tempoDeCasa : Int, exp : String) {
        val professorTitular = ProfessorTitular (nome, sobrenome, tempoDeCasa, codigoProfessor, exp)
        professores.add(professorTitular)
    }

    fun excluirProfessor (codigoProfessor : Int) {
        for (professor in professores) {
            if (professor.codigoDeProfessor == codigoProfessor) {
                professores.remove(professor)
            }
        }
    }

    fun matricularAluno (nome : String, sobrenome : String, codigoDeAluno : Int) {
        val aluno = Aluno (nome, sobrenome, codigoDeAluno)
        alunos.add(aluno)
    }

    fun matricularAlunoAoCurso (codigoDeAluno : Int, codigoDoCurso: Int) {

        var alunoEncontrado : Aluno? = null
        var cursoEncontrado : Curso? = null

        for (aluno in alunos) {
            if (aluno.codigoDeAluno == codigoDeAluno) {
                alunoEncontrado = aluno
            }
        }

        for (curso in cursos) {
            if (curso.codigoDeCurso == codigoDoCurso) {
                cursoEncontrado = curso
            }
        }

        if (alunoEncontrado != null && cursoEncontrado != null) {

            val matriculaFeita = cursoEncontrado.adicionarUmAluno(alunoEncontrado)
            if (matriculaFeita) {
                val matricula = Matricula (alunoEncontrado, cursoEncontrado)
                matriculas.add(matricula)
                println("Você ${alunoEncontrado.nome} ${alunoEncontrado.sobrenome} foi matriculado com sucesso " +
                        "para o curso de ${cursoEncontrado.nome}! :D")
            } else {
                println("Infelizmente não temos vagas disponíveis para este curso. :(")
            }
        }
    }

    fun alocarProfessores (codigoDoCurso : Int, codigoProfessorTitular : Int, codigoProfessorAdjunto : Int) {

        var cursoEncontrado : Curso? = null
        var professorTitularEncontrado : ProfessorTitular? = null
        var professorAdjuntoEncontrado : ProfessorAdjunto? = null

        for (curso in cursos) {
            if (curso.codigoDeCurso == codigoDoCurso) {
                cursoEncontrado = curso
            }
        }

        for (professor in professores) {
            if (professor.codigoDeProfessor == codigoProfessorTitular && professor is ProfessorTitular) {
                professorTitularEncontrado = professor
            }
            if (professor.codigoDeProfessor == codigoProfessorAdjunto && professor is ProfessorAdjunto) {
                professorAdjuntoEncontrado = professor
            }
        }

        if (cursoEncontrado != null) {
            if (professorTitularEncontrado != null) {
                cursoEncontrado.professorTitular = professorTitularEncontrado
                println("Professor ${professorTitularEncontrado.nome} ${professorTitularEncontrado.sobrenome} " +
                "alocado para o curso de ${cursoEncontrado.nome}")
            }
            if (professorAdjuntoEncontrado != null) {
                cursoEncontrado.professorAdjunto = professorAdjuntoEncontrado
                println("Professor adjunto ${professorAdjuntoEncontrado.nome} ${professorAdjuntoEncontrado.sobrenome} " +
                "alocado para o curso de ${cursoEncontrado.nome}")
            }
        }
    }

}