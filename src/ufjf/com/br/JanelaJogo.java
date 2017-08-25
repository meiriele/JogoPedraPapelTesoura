
package ufjf.com.br;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javafx.scene.control.RadioButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class JanelaJogo extends JFrame{
    private final JTextField jogada = new JTextField("Jogada");
    private final JRadioButton Pedra;
    private final JRadioButton Papel;
    private final JRadioButton Tesoura;
    private final JButton Jogar;
    
    
    
    public JanelaJogo() throws HeadlessException {
        
        super("Jogo");
        
        setLayout(new FlowLayout());
        add(jogada);
        Pedra = new JRadioButton("Pedra",true);
        add(Pedra);
        Papel = new JRadioButton("Papel",false);
        add(Papel);
        Tesoura = new JRadioButton("Tesoura",false);
        add(Tesoura);
        Jogar = new JButton("Jogar");
        add(Jogar);
       
        
    }
    
}
