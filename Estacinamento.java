import java.util.List;
import java.util.ArrayList;

public class Estacinamento {
    public static void main(String[] args) {
        //Entrada das tarifas de estacionamento taxa de entrada + taxa por hora
        double taxaEntrada = 5.0;
        double taxaPorHora = 2.0;
        double horasEstacionado;
        int capacidadeMaxima = 100; // Capacidade máxima do estacionamento
        System.out.println("Estacionamento aberto!");
        // Aqui você pode adicionar mais lógica para o estacionamento
        // como calcular tarifas, gerenciar veículos, verificar lotação e placas duplicadas.
        //usar uma lista para armazenar os veículos estacionados
        System.out.println("Bem-vindo ao sistema de estacionamento!");
        //cira lista de veículos
        List<String> veiculos = new ArrayList<>();
        //menu de opções
        do
        {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar veículo");
            System.out.println("2 - Remover veículo");
            System.out.println("3 - Listar veículos");
            System.out.println("4 - Sair");
            
            int choice = Integer.parseInt(System.console().readLine());
            
            switch (choice) {
                case 1:
                    // Lógica para adicionar veículo
                    System.out.println("Você escolheu adicionar um veículo.");
                    System.out.println("Digite a placa do veículo:");
                    String placa = System.console().readLine();
                    veiculos.add(placa);
                    if (veiculos.size() > capacidadeMaxima) {
                        System.out.println("Estacionamento cheio! Não é possível adicionar mais veículos.");
                        veiculos.remove(placa); // Remove o veículo adicionado
                    } else {
                        System.out.println("Veículo adicionado com sucesso.");
                    }   
                    //clear
                    System.console().flush();                 
                    break;
                case 2:
                    // Lógica para remover veículo
                    System.out.println("Você escolheu remover um veículo.");
                    System.out.println("Digite a placa do veículo a ser removido:");
                    String placaRemover = System.console().readLine();
                    if (veiculos.remove(placaRemover)) {
                        System.out.println("qtd de horas estacionado:");
                        horasEstacionado = Double.parseDouble(System.console().readLine());
                        double totalAPagar = taxaEntrada + (taxaPorHora * horasEstacionado);
                        System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);
                        System.out.println("Veículo removido com sucesso.");
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;
                case 3:
                    // Lógica para listar veículos
                    System.out.println("Você escolheu listar veículos.");
                    if (veiculos.isEmpty()) {
                        System.out.println("Nenhum veículo estacionado.");
                    } else {
                        System.out.println("Veículos estacionados:");
                        for (String v : veiculos) {
                            System.out.println("- " + v);
                        }
                    }
                     System.out.println("Listando veículos...");
                    break;
                case 4:
                    System.out.println("Saindo do sistema.");
                    return; // Sair do loop e encerrar o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (true);
    }
}
