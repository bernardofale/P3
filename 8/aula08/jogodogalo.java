package aula08;
import javax.swing.*;

//MAXIMIZAR PARA FUNCIONAR

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jogodogalo extends JFrame{
    private JPanel mainP;
    private static String currentP;
    private static boolean winner;
    private static JToggleButton[][] jg;
    private static int cont=0;

    public jogodogalo(String x) {
        super("Jogo do Galo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(500, 200);
        setSize(350, 400);
        mainP = new JPanel();
        mainP.setLayout(new GridLayout(3, 3));
        setContentPane(mainP);
        setIconImage(new ImageIcon(getClass().getResource("/image/icon.png")).getImage());

        currentP =x.toUpperCase();
        jg = new JToggleButton[3][3];
        winner = false;
        board();


    }
    private void board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JToggleButton btn = new JToggleButton();
                btn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 100));
                jg[i][j]=btn;
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(((JToggleButton)e.getSource()).getText().equals("") && winner==false){
                            btn.setText(currentP);
                            winner();
                            changeP();
                            cont++;
                        }

                    }
                });
                mainP.add(btn);
            }
        }
    }
    private void changeP(){
        if(currentP.equals("X")){
            currentP="O";
        }else{
            currentP="X";
        }

    }
    private void winner(){
        if(jg[0][0].getText().equals(currentP) && jg[1][0].getText().equals(currentP) && jg[2][0].getText().equals(currentP)){
            JOptionPane.showMessageDialog(null, "Player "+currentP+" won!");
            winner=true;
            System.exit(0);

        }else if(jg[0][1].getText().equals(currentP) && jg[1][1].getText().equals(currentP) && jg[2][1].getText().equals(currentP)){
            JOptionPane.showMessageDialog(null, "Player "+currentP+" won!");
            winner=true;
            System.exit(0);
        }else if(jg[0][2].getText().equals(currentP) && jg[1][2].getText().equals(currentP) && jg[2][2].getText().equals(currentP)){
                JOptionPane.showMessageDialog(null, "Player "+currentP+" won!");
                winner=true;
                System.exit(0);
        
        }else if(jg[0][0].getText().equals(currentP) && jg[0][1].getText().equals(currentP) && jg[0][2].getText().equals(currentP)){
            JOptionPane.showMessageDialog(null, "Player "+currentP+" won!");
            winner=true;
            System.exit(0);

        }else if(jg[1][0].getText().equals(currentP) && jg[1][1].getText().equals(currentP) && jg[1][2].getText().equals(currentP)){
            JOptionPane.showMessageDialog(null, "Player "+currentP+" won!");
            winner=true;
            System.exit(0);

        }else if(jg[2][0].getText().equals(currentP) && jg[2][1].getText().equals(currentP) && jg[2][2].getText().equals(currentP)){
            JOptionPane.showMessageDialog(null, "Player "+currentP+" won!");
            winner=true;
            System.exit(0);

        }else if(jg[0][0].getText().equals(currentP) && jg[1][1].getText().equals(currentP) && jg[2][2].getText().equals(currentP)){
            JOptionPane.showMessageDialog(null, "Player "+currentP+" won!");
            winner=true;
            System.exit(0);
        }else if(jg[0][2].getText().equals(currentP) && jg[1][1].getText().equals(currentP) && jg[2][0].getText().equals(currentP)){
            JOptionPane.showMessageDialog(null, "Player "+currentP+" won!");
            winner=true;
            System.exit(0);
        }else if(cont>=8){
            JOptionPane.showMessageDialog(null, "Tie!");
            System.exit(0);
        }
    }

}