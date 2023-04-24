import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainLayout extends JPanel implements ActionListener {

    private JFrame calc = new JFrame("RNP Calculator");
    private JPanel panel = new JPanel();
    private JButton key_1 = new JButton("1");
    private JButton key_2 = new JButton("2");
    private JButton key_3 = new JButton("3");
    private JButton key_4 = new JButton("4");
    private JButton key_5 = new JButton("5");
    private JButton key_6 = new JButton("6");
    private JButton key_7 = new JButton("7");
    private JButton key_8 = new JButton("8");
    private JButton key_9 = new JButton("9");
    private JButton key_0 = new JButton("0");
    private JButton key_equal = new JButton("=");
    private JButton key_dot = new JButton(".");
    private JButton key_division = new JButton("/");
    private JButton key_sum = new JButton("+");
    private JButton key_substraction = new JButton("-");
    private JButton key_multiplication = new JButton("x");
    private JButton key_delete = new JButton("DEL");
    private JButton key_reset = new JButton("AC");
    //private JButton key_1 = new JButton("1");

    public MainLayout() {
        calc.setBounds(0, 0, 400, 400);
        calc.setDefaultCloseOperation(3);
        calc.setLayout(new GridLayout(5, 4));
        calc.add(key_7);
        calc.add(key_8);
        calc.add(key_9);
        calc.add(key_sum);
        calc.add(key_4);
        calc.add(key_5);
        calc.add(key_6);
        calc.add(key_substraction);
        calc.add(key_1);
        calc.add(key_2);
        calc.add(key_3);
        calc.add(key_multiplication);
        calc.add(key_dot);
        calc.add(key_0);
        calc.add(key_delete);
        calc.add(key_division);
        calc.add(key_equal);
        calc.add(key_reset);


        calc.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent aEvent) {

    }
}
