import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextArea;

public class Renderer extends JFrame {
  
  private JTextArea name;
  private Dialogue dialogue;
  
  public Renderer() {
    setSize(1280, 720);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    dialogue = new Dialogue();
    dialogue.setFont(new Font("SansSerif", Font.PLAIN, 24));
    dialogue.setEditable(false);
    add(dialogue);
    revalidate();
    setVisible(true);
  }
  
  public boolean advance(String message) {
    return dialogue.advance(message);
  }
}
