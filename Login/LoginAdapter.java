
import java.awt.event.*;
import javax.swing.*;

public class LoginAdapter implements java.awt.event.ActionListener {
  Control control;
  JTextField userIDTF;
  JTextField passwordTF;
  public LoginAdapter(JTextField userIDTF, JTextField passwordTF, Control control) {
    this.control = control;
	this.userIDTF = userIDTF;
	this.passwordTF = passwordTF;
  }

  public void actionPerformed(ActionEvent e) {
    control.login(userIDTF.getText(), passwordTF.getText());
  }
}