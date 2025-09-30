public class Emprestimo {
    private Aluno aluno;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    // Construtor
    public Emprestimo(Aluno aluno, Livro livro, String dataEmprestimo, String dataDevolucao) {
        this.aluno = aluno;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    // Getters
    public Aluno getAluno() {
        return aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    // Setters
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    // toString
    @Override
    public String toString() {
        return "Empréstimo{" +
                "aluno=" + aluno.getNome() +
                ", livro=" + livro.getTitulo() +
                ", dataEmprestimo='" + dataEmprestimo + '\'' +
                ", dataDevolucao='" + dataDevolucao + '\'' +
                '}';
    }
}
