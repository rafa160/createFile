package main;

public class Usuario {

    private Integer id;
    private String idade;
    private String nome;
    private String endereco;

    public Usuario(){

    }

    public Usuario(Integer id,String idade,String nome,String endereco){
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String escrever(){

        return "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Endereco: " + endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
