
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class exercicio52 {

    public static void main(String args[]) {
        String computadores[][] = new String[5][2];
        computadores[0][0] = "Computador Desktop i7";
        computadores[0][1] = "5000.00";
        computadores[1][0] = "Computador Desktop i5";
        computadores[1][1] = "4000.00";
        computadores[2][0] = "Computador Desktop i3";
        computadores[2][1] = "2000.00";
        computadores[3][0] = "Computador notebook i7";
        computadores[3][1] = "4500.50";
        computadores[4][0] = "Computador notebook i5";
        computadores[4][1] = "3500.60";
        double imposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual do imposto"));
        double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual da comissao"));
        double lucro = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual da Lucro"));
        double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual do desconto"));
        for (int i = 0; i < 5; i++) {
            double preco = Double.parseDouble(computadores[i][1]);
            double precoImposto = preco * imposto / 100d;
            double precoComissao = preco * comissao / 100d;
            double precoLucro = preco * lucro / 100d;
            double precoDesconto = preco * desconto / 100d;
            DecimalFormat aproximador = new DecimalFormat(" 0.00 ");
            JOptionPane.showMessageDialog(null, "O preço do computador final do "
                    + computadores[i][0] + " é R$"
                    + aproximador.format(preco + precoImposto + precoComissao + precoLucro - precoDesconto));
        }
    }
}
