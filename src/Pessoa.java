

public abstract class  Pessoa {

    private String nome;
    private String data_nascimento;
    public String getNome() {
        return nome;
    }
    public void setNome(String turmaA) {
        this.nome = nome;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    @Override
    public String toString() {
        String objeto;
        objeto = "Nome: " + this.getNome() + " " + "\n" + "Data de Nascimento: " + this.getData_nascimento() ;

        return objeto;
    }
}

