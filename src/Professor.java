import java.util.ArrayList;

public class Professor extends Pessoa {
    //Declaração das variaveis
    private String especialidades;
    private ArrayList<String> disciplinas = new ArrayList<>();

    private String nome;
    //gets e sets
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
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



    //Escrita do método toString
    @Override
    public String toString() {
        return "Nome do Professor: " + this.getNome() + "\nDisciplinas do professor: " + this.getDisciplinas() + "Especialidades: " + this.getEspecialidades();
    }
}

