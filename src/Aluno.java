import java.util.ArrayList;


public class Aluno extends Pessoa {
    private int matricula;
    private ArrayList<Double> Notas = new ArrayList<Double>();

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Double> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        Notas = notas;
    }

    public Double calcularMedia() {
        if (this.Notas.isEmpty()) {
            return 0.0; // Retorna 0 se não houver notas
        } else {
            double soma = 0.0;
            for (Double nota : this.Notas) {
                soma += nota;
            }
            return soma / this.Notas.size();
        }
    }
    public void alterarNota(int indice, double novaNota) {
        if (indice >= 0 && indice < this.Notas.size()) {
            this.Notas.set(indice, novaNota);
            System.out.println("Nota alterada com sucesso!");
        } else {
            System.out.println("Índice inválido. A nota não foi alterada.");
        }
    }

    @Override
    public String toString() {
        String objeto;
        objeto = "Nome: " + this.getNome() + " " + "\n" + "Média do Aluno: " + this.calcularMedia() ;


        return objeto;
    }
}



