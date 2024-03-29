package com.tabelabrasileirao;

import java.util.Scanner;

public class TabelaBrasileirao {
    public static void main(String[] args) { // Início do método main
        // Lista de times do Brasileirão
        String[] times = { // Declaração e inicialização de uma array de strings chamada "times"
                "América Mineiro", "Athletico-PR", "Atlético Mineiro", "Bahia", "Botafogo", // Elementos da array
                "Corinthians", "Coritiba", "Cruzeiro", "Cuiabá", "Flamengo", // Continuação dos elementos da array
                "Fluminense", "Fortaleza", "Goiás", "Grêmio", "Internacional", // Continuação dos elementos da array
                "Palmeiras", "Red Bull Bragantino", "Santos", "São Paulo", "Vasco" // Continuação dos elementos da array
        }; // Fim da inicialização da array "times"

        int[] pontuacoes = new int[times.length]; // Declaração e inicialização de uma array de inteiros chamada
                                                  // "pontuacoes"
        // Array para armazenar as pontuações

        int[] cartoesAmarelos = new int[times.length];

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para leitura de entrada

        while (true) { // Início do loop while
            // Exibe o menu principal
            System.out.println("\nEscolha uma opção:"); // Imprime uma mensagem
            System.out.println("1 - Visualizar Tabela"); // Imprime uma mensagem
            System.out.println("2 - Editar Pontuação"); // Imprime uma mensagem
            System.out.println("3 - Editar Cartão Amarelo");
            System.out.println("0 - Sair"); // Imprime uma mensagem
            
            int opcao = scanner.nextInt(); // Recebe a opção do usuário

            switch (opcao) { // Início da estrutura de seleção switch
                case 0: // Caso a opção seja 0
                    scanner.close(); // Fecha o scanner
                    return; // Encerra o programa
                case 1: // Caso a opção seja 1
                    exibirTabela(times, pontuacoes, cartoesAmarelos); // Chama o módulo para exibir a tabela
                    break; // Sai do switch
                case 2: // Caso a opção seja 2
                    editarPontuacao(times, pontuacoes, cartoesAmarelos, scanner); // Chama o módulo para editar a pontuação
                    break; // Sai do switch
                    case 3:
                    editarCartoesAmarelos(times, pontuacoes, cartoesAmarelos, scanner);
                    break;
                default:

                System.out.println("Opção inválida. Tente novamente."); // Mensagem para opção inválida
                    break; // Sai do switch
            } // Fim da estrutura de seleção switch
        } // Fim do loop while
    } // Fim do método main
      // Módulo para exibir a tabela

    public static void exibirTabela(String[] times, int[] pontuacoes, int[] cartoesAmarelos) { // Início do método exibirTabela
        System.out.println("\nPosição | Time | Pontuação | Cartões Amarelo"); // Imprime uma mensagem
        for (int i = 0; i < times.length; i++) { // Início do loop for
            System.out.println((i + 1) + " | " + times[i] + " | " + pontuacoes[i] + " | " + cartoesAmarelos[i]); // Imprime a posição, o time e a
                                                                                    // pontuação
        } // Fim do loop for
    } // Fim do método exibirTabela

      // Módulo para exibir os times disponíveis para edição
    public static void exibirTimes(String[] times, int[] pontuacoes, int[] cartoesAmarelos) { // Início do método exibirTimes
        for (int i = 0; i < times.length; i++) { // Início do loop for
            System.out.println((i + 1) + " - " + times[i] + " | Pontuação: " + pontuacoes[i] + " | Cartões Amarelos:" + cartoesAmarelos[i]); // Imprime a posição, o
                                                                                               // time e a pontuação
        } // Fim do loop for
    } // Fim do método exibirTimes

    // Módulo para editar a pontuação dos times
    public static void editarPontuacao(String[] times, int[] pontuacoes, int[] cartoesAmarelos, Scanner scanner) { // Início do método
                                                                                            // editarPontuacao
        while (true) { // Início do loop while
            // Exibe os times disponíveis para edição
            System.out.println("\nTimes disponíveis para edição:"); // Imprime uma mensagem
            exibirTimes(times, pontuacoes, cartoesAmarelos); // Chama o módulo para exibir os times
            System.out.println("Escolha o número do time para editar a pontuação (ou 0 para voltar):"); // Imprime uma
            // mensagem
            int posicao = scanner.nextInt(); // Recebe a posição escolhida pelo usuário

            if (posicao == 0) { // Se a posição escolhida for 0
                break; // Sai do loop de edição
            }
            if (posicao >= 1 && posicao <= times.length) { // Se a posição estiver dentro do intervalo válido
                System.out.println("Digite a nova pontuação para " + times[posicao - 1] + ":"); // Imprime uma mensagem
                int novaPontuacao = scanner.nextInt(); // Recebe a nova pontuação

                if (novaPontuacao >= 0) { // Se a nova pontuação for não-negativa
                    pontuacoes[posicao - 1] = novaPontuacao; // Atualiza a pontuação
                } else { // Se a nova pontuação for negativa
                    System.out.println("A pontuação não pode ser negativa."); // Mensagem de erro
                }
            } else { // Se a posição escolhida for inválida
                System.out.println("Posição inválida. Tente novamente."); // Mensagem de erro
            }

            scanner.nextLine(); // Limpa o buffer do scanner
        } // Fim do loop while
        ordenarPorPontuacaoECartoes(times, pontuacoes, cartoesAmarelos ); // Chama o módulo para ordenar por pontuação
    } // Fim do método editarPontuacao

    public static void editarCartoesAmarelos(String[] times, int[] pontuacoes, int[] cartoesAmarelos, Scanner scanner) {
        while(true) {
            System.out.println("\nTimes disponíveis para edição:");
            exibirTimes(times, pontuacoes, cartoesAmarelos);
            System.out.println("\nEscolha o número do time para editar os cartões amarelos(ou 0 para voltar):");
            int posicao = scanner.nextInt();
            if (posicao==0) {
                break;
            }
            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite o novo número de cartões amarelos do" + times[posicao - 1] + ":");
                int novosCartoes = scanner.nextInt();
                if (novosCartoes >= 0) {
                    cartoesAmarelos[posicao - 1] = novosCartoes;
                } else {
                    System.out.println("O número de cartões amarelos não pode ser negativo.");
                }
            } else {
                System.out.println("Posição inválida, tente novamente");
            }
            scanner.nextLine();
        }
    }

    // Módulo para ordenar os times por pontuação
    public static void ordenarPorPontuacaoECartoes(String[] times, int[] pontuacoes, int[] cartoesAmarelos) {
        for (int i = 0; i < pontuacoes.length - 1; i++) {
            for (int j = i + 1; j < pontuacoes.length; j++) {
                
                if (pontuacoes[i] < pontuacoes[j] || (pontuacoes[i] == pontuacoes[j] && cartoesAmarelos[i] > cartoesAmarelos[j])) {
                    // Troca as pontuações
                    int tempPontuacao = pontuacoes[i];
                    pontuacoes[i] = pontuacoes[j];
                    pontuacoes[j] = tempPontuacao;
                    
                    int tempCartoes = cartoesAmarelos[i];
                    cartoesAmarelos[i] = cartoesAmarelos[j];
                    cartoesAmarelos[i] = tempCartoes;
                    // Troca os times
                    String tempTime = times[i];
                    times[i] = times[j];
                    times[j] = tempTime;
                }
            }
        }
    }
}
