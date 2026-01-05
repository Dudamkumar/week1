import java.awt.*;
import java.awt.event.*;

class AWT_Using_Calculator extends Frame implements ActionListener {
    TextField tx;
    Button n9, n8, n7, n6, n5, n4, n3, n2, n1, n0;
    Button b1, b2, b3, b4, b5, b6;
    String num1 = "", num2 = "";
    char op;

    public AWT_Using_Calculator() {
        setSize(200, 200);
        setVisible(true);
        setLayout(null);

        tx = new TextField();
        tx.setBounds(50, 50, 250, 40);
        add(tx);

        n7 = new Button("7");
        n7.setBounds(50, 100, 50, 50);
        add(n7);
       n7.addActionListener(this);
        n8 = new Button("8");
        n8.setBounds(110, 100, 50, 50);
        add(n8);
n8.addActionListener(this);
        n9 = new Button("9");
        n9.setBounds(170, 100, 50, 50);
        add(n9);
n9.addActionListener(this);
        n4 = new Button("4");
        n4.setBounds(50, 160, 50, 50);
        add(n4);
        n4.addActionListener(this);
        n5 = new Button("5");
        n5.setBounds(110, 160, 50, 50);
        add(n5);
        n5.addActionListener(this);
        n6 = new Button("6");
        n6.setBounds(170, 160, 50, 50);
        add(n6);
        n6.addActionListener(this);
        n1 = new Button("1");
        n1.setBounds(50, 220, 50, 50);
        add(n1);
        n1.addActionListener(this);
        n2 = new Button("2");
        n2.setBounds(110, 220, 50, 50);
        add(n2);
        n2.addActionListener(this);
        n3 = new Button("3");
        n3.setBounds(170, 220, 50, 50);
        add(n3);
        n3.addActionListener(this);
        n0 = new Button("0");
        n0.setBounds(50, 280, 110, 50);
        add(n0);
        n0.addActionListener(this);

        b1 = new Button("+");
        b1.setBounds(230, 100, 50, 50);
        add(b1);
        b1.addActionListener(this);
        b2 = new Button("-");
        b2.setBounds(230, 160, 50, 50);
        add(b2);
        b2.addActionListener(this);
        b3 = new Button("*");
        b3.setBounds(230, 220, 50, 50);
        add(b3);
        b3.addActionListener(this);
        b4 = new Button("/");
        b4.setBounds(230, 280, 50, 50);
        add(b4);
        b4.addActionListener(this);
        b5 = new Button("=");
        b5.setBounds(110, 340, 110, 50);
        add(b5);
        b5.addActionListener(this);
        b6 = new Button("cls");
        b6.setBounds(230, 340, 50, 50);
        add(b6);
        b6.addActionListener(this);
        
        
        
        
        
        
        
        
        
        
        
        
    }

    public void actionPerformed(ActionEvent e)
 {
        Object sc = e.getSource();
       
 if (sc == n0) tx.setText(tx.getText() + "0");
        
if (sc == n1) tx.setText(tx.getText() + "1");
        
if (sc == n2) tx.setText(tx.getText() + "2");
        
if (sc == n3) tx.setText(tx.getText() + "3");
       
 if (sc == n4) tx.setText(tx.getText() + "4");
        
if (sc == n5) tx.setText(tx.getText() + "5");
        
if (sc == n6) tx.setText(tx.getText() + "6");
        
if (sc == n7) tx.setText(tx.getText() + "7");
       
 if (sc == n8) tx.setText(tx.getText() + "8");
        
if (sc == n9) tx.setText(tx.getText() + "9");

        if (sc == b1) { num1 = tx.getText(); tx.setText(""); op = '+'; }
        if (sc == b2) { num1 = tx.getText(); tx.setText(""); op = '-'; }
        if (sc == b3) { num1 = tx.getText(); tx.setText(""); op = '*'; }
        if (sc == b4) { num1 = tx.getText(); tx.setText(""); op = '/'; }

        if (sc == b5) {
            num2 = tx.getText();
            try {
                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);
                int result = 0;
                switch (op) {
                    case '+': result = a + b; break;
                    case '-': result = a - b; break;
                    case '*': result = a * b; break;
                    case '/':
                        if (b == 0) { tx.setText("Error: Divide by Zero"); return; }
                        result = a / b; break;
                }
                tx.setText(String.valueOf(result));
            } catch (Exception ex) {
                tx.setText("Invalid Input");
            }
        }

        if (sc == b6) {
            tx.setText("");
            num1 = "";
            num2 = "";
        }
    }

    public static void main(String args[]) {
        new AWT_Using_Calculator();
    }
}