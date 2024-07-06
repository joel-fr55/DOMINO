
//aplicacion 
import javax.swing.*; //importal las libreria    
import javax.swing.event.ChangeListener;
import java.awt.Color;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Domino extends JFrame implements ActionListener {

    // public String[] Imafic = new String[28];
    public JLabel[] Imafic = new JLabel[28];

    // Agregar el boton
    JButton Iniciar;

    public Domino() {
        setLayout(null);
        setTitle("DOMINO");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(217, 217, 217));

        ImageIcon mano8 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[7] = new JLabel(mano8);
        Imafic[7].setBounds(100, -80, 400, 300);
        add(Imafic[7]);

        ImageIcon mano9 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[8] = new JLabel(mano9);
        Imafic[8].setBounds(150, -80, 400, 300);
        add(Imafic[8]);

        ImageIcon mano10 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[9] = new JLabel(mano10);
        Imafic[9].setBounds(200, -80, 400, 300);
        add(Imafic[9]);

        ImageIcon mano11 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[10] = new JLabel(mano11);
        Imafic[10].setBounds(250, -80, 400, 300);
        add(Imafic[10]);

        ImageIcon mano12 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[11] = new JLabel(mano12);
        Imafic[11].setBounds(300, -80, 400, 300);
        add(Imafic[11]);

        ImageIcon mano13 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[12] = new JLabel(mano13);
        Imafic[12].setBounds(350, -80, 400, 300);
        add(Imafic[12]);

        ImageIcon mano14 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[13] = new JLabel(mano14);
        Imafic[13].setBounds(400, -80, 400, 300);
        add(Imafic[13]);

        // ******************************************************************* */
        ImageIcon mano1 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[0] = new JLabel(mano1);
        Imafic[0].setBounds(100, 350, 400, 300);
        add(Imafic[0]);

        ImageIcon mano2 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[1] = new JLabel(mano2);
        Imafic[1].setBounds(150, 350, 400, 300);
        add(Imafic[1]);

        ImageIcon mano3 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[2] = new JLabel(mano3);
        Imafic[2].setBounds(200, 350, 400, 300);
        add(Imafic[2]);

        ImageIcon mano4 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[3] = new JLabel(mano4);
        Imafic[3].setBounds(250, 350, 400, 300);
        add(Imafic[3]);

        ImageIcon mano5 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[4] = new JLabel(mano5);
        Imafic[4].setBounds(300, 350, 400, 300);
        add(Imafic[4]);

        ImageIcon mano6 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[5] = new JLabel(mano6);
        Imafic[5].setBounds(350, 350, 400, 300);
        add(Imafic[5]);

        ImageIcon mano7 = new ImageIcon("imagen/FichaDomino.png");
        Imafic[6] = new JLabel(mano7);
        Imafic[6].setBounds(400, 350, 400, 300);
        add(Imafic[6]);

        // ******************************************************************* */
        ImageIcon mano15 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[14] = new JLabel(mano15);
        Imafic[14].setBounds(600, 300, 400, 300);
        add(Imafic[14]);

        ImageIcon mano16 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[15] = new JLabel(mano16);
        Imafic[15].setBounds(600, 250, 400, 300);
        add(Imafic[15]);

        ImageIcon mano17 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[16] = new JLabel(mano17);
        Imafic[16].setBounds(600, 200, 400, 300);
        add(Imafic[16]);

        ImageIcon mano18 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[17] = new JLabel(mano18);
        Imafic[17].setBounds(600, 150, 400, 300);
        add(Imafic[17]);

        ImageIcon mano19 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[18] = new JLabel(mano19);
        Imafic[18].setBounds(600, 100, 400, 300);
        add(Imafic[18]);

        ImageIcon mano20 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[19] = new JLabel(mano20);
        Imafic[19].setBounds(600, 50, 400, 300);
        add(Imafic[19]);

        ImageIcon mano21 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[20] = new JLabel(mano21);
        Imafic[20].setBounds(600, -0, 400, 300);
        add(Imafic[20]);

        ImageIcon mano22 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[21] = new JLabel(mano22);
        Imafic[21].setBounds(-100, 300, 400, 300);
        add(Imafic[21]);

        ImageIcon mano23 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[22] = new JLabel(mano23);
        Imafic[22].setBounds(-100, 250, 400, 300);
        add(Imafic[22]);

        ImageIcon mano24 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[23] = new JLabel(mano24);
        Imafic[23].setBounds(-100, 200, 400, 300);
        add(Imafic[23]);

        ImageIcon mano25 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[24] = new JLabel(mano25);
        Imafic[24].setBounds(-100, 150, 400, 300);
        add(Imafic[24]);

        ImageIcon mano26 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[25] = new JLabel(mano26);
        Imafic[25].setBounds(-100, 100, 400, 300);
        add(Imafic[25]);

        ImageIcon mano27 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[26] = new JLabel(mano27);
        Imafic[26].setBounds(-100, 50, 400, 300);
        add(Imafic[26]);

        ImageIcon mano28 = new ImageIcon("imagen/FichaDominoREV.png");
        Imafic[27] = new JLabel(mano28);
        Imafic[27].setBounds(-100, 0, 400, 300);
        add(Imafic[27]);

        // ******************************************* Agregar boton
        Iniciar = new JButton("INICIAR");
        Iniciar.setFont(new Font("Calibri", 1, 23));
        Iniciar.setBounds(350, 560, 120, 40);
        Iniciar.setForeground(new Color(59, 54, 149));
        Iniciar.setBackground(new Color(242, 243, 161));
        add(Iniciar);
        Iniciar.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Iniciar) {
            Fichas lasFichas = new Fichas();
            lasFichas.sellecionar();
            lasFichas.Nombrar();
            lasFichas.Repartir();

            for (int i = 0; i <= 6; i++) {
                Imafic[i].setBounds(-550, -550, 400, 300);
            }
            ImageIcon mano1 = new ImageIcon(lasFichas.mano1);
            Imafic[0] = new JLabel(mano1);
            Imafic[0].setBounds(100, 350, 400, 300);
            add(Imafic[0]);

            ImageIcon mano2 = new ImageIcon(lasFichas.mano2);
            Imafic[1] = new JLabel(mano2);
            Imafic[1].setBounds(150, 350, 400, 300);
            add(Imafic[1]);

            ImageIcon mano3 = new ImageIcon(lasFichas.mano3);
            Imafic[2] = new JLabel(mano3);
            Imafic[2].setBounds(200, 350, 400, 300);
            add(Imafic[2]);

            ImageIcon mano4 = new ImageIcon(lasFichas.mano4);
            Imafic[3] = new JLabel(mano4);
            Imafic[3].setBounds(250, 350, 400, 300);
            add(Imafic[3]);

            ImageIcon mano5 = new ImageIcon(lasFichas.mano5);
            Imafic[4] = new JLabel(mano5);
            Imafic[4].setBounds(300, 350, 400, 300);
            add(Imafic[4]);

            ImageIcon mano6 = new ImageIcon(lasFichas.mano6);
            Imafic[5] = new JLabel(mano6);
            Imafic[5].setBounds(350, 350, 400, 300);
            add(Imafic[5]);

            ImageIcon mano7 = new ImageIcon(lasFichas.mano7);
            Imafic[6] = new JLabel(mano7);
            Imafic[6].setBounds(400, 350, 400, 300);
            add(Imafic[6]);

        }

    }

    public static void main(String args[]) {
        Domino myDomino = new Domino();
        myDomino.setBounds(0, 0, 900, 650);
        myDomino.setVisible(true);
        myDomino.setResizable(false);
        myDomino.setLocationRelativeTo(null);

    }
}
