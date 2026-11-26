import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {

        // Declaração dos itens da tela
        JFrame screen = new JFrame("Login Java");
        JButton login = new JButton("Entrar");
        JLabel userLabel = new JLabel("Usuário:");
        JLabel passLabel = new JLabel("Senha:");
        JTextField user = new JTextField();
        JPasswordField pass = new JPasswordField();

        // Características da tela
        screen.setBounds(0, 0, 708, 400);
        screen.setExtendedState(JFrame.MAXIMIZED_BOTH);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.getContentPane().setBackground(Color.LIGHT_GRAY);
        screen.setVisible(true);
        screen.setLayout(null);

        // Caractéristícas dos itens na tela
        // Botão de login
        login.setBounds(50, 200, 120, 30);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userString = user.getText();
                String passString = new String(pass.getPassword());
                System.out.printf("Credenciais: \nUsuário: %s\nSenha: %s", userString, passString);
                user.setText("");
                pass.setText("");
            }
        });
        // Label user
        userLabel.setBounds(50, 50, 100, 30);
        
        // Label pass
        passLabel.setBounds(50, 110, 100, 30);

        // Texto user
        user.setBounds(50, 80, 200, 30);

        // Texto pass
        pass.setBounds(50, 140, 200, 30);

        // Adição dos itens na tela
        screen.add(login);
        screen.add(userLabel);
        screen.add(passLabel);
        screen.add(user);
        screen.add(pass);
    }
}
