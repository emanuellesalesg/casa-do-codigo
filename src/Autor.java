public class Autor {
    String nome;
    String email;
    String cpf;

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return nome;
    }

    void setEmail(String email){
        this.email = email;
    }

    String getemail(){
        return email;
    }
    void setCPF(String cpf){
        this.cpf = cpf;
    }

    String getCPF(){
        return cpf;
    }

    void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do autor: ");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }
}
