package controller;

import java.util.ArrayList;
import model.Transacao;

public class FinTracker {

    private ArrayList<Transacao> transacoes = new ArrayList<>();

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public void listarTransacoes() {
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação cadastrada.");
        } else {
            for (int i = 0; i < transacoes.size(); i++) {
                System.out.println(i + " - " + transacoes.get(i));
            }
        }
    }

    public void removerTransacao(int indice) {
        if (indice >= 0 && indice < transacoes.size()) {
            transacoes.remove(indice);
            System.out.println("Transação removida com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public double calcularSaldoTotal() {
        double saldo = 0;

        for (Transacao t : transacoes) {
            if (t.getTipo().equalsIgnoreCase("receita")) {
                saldo += t.getValor();
            } else {
                saldo -= t.getValor();
            }
        }

        return saldo;
    }
}