import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextArea;

public class Renderer extends JFrame {
  
  private State state;
  
  
  public Renderer(State state) {
    this.state = state;
  }
  
  public void init() {
    setSize(1280, 720);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GridBagConstraints c = new GridBagConstraints();
    c.gridheight = 3;
    c.gridwidth = 3;
    
    c.anchor = c.SOUTH;
    JTextArea dialogue = new JTextArea("infooooooooooooooooooooooooo");
    dialogue.setFont(new Font("SansSerif", Font.PLAIN, 24));
    dialogue.setEditable(false);
    c.weightx = 1;
    c.weighty = 1;
    c.gridx = 3;
    c.gridy = 3;
    // c.anchor = c.EAST;
    c.fill = c.BOTH;
    add(dialogue, c);
    
    revalidate();
    pack();
    setVisible(true);
  }
  
  
}
