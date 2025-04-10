import java.util.Date;

class Livro {
    private String nome;
    private String autor;
    private String editora;
    private String edicao;

    public Livro(String nome, String autor, String editora, String edicao) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", edicao='" + edicao + '\'' +
                '}';
    }
}