// public class HideAndSeek {
//   public static void main(String[] args) {
//     System.out.println("Let's play hide and seek.");
// System.out.println("Three...");
// System.out.println("two...");
// System.out.println("One...");
// System.out.println("Ready or not, here I come!");
//     }
//     }   



public class HelloWorld {
  public static void main(String[] args) {
    
    System.out.println("Hello World!");
    System.out.println("Welcome to Java programming.");
    //args = new String[1];
    //args[0] = "John Doe"; // Simulando a entrada de nome
    //entre com seu nome pelo terminal
    System.out.println("Please enter your name:");
    String name = System.console().readLine();
      
      if (name.length() > 0) {
    
        System.out.println("Hello, " + name + "!");
      } else {
        System.out.println("Hello, stranger!");
      }
      // Simulando um loop infinito calculadora 1- soma, 2- subtração, 3 - multiplicação, 4 - divisão, 5 - sair
      System.out.println("Escolha uma operação: 1 - soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão, 5 - Sair");
      int choice = Integer.parseInt(System.console().readLine());
      do { 
        switch (choice) {
          case 1:
            System.out.println("Você escolheu Soma.");
            System.out.println("Digite o primeiro número:");
            int num1 = Integer.parseInt(System.console().readLine());
            System.out.println("Digite o segundo número:");
            int num2 = Integer.parseInt(System.console().readLine());
            int sum = num1 + num2;
            System.out.println("A soma é: " + sum);
            break;
          case 2:
            System.out.println("Você escolheu Subtração.");
            System.out.println("Digite o primeiro número:");
            int num3 = Integer.parseInt(System.console().readLine());
            System.out.println("Digite o segundo número:");
            int num4 = Integer.parseInt(System.console().readLine());
            int difference = num3 - num4;
            System.out.println("A subtração é: " + difference);
            break;
          case 3:
            System.out.println("Você escolheu Multiplicação.");
            System.out.println("Digite o primeiro número:");
            int num5 = Integer.parseInt(System.console().readLine());
            System.out.println("Digite o segundo número:");
            int num6 = Integer.parseInt(System.console().readLine());
            int product = num5 * num6;
            System.out.println("A multiplicação é: " + product);
            break;
          case 4:
            System.out.println("Você escolheu Divisão.");
            System.out.println("Digite o primeiro número:");
            int num7 = Integer.parseInt(System.console().readLine());
            System.out.println("Digite o segundo número:");
            int num8 = Integer.parseInt(System.console().readLine());
            if (num8 != 0) {
              double quotient = (double) num7 / num8;
              System.out.println("A divisão é: " + quotient);
            } else {
              System.out.println("Erro: Divisão por zero não é permitida.");
            }
            break;
          case 5:
            System.out.println("Saindo do programa. Até logo!");
            return; // Exit the program
          default:
            System.out.println("Opção inválida. Por favor, escolha uma operação válida.");
        }
        System.out.println("Escolha uma operação: 1 - soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão, 5 - Sair");
        choice = Integer.parseInt(System.console().readLine());
      } while (true);
    
  }
}