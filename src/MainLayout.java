import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainLayout extends JPanel implements ActionListener {

    private JFrame calc = new JFrame("RNP Calculator");
    private JPanel main = new JPanel();
    private JPanel windows = new JPanel();
    private JPanel panel = new JPanel();
    private JButton input = new JButton();
    private JButton result = new JButton();
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
    private JButton key_filler = new JButton("  ");
    private JButton key_filler2 = new JButton("  ");

    public MainLayout() {
        calc.setBounds(0, 0, 400, 400);
        calc.setDefaultCloseOperation(3);

        input.setText(" ");
        result.setText(" ");

        //Principal Layout with ALL elements
        main.setLayout(new BorderLayout());

        //Secondary Layout, for input and result windows
        windows.setLayout(new GridLayout(2, 1));
        windows.add(input);
        windows.add(result);
        windows.setVisible(true);

        //Secondary Layout, for the keys
        panel.setLayout(new GridLayout(5, 4));
        panel.add(key_7);
        panel.add(key_8);
        panel.add(key_9);
        panel.add(key_sum);
        panel.add(key_4);
        panel.add(key_5);
        panel.add(key_6);
        panel.add(key_substraction);
        panel.add(key_1);
        panel.add(key_2);
        panel.add(key_3);
        panel.add(key_multiplication);
        panel.add(key_dot);
        panel.add(key_0);
        panel.add(key_equal);
        panel.add(key_division);
        panel.add(key_filler);
        panel.add(key_filler2);
        panel.add(key_delete);
        panel.add(key_reset);

        //Add action listeners to the keys
        key_0.addActionListener(this);
        key_1.addActionListener(this);
        key_2.addActionListener(this);
        key_3.addActionListener(this);
        key_4.addActionListener(this);
        key_5.addActionListener(this);
        key_6.addActionListener(this);
        key_7.addActionListener(this);
        key_8.addActionListener(this);
        key_9.addActionListener(this);
        key_0.addActionListener(this);
        key_equal.addActionListener(this);
        key_delete.addActionListener(this);
        key_division.addActionListener(this);
        key_dot.addActionListener(this);
        key_sum.addActionListener(this);
        key_substraction.addActionListener(this);
        key_multiplication.addActionListener(this);
        key_reset.addActionListener(this);
        key_filler.addActionListener(this);
        key_filler2.addActionListener(this);

        panel.setVisible(true);

        main.add(windows, BorderLayout.NORTH);
        main.add(panel, BorderLayout.CENTER);
        main.setVisible(true);

        calc.add(main);
        calc.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent aEvent) {
        Object buttonPressed = aEvent.getSource();


    }
}
