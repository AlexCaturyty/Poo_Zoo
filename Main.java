import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Main {
  static List<Animal> animais = new ArrayList<Animal>();

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int op;

    do {
      System.out.println("=== MENU ===");
      System.out.println("1. Inserir Animal");
      System.out.println("2. Remover Animal");
      System.out.println("3. Sair");
      System.out.print("Escolha uma opção: ");
      op = s.nextInt();

      switch (op) {
        case 1:
          inserirAnimal();
          break;
        case 2:
          System.out.print("Informe o ID do animal a ser removido: ");
          int idRemocao = s.nextInt();
          removerAnimal(idRemocao);
          break;
        case 3:
          System.out.println("Saindo do programa...");
          break;
        default:
          System.out.println("Tente novamente.");
      }
    } while (op != 3);

  }

  private static void inserirAnimal() {
    Scanner scanner = new Scanner(System.in);
    int id, idade, vacinas;
    String nome, corDasPenas; 
    double peso;
    boolean voa;
    double envergadura;

    System.out.println("=== Inserir Animal ===");
    System.out.print("Informe o ID do animal: ");
    id = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("Informe o nome do animal: ");
    nome = scanner.nextLine();

    System.out.println("Selecione o tipo de animal que você quer adicionar:");
    System.out.println("1. Leão");
    System.out.println("2. Lobo");
    System.out.println("3. Pato");
    System.out.println("4. Águia");
    int opcao = scanner.nextInt();
    scanner.nextLine(); 

    if (opcao == 1) {
      System.out.print("Informe a idade do leão: ");
      idade = scanner.nextInt();
      System.out.print("Informe o peso do leão: ");
      peso = scanner.nextDouble();
      System.out.print("Informe a quantidade de pelos do leão: ");
      int qtdDePelos = scanner.nextInt();
      scanner.nextLine(); 
      System.out.print("Informe a quantidade de vacinas que o leão tomou: ");
      vacinas = scanner.nextInt();

      Leao leao = new Leao(id, nome, idade, peso, qtdDePelos, vacinas);
      animais.add(leao);
      System.out.println("Leão adicionado com sucesso!");
    }if (opcao == 2) {
    System.out.print("Informe a idade do lobo: ");
    idade = scanner.nextInt();
    System.out.print("Informe o peso do lobo: ");
    peso = scanner.nextDouble();
    System.out.print("Informe a quantidade de pelos do leão: ");
    int qtdDePelos = scanner.nextInt();
    System.out.print("O lobo é o alfa da alcateia? (true/false): ");
    boolean ehAlpha = scanner.nextBoolean();
    scanner.nextLine(); 

    Lobo lobo = new Lobo(id, nome, idade, opcao, ehAlpha, qtdDePelos);
    animais.add(lobo);
    System.out.println("Lobo adicionado com sucesso!");

    } else if (opcao == 3) {
      System.out.print("Informe a idade do pato: ");
      idade = scanner.nextInt();
      System.out.print("Informe o peso do pato: ");
      peso = scanner.nextDouble();
      System.out.print("Informe a envergadura das asas do pato: ");
      envergadura = scanner.nextDouble();
      scanner.nextLine(); 
      System.out.println("Informe a cor das Penas do Pato: ");
      corDasPenas = scanner.nextLine();

      Pato pato = new Pato(id, nome, idade, opcao, envergadura, voa = false, corDasPenas);
      animais.add(pato);
      System.out.println("Pato adicionado com sucesso!");
    } else if (opcao == 4) {
      System.out.print("Informe a idade da águia: ");
      idade = scanner.nextInt();
      System.out.print("Informe o peso da águia: ");
      peso = scanner.nextDouble();
      System.out.print("Informe a envergadura das asas da águia: ");
      envergadura = scanner.nextDouble();
      scanner.nextLine(); 

      Aguia aguia = new Aguia(id, nome, idade, opcao, voa = true, envergadura, false);
      aguia.setVoa(true); // Definir a águia como animal
      animais.add(aguia);
      System.out.println("Águia adicionada com sucesso!");
    } else {
      System.out.println("Opção inválida. Animal não adicionado.");
    }
  }

  private static void removerAnimal(int id) {
        Animal animalRemovido = null;

        for (Animal animal : animais) {
            if (animal.getId() == id) {
                animalRemovido = animal;
                break;
            }
        }

        if (animalRemovido != null) {
            animais.remove(animalRemovido);
            System.out.println("Animal removido com sucesso!");
            System.out.println("Informações do animal removido:");
            System.out.println("ID: " + animalRemovido.getId());
            System.out.println("Idade: " + animalRemovido.getIdade());
            System.out.println("Nome: " + animalRemovido.getNome());

            if (animalRemovido instanceof Mamifero) {
                Mamifero mamifero = (Mamifero) animalRemovido;
                System.out.println("Pelos: " + mamifero.getQtdDePelos());

                if (mamifero instanceof Leao) {
                    Leao leao = (Leao) mamifero;
                    System.out.println("Vacinas: " + leao.getVacinas());
                } else if (mamifero instanceof Lobo) {
                    Lobo lobo = (Lobo) mamifero;
                    System.out.println("É o alfa da alcateia? " + lobo.isEhAlpha());
                }
            } else if (animalRemovido instanceof Ave) {
                Ave ave = (Ave) animalRemovido;
                System.out.println("Envergadura das asas: " + ave.getEnvergadura());

                if (ave instanceof Pato) {
                    Pato pato = (Pato) ave;
                    System.out.println("Cor das penas: " + pato.getCorPenas());
                } else if (ave instanceof Aguia) {
                    Aguia aguia = (Aguia) ave;
                    System.out.println("Gerou filhos? " + aguia.getGerouFilhos());
                }
            }
        } else {
            System.out.println("Animal não encontrado com o ID fornecido.");
        }
    }
           
                
}