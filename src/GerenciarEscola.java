import java.util.Scanner;

public class GerenciarEscola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();
        turma.setNome("Turma A");
        turma.setTamanhoMaximo(30); // Definindo o tamanho máximo da turma

        boolean continuar = true;

        while (continuar) {
            System.out.println("### Menu ###");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Remover aluno");
            System.out.println("3. Listar alunos");
            System.out.println("4. Definir professor");
            System.out.println("5. Mostrar informações da turma");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno a ser adicionado: ");
                    String nomeAluno = scanner.nextLine();
                    turma.adicionarAluno(nomeAluno);
                    break;
                case 2:
                    System.out.print("Digite o nome do aluno a ser removido: ");
                    String nomeAlunoRemover = scanner.nextLine();
                    turma.removerAluno(nomeAlunoRemover);
                    break;
                case 3:

                    turma.listarAlunos();
                    break;
                case 4:
                    System.out.print("Digite o nome do professor: ");
                    String nomeProfessor = scanner.nextLine();
                    Professor professor = new Professor();
                    professor.setNome(nomeProfessor);
                    turma.definirProfessor(professor);
                    break;
                case 5:
                    System.out.println("Informações da turma:");
                    System.out.println(turma);
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha um número de 1 a 6.");
                    break;
            }
        }
        scanner.close();
    }
}
