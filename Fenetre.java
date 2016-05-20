package boutonreactif;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

        
public class Fenetre extends JFrame{

    private JPanel panel3 = new JPanel();
    private JLabel label = new JLabel();
    private Font police = new Font("verdana", Font.BOLD, 30);
    
    public Fenetre(){
        this.setTitle("Application pratique 9");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        // Boutons
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2,2));
        JButton b1 = new JButton("ROUGE");
        panel1.add(b1);
        b1.addActionListener(new Bouton1Listener());
        JButton b2 = new JButton("VERT");
        panel1.add(b2);
        b2.addActionListener(new Bouton2Listener());
        JButton b3 = new JButton("BLEU");
        panel1.add(b3);
        b3.addActionListener(new Bouton3Listener());
        JButton b4 = new JButton("JAUNE");
        panel1.add(b4);
        b4.addActionListener(new Bouton4Listener());
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,1));
        JButton b5 = new JButton("RESET");
        panel2.add(b5);
        b5.addActionListener(new Bouton5Listener());
        
        // Panneau d'affichage
        panel3.setBackground(Color.white);
        panel3.add(label);
        
        // Ajout des composants
        this.getContentPane().add(panel3, BorderLayout.CENTER);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);
        this.getContentPane().add(panel1, BorderLayout.NORTH);
                
        this.setVisible(true);
        
        go();
    }
    

    private void go(){
        // Aucune redéfinition nécessaire
    }
    
    class Bouton1Listener implements ActionListener{
    
        public void actionPerformed(ActionEvent arg0){
            label.setFont(police);
            label.setForeground(Color.black);
            label.setText("ROUGE");
            panel3.setBackground(Color.red);
        }
    }

    class Bouton2Listener implements ActionListener{
    
        public void actionPerformed(ActionEvent arg0){
            label.setFont(police);
            label.setForeground(Color.black);
            label.setText("VERT");
            panel3.setBackground(Color.green);
        }
    }

    class Bouton3Listener implements ActionListener{
    
        public void actionPerformed(ActionEvent arg0){
            label.setFont(police);
            label.setForeground(Color.white);
            label.setText("BLEU");
            panel3.setBackground(Color.blue);
        }
    }

    class Bouton4Listener implements ActionListener{
    
        public void actionPerformed(ActionEvent arg0){
            label.setFont(police);
            label.setForeground(Color.black);
            label.setText("JAUNE");
            panel3.setBackground(Color.yellow);
        }
    }

    class Bouton5Listener implements ActionListener{
    
        public void actionPerformed(ActionEvent arg0){
            label.setText("");
            panel3.setBackground(Color.white);
        }
    }
}