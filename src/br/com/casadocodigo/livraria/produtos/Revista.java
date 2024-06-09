package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Editora;

public class Revista implements Produto, Promocional {
    
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    String getDescricao() {
        return this.descricao;
    }

    void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    void setEditora(Editora editora) {
        this.editora = editora;
    }

    Editora getEditora() {
        return this.editora;
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.1) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

}
