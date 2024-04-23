package model;

public class ContaP extends Conta {

    private double juros;

    public ContaP() {
        this(0, 0, 0, "");
    }

    public ContaP(double juros) {
        this.juros = juros;
    }

    public ContaP(double juros, double saldo, double deposito, String nome) {
        super(saldo, deposito, nome);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

}
