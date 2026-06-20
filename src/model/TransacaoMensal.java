package model;

public class TransacaoMensal extends Transacao {

    private int diaPagamento;

    public TransacaoMensal(String descricao,
                           double valor,
                           String tipo,
                           int diaPagamento) {

        super(descricao, valor, tipo);
        this.diaPagamento = diaPagamento;
    }

    public int getDiaPagamento() {
        return diaPagamento;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Dia Pagamento: "
                + diaPagamento;
    }
}