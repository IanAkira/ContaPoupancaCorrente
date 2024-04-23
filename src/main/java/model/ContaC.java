package model;

public class ContaC extends Conta {

    private double taxaServico;

    public ContaC(double saldo, double deposito, String nome) {
        super(saldo, deposito, nome);
    }

    public ContaC() {
        this(0, 0, 0, "");
    }

    public ContaC(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    public ContaC(double taxaServico, double saldo, double deposito, String nome) {
        super(saldo, deposito, nome);
        this.taxaServico = taxaServico;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

}
