public class Aluno {
    private String nome; 
    private int idade; 
    private String matricula;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", matricula=" + matricula + "]";
    } 

    
}
