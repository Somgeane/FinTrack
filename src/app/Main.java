package app;

import controller.FinTracker;
import exceptions.EntradaInvalidaException;
import java.util.Scanner;
import model.Transacao;
import model.TransacaoMensal;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FinTracker sistema = new FinTracker();

        int opcao = 0;

        do {

            System.out.println("\n===== FINTRACK - SEU CONTROLE FINANCEIRO =====");
            System.out.println("1 - Adicionar nova transacao");
            System.out.println("2 - Listar transacoes");
            System.out.println("3 - Mostrar saldo atual");
            System.out.println("4 - Remover transacao");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Digite apenas numeros.");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {

                case 1:

                    try {

                        System.out.print("Descricao: ");
                        String descricao = scanner.nextLine();

                        System.out.print("Valor: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Tipo (receita/despesa): ");
                        String tipo = scanner.nextLine();

                        if (!tipo.equalsIgnoreCase("receita")
                                && !tipo.equalsIgnoreCase("despesa")) {

                            throw new EntradaInvalidaException(
                                    "Tipo invalido. Use receita ou despesa.");
                        }

                        System.out.print("Essa transacao e mensal? (s/n): ");
                        String mensal = scanner.nextLine();

                        if (mensal.equalsIgnoreCase("s")) {

                            System.out.print("Dia do pagamento: ");
                            int dia = scanner.nextInt();
                            scanner.nextLine();

                            TransacaoMensal tm =
                                    new TransacaoMensal(
                                            descricao,
                                            valor,
                                            tipo,
                                            dia);

                            sistema.adicionarTransacao(tm);

                        } else {

                            Transacao t =
                                    new Transacao(
                                            descricao,
                                            valor,
                                            tipo);

                            sistema.adicionarTransacao(t);
                        }

                        System.out.println("Transacao cadastrada com sucesso!");

                    } catch (EntradaInvalidaException e) {

                        System.out.println(e.getMessage());

                    } catch (Exception e) {

                        System.out.println("Valor invalido.");
                        scanner.nextLine();
                    }

                    break;

                case 2:

                    sistema.listarTransacoes();

                    break;

                case 3:

                    System.out.println(
                            "Saldo atual: R$ "
                            + sistema.calcularSaldoTotal());

                    break;

                case 4:

                    try {

                        sistema.listarTransacoes();

                        System.out.print(
                                "Digite o indice da transacao para remover: ");

                        int indice = scanner.nextInt();
                        scanner.nextLine();

                        sistema.removerTransacao(indice);

                    } catch (Exception e) {

                        System.out.println("Indice invalido.");
                        scanner.nextLine();
                    }

                    break;

                case 5:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}