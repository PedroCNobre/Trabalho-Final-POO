import java.util.ArrayList;

public class Professor extends Pessoa {
    private String especialidades;
    private ArrayList<String> disciplinas = new ArrayList<>();
    private boolean atribuido;

    private String nome;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtribuido() {
        return atribuido;
    }

    public void setAtribuido(boolean atribuido) {
        this.atribuido = atribuido;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Nome do Professor: " + this.getNome() + "\nDisciplinas do professor: " + this.getDisciplinas();
    }
}

