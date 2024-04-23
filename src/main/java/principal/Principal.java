package principal;

import javax.swing.*;
import model.*;

public class Principal {

    public static void main(String[] args) {

        Conta Con = new Conta();
        ContaC Conc = new ContaC();
        ContaP Conp = new ContaP();
        String[] opções = {"Conta Corrente", "Conta Poupança"};

        var selection = JOptionPane.showOptionDialog(null, "Escolha o tipo de conta", "Empresa foda",
                0, 2, null, opções, opções[0]);

        if (selection == 0) {

            Conc.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
            Conc.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu saldo atual: ")));
            Conc.setTaxaServico(Double.parseDouble(JOptionPane.showInputDialog("Digite sua taxa de serviço: ")));
            JOptionPane.showMessageDialog(null, "Conta cadastrada");
            String[] opcao = {"Consultar conta", "Fazer deposito","ir pro caralho"};
            var n1 = JOptionPane.showOptionDialog(null, "O que deseja?", "Empresa foda",
                0, 2, null, opcao, opcao[0]);

            if (n1 == 0) {
                JOptionPane.showMessageDialog(null, "Nome: " + Conc.getNome() + "\n"
                        + "Saldo: " + Conc.getSaldo() + "\n"
                        + "Taxa de Serviço: " + Conc.getTaxaServico());

            }  if (selection == 1) {
               double deposito;
                deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito que vai fazer"));
            }


        }
        if (selection == 1) {

            Conp.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
            Conp.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu saldo atual: ")));
            Conp.setJuros(Double.parseDouble(JOptionPane.showInputDialog("Digite seu juros atual: ")));
            JOptionPane.showMessageDialog(null, "Conta cadastrada");

        }

    }

}

//ta bem incompleto
//so pra eu lembrar mais tarde -> deposito + juros / deposito - taxaserviço
// Con(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito que vai fazer);
//
