import java.util.ArrayList;
import java.util.Scanner;
public class Turma extends Pessoa {
    private ArrayList<String> Alunos = new ArrayList<String>();
    private String Professor;

    public ArrayList<String> getAlunos() {
        return Alunos;
    }

    private int tamanhoMaximo;

    public int getTamanhoMaximo() {
        return tamanhoMaximo;
    }

    public void setTamanhoMaximo(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public void setAlunos(ArrayList<String> alunos) {
        Alunos = alunos;
    }

    public String getProfessor() {
        return Professor;
    }


    public void setProfessor(String professor) {
        this.Professor = professor;
    }

    public boolean removerAluno(String aluno) {
        if (this.Alunos.contains(aluno)) {
            this.Alunos.remove(aluno);
            System.out.println("Aluno removido da turma com sucesso.");
            return true;
        } else {
            System.out.println("O aluno não está na turma.");
            return false;
        }
    }
    public void listarAlunos() {
        if (this.Alunos.isEmpty()) {
            System.out.println("Não há alunos na turma.");
        } else {
            System.out.println("Alunos na turma:");
            for (String aluno : this.Alunos) {
                System.out.println(aluno);
            }
        }
    }
    public void definirProfessor(Professor professor) {
        this.Professor = professor.getNome(); // Supondo que o nome do professor seja relevante para a turma
        System.out.println("Professor definido para a turma com sucesso.");
    }
    public boolean adicionarAluno(String aluno) {
        if (this.Alunos.size() < tamanhoMaximo) {
            this.Alunos.add(aluno);
            System.out.println("Aluno adicionado à turma com sucesso.");
            return true;
        } else {
            System.out.println("A turma atingiu o tamanho máximo.");
            return false;
        }
    }
    public String toString() {
        String objeto;
        objeto = "Turma: " + this.getNome() + "\nAlunos da Turma: " + this.getAlunos();
        if (this.getProfessor() != null) {
            objeto += "\nProfessor: " + this.getProfessor();
        } else {
            objeto += "\nProfessor: Nenhum professor atribuído";
        }
        return objeto;
    }


}
