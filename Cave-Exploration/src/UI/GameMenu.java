

package src.UI;

import src.MainGame.Constants;
import src.MainGame.Game;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



/**
 * @brief Cette classe cree une fenetre intial avant de commencer le jeu avec un menu ou lutilisateur 
 * choisit de jouer ou quitter
 * @author Farid Yasmina
 * @author Ghamat Seyedehsetayesh
 */
public class GameMenu extends JFrame {
    private JPanel contentPane;

    /**
     * creation de la fenetre menu
     */
    public GameMenu() {
        Constants con = new Constants();
        con.loadConfig();
        this.setTitle(con.title);
        this.setDefaultCloseOperation(3);
        this.setSize(con.width, con.height);
        this.setLocationRelativeTo((Component)null);
        this.setVisible(true);
        this.contentPane = new JPanel();
        this.contentPane.setBackground(new Color(51, 0, 51));
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JButton btnNewButton = new JButton("Start\r\n");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GameMenu.this.dispose();
                new Game();
            }
        });
        btnNewButton.setFont(new Font("Swis721 Cn BT", 0, 24));
        btnNewButton.setBounds(con.width / 2 - 50, con.height / 4, 100, 32);
        this.contentPane.add(btnNewButton);
        JButton btnNewButton_1 = new JButton("Quit");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GameMenu.this.dispose();
                System.exit(0);
            }
        });
        btnNewButton_1.setFont(new Font("Swis721 Lt BT", 0, 24));
        btnNewButton_1.setBounds(con.width / 2 - 50, con.height / 2, 100, 32);
        this.contentPane.add(btnNewButton_1);
    }
}
