import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DollarToCoins {

    public static void main(String[] args) {
        // Criação da janela principal
        JFrame frame = new JFrame("Conversor de Dólares para Moedas");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        // Rótulo e campo de entrada
        JLabel label = new JLabel("Insira um valor em dólares (ex.: 2.75):");
        JTextField textField = new JTextField();

        // Botão de conversão
        JButton convertButton = new JButton("Converter");

        // Área de resultado
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);

        // Adicionando os componentes ao painel
        panel.add(label);
        panel.add(textField);
        panel.add(convertButton);
        panel.add(new JLabel("Resultado:"));
        panel.add(resultArea);

        // Adicionando o painel ao frame
        frame.add(panel);

        // Lógica do botão de conversão
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();

                try {
                    // Conversão do valor inserido em float
                    float dollarValue = Float.parseFloat(input);

                    // Conversão para centavos
                    int totalCents = Math.round(dollarValue * 100);

                    // Cálculo das moedas
                    int quarters = totalCents / 25;
                    totalCents %= 25;

                    int dimes = totalCents / 10;
                    totalCents %= 10;

                    int nickels = totalCents / 5;
                    totalCents %= 5;

                    int pennies = totalCents;

                    // Exibição do resultado
                    resultArea.setText(
                            "Total em centavos: " + (Math.round(dollarValue * 100)) + "\n" +
                            "Moedas:\n" +
                            "Quarters (25¢): " + quarters + "\n" +
                            "Dimes (10¢): " + dimes + "\n" +
                            "Nickels (5¢): " + nickels + "\n" +
                            "Pennies (1¢): " + pennies
                    );
                } catch (NumberFormatException ex) {
                    // Tratamento de erro para entrada inválida
                    resultArea.setText("Por favor, insira um valor válido em dólares.");
                }
            }
        });

        // Exibir a janela
        frame.setVisible(true);
    }
}
