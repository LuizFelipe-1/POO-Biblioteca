public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "HarperCollins", "1ª");
        Livro livro2 = new Livro("1984", "George Orwell", "Companhia das Letras", "1ª");

        Usuario usuario1 = new Usuario("Alice", "123.456.789-00", "alice@example.com");
        Usuario usuario2 = new Usuario("Bob", "987.654.321-00", "bob@example.com");

        Emprestimo emprestimo1 = new Emprestimo(livro1, usuario1, new Date());
        System.out.println("Empréstimo realizado: " + emprestimo1);

        emprestimo1.renovar();
        emprestimo1.renovar();
        emprestimo1.renovar();
        emprestimo1.renovar(); 
        System.out.println("Empréstimo após renovação: " + emprestimo1);
        System.out.println("Multa total: R$" + emprestimo1.calcularMulta());

        double multaTotal = emprestimo1.calcularMulta();
        System.out.println("Livro devolvido. Multa total: R$" + multaTotal);
    }
}