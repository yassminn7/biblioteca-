public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

public class App {
    public static void main(String[] args) {
        // Criando o objeto Aluno
        Aluno maria = new Aluno("Maria", 17, "A123");

        // Criando o objeto Livro
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        // Exibindo os dados originais
        System.out.println("Dados originais:");
        System.out.println(maria);
        System.out.println(livro);

        // Alterando a idade da aluna e o título do livro
        maria.setIdade(18);
        livro.setTitulo("Memórias Póstumas de Brás Cubas");

        // Exibindo os dados atualizados
        System.out.println("\nDados atualizados:");
        System.out.println(maria);
        System.out.println(livro);
    }
}
