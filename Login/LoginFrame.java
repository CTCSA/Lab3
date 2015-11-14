

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginFrame extends JFrame {
  JPanel contentPane;
  JLabel jLabel1 = new JLabel();
  JTextField userIDTF = new JTextField();
  JLabel jLabel2 = new JLabel();
  JTextField passwordTF = new JTextField();
  JButton loginButton = new JButton();
  Control control;
 
  public LoginFrame(Control control) {
    this.control = control;
       
    createUI();
    
    loginButton.addActionListener(new LoginAdapter(userIDTF, passwordTF, control));
  }
  
  private void createUI() {
    contentPane = (JPanel) this.getContentPane();
    jLabel1.setText("UserID");
    jLabel1.setBounds(new Rectangle(33, 34, 80, 34));
    contentPane.setLayout(null);
    this.setSize(new Dimension(400, 300));
    this.setTitle("login");
    userIDTF.setBounds(new Rectangle(126, 37, 131, 26));
    jLabel2.setText("Password");
    jLabel2.setBounds(new Rectangle(33, 97, 92, 33));
    passwordTF.setBounds(new Rectangle(128, 95, 128, 31));
    loginButton.setText("Login");
    loginButton.setBounds(new Rectangle(66, 186, 219, 33));
    contentPane.add(jLabel1, null);
    contentPane.add(userIDTF, null);
    contentPane.add(passwordTF, null);
    contentPane.add(jLabel2, null);
    contentPane.add(loginButton, null);
  }
}
