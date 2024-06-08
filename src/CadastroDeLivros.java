public class CadastroDeLivros {
    public static void main(String[] args){

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo@gmail.com";
        autor.cpf = "123.456.789.10";

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java");
        livro.setDescricao("Aprendendo Java");
        livro.setValor(49.90);
        livro.setISBN("978-85-66250-46-6");
        livro.mostrarDetalhes();
        System.out.println("\n");

    }
}
