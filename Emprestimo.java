class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private Date dataInicio;
    private int renovacoes;

    public Emprestimo(Livro livro, Usuario usuario, Date dataInicio) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataInicio = dataInicio;
        this.renovacoes = 0;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public int getRenovacoes() {
        return renovacoes;
    }

    public void renovar() {
        renovacoes++;
    }

    public double calcularMulta() {
        if (renovacoes > 3) {
            return (renovacoes - 3) * 1.0; 
        return 0.0;
    }


    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro +
                ", usuario=" + usuario +
                ", dataInicio=" + dataInicio +
                ", renovacoes=" + renovacoes +
                '}';
    }
}