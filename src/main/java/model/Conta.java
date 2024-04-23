package model;

public class Conta {

    private double saldo;
    private double deposito;
    private String nome;

    public Conta() {

        this(0, 0, "");
    }

    public Conta(double saldo, double deposito, String nome) {
        this.saldo = saldo;
        this.deposito = deposito;
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
