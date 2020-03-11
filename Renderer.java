import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;

public class Renderer extends JFrame {
  
  private State state;
  
  
  public Renderer(State state) {
    this.state = state;
  }
  
  public void init() {
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setResizable(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.gridheight = 3;
    c.gridwidth = 3;
    
    JTextArea dialogue = new JTextArea("infooooooooooooooooooooooooo");
    dialogue.setEditable(true);
    // dialogue.setFont(24);
    c.gridx = 3;
    c.gridy = 3;
    // c.anchor = c.EAST;
    // c.fill = c.BOTH;
    add(dialogue, c);
    
    revalidate();
    setVisible(true);
    // GridLayout gl = new GridLayout(1, 2);
    // getContentPane().setLayout(gl);
  }
  
  
}
