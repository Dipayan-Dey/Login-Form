import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form extends JFrame  implements ActionListener {

    Container c;
    JLabel label1, label2;
    JTextField user;
    JPasswordField password;
    JButton btn;
    Cursor cr;

    Form() {
        c = this.getContentPane();
        c.setLayout(null);

        // label start
        label1 = new JLabel("User Name:");
        label2 = new JLabel("Password:");

        label1.setBounds(20, 100, 100, 30);
        label2.setBounds(20, 150, 100, 30);

        Font font = new Font("Arial", Font.BOLD, 16);
        label1.setFont(font);
        label2.setFont(font);
        c.add(label1);
        c.add(label2);
        // label end

        // textfield start
        user = new JTextField();
        user.setBounds(130, 100, 200, 30);
        c.add(user);
        // textfield end
        // passfield start
        password = new JPasswordField();
        password.setBounds(130, 150, 200, 30);
        c.add(password);
        // passfield end

        btn = new JButton("Click Me");
        btn.setBounds(150, 200, 100, 30);
        cr = new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(cr);
        btn.addActionListener(this);

        c.add(btn);

        setTitle("Login Form");
        setSize(400, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed (ActionEvent e){
    System.out.println("Usename:  "+user.getText());
    System.out.println("Password:  "+password.getText());
    }
}

public class LoginForm {
    public static void main(String[] args) {
        Form login = new Form();
    }
}
