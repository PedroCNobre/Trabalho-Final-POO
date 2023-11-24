import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
//Menu do projeto
public class GerenciarEscola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();


        boolean continuar = true;

        while (continuar) {
            System.out.println("### Menu ###");
            System.out.println("1. Digite o tamanho maximo da sala de aula");
            System.out.println("2. Digite o nome da turma");
            System.out.println("3. Adicionar aluno");
            System.out.println("4. Remover aluno");
            System.out.println("5. Listar alunos");
            System.out.println("6. Definir professor");
            System.out.println("7. Mostrar informações da turma");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o tamanho maximo da sala de aula");
                    Integer Tmax = Integer.valueOf(scanner.next());
                    turma.setTamanhoMaximo(Tmax);
                    break;
                case 2:
                    System.out.println("Digite o nome da turma");
                String Tnome = scanner.nextLine();
                 turma.setNomeT(Tnome);
                    break;
                case 3:
                 if (turma.getTamanhoMaximo() == 0){
                     System.out.println("Não foi definido o tamanho da turma! ");
                     break;

                 } else {
                     System.out.print("Digite o nome do aluno a ser adicionado: ");
                     String nomeAluno = scanner.nextLine();
                     turma.adicionarAluno(nomeAluno);
                     break;
                 }
                case 4:
                    System.out.print("Digite o nome do aluno a ser removido: ");
                    String nomeAlunoRemover = scanner.nextLine();
                    turma.removerAluno(nomeAlunoRemover);
                    break;
                case 5:

                    turma.listarAlunos();
                    break;
                case 6:
                    //Pede e passa os valores do professor para a função
                    Professor professor = new Professor();
                    System.out.println("digite o nome do professor");
                    String nome = scanner.nextLine();
                    professor.setNome(nome);
                    System.out.println("digite a especialidade do professor");
                    String esp = scanner.nextLine();
                    professor.setEspecialidades(esp);
                    System.out.println("digite a disciplina do professor");
                    ArrayList<String> disciplinas = new ArrayList<>();
                    String dis = scanner.nextLine();
                    disciplinas.add(dis);
                    professor.setEspecialidades(String.valueOf(disciplinas));
                    turma.definirProfessor(nome,esp,disciplinas);
                    break;
                case 7:
                    System.out.println("Informações da turma:");
                    System.out.println(turma);
                    break;
                case 8:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha um número de 1 a 6.");
                    break;
            }
        }
        scanner.close(); //Fecha o scanner
    }
}
