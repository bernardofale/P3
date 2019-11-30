import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.EventListener;

import javax.swing.*;

public class Jogo2x2 extends JFrame implements EventListener{

    private JPanel panel1,panel2;
    private JButton[] b =new JButton[4];
    private String[] Jlabels = {"1","2","3","4"};
    private JTextField jtxt1;

    public Jogo2x2(String nome){
        super(nome);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1=new JPanel();
        panel2=new JPanel();

        panel2.setLayout(new GridLayout(2,2));
        panel1.setLayout(new BorderLayout());

        panel1.add(panel2,BorderLayout.CENTER);
        for (int i = 0; i < b.length; i++) {
            b[i]=new JButton(Jlabels[i]);
            panel2.add(b[i]);
            b[i].addActionListener(this);
        }
        jtxt1=new JTextField(10);
        panel1.add(jtxt1,BorderLayout.SOUTH);
        panel1.setOpaque(true);
        setSize(400,400);
        setContentPane(panel1);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        jtxt1.setText(((JButton)(e.getSource())).getText());
    }
    public static void main(String[] args){
        new Jogo2x2("Teste de P3");
    }
}