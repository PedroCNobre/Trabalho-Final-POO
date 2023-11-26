import java.util.ArrayList;

public class Turma extends Pessoa {
    //Declaração de variaveis
    private ArrayList<String> Alunos = new ArrayList<String>();
    Professor professor = new Professor();

    public ArrayList<String> getAlunos() {
        return Alunos;
    }

    private int tamanhoMaximo;
    //gets e sets
    public int getTamanhoMaximo() {
        return tamanhoMaximo;
    }

    public void setTamanhoMaximo(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public void setAlunos(ArrayList<String> alunos) {
        Alunos = alunos;
    }

    private String NomeT;

    public String getNomeT() {
        return NomeT;
    }

    public void setNomeT(String nomeT) {
        NomeT = nomeT;
    }
    //Método para adicionar Alunos na turma
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

    //Método para remover os alunos da turma
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
    //Método para listar todos os alunos da turma
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
    //Método para definir o professor da turma
    public void definirProfessor(String nome, String esp, ArrayList<String> dis) {
        professor.setNome(nome);
        professor.setEspecialidades(esp);
        professor.setDisciplinas(dis);

        System.out.println("Professor definido para a turma com sucesso.");
    }


    //Escrita do método toString
    public String toString() {
        String objeto;
        objeto =  "\nNome da Turma: " + this.getNomeT()
                + "\nAlunos da Turma: " + this.getAlunos()
                + "\nProfessor: " + professor.getNome()
                + "\nEspecialidade: " + professor.getEspecialidades()
                + "\nDisciplinas: " + professor.getDisciplinas();



            return objeto;
    }


}
