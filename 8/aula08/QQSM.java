package aula08;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class QQSM extends JFrame {
    private JPanel mainP;
    private PergResp x;
    private static JButton[] respostas;
    private static int i=0; //index da lista de soluções
    private static int b=0; //index da lista de perguntas
    private static int z=0; //index da lista de respostas
    private JPanel answersP;
    private JPanel questionP;
    private JPanel helpP;

    public QQSM() {
        super("Quem Quer Ser Milionário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(500, 200);
        setSize(500, 600);
        try {
            x = new PergResp();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // main panel
        mainP = new JPanel();
        mainP.setLayout(new BorderLayout());

        setContentPane(mainP);
        mainP.setOpaque(true);
        respostas=new JButton[4];


        //question panel
        questionP=new JPanel();
        JTextField pergunta=new JTextField();
        questionP.add(pergunta);
        mainP.add(answersP, BorderLayout.CENTER);


        //answers panel
        answersP=new JPanel();
        questionP.setLayout(new GridLayout(2,2));
        mainP.add(questionP, BorderLayout.NORTH);
        btn();


        //help panel
        helpP=new JPanel();
        mainP.add(helpP, BorderLayout.EAST);
    }
    private void btn(){
        for (int i = 0; i < respostas.length; i++) {
            for (int j = 0; j < respostas.length; j++) {
                JButton btn=new JButton(btnText());
                btn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 100));
                respostas[i]=btn;
                btn.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //if(){

                        //}
                    }
                });
                answersP.add(btn);

            }
        }
    }
    private void respCerta(){

    }
    private String btnText(){
        String s=x.a(i);
        i++;
        return s;
    }


}