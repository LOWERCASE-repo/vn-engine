import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextArea;

public class Renderer extends JFrame {
  
  private State state;
  public JTextArea dialogue;
  private JTextArea name;
  
  public Renderer(State state) {
    this.state = state;
  }
  
  public void init() {
    setSize(1280, 720);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    dialogue = new JTextArea();
    dialogue.setFont(new Font("SansSerif", Font.PLAIN, 24));
    dialogue.setEditable(false);
    add(dialogue);
    revalidate();
    setVisible(true);
    // pack();
    Thread textScroller = new Thread(new TextScroller());
    textScroller.start();
  }
  
  private class TextScroller implements Runnable {
    private final long SCROLL_DELAY = 50;
    
    @Override
    public void run() {
      String message = "";
      int caret;
      while (this != null) {
        message = dialogue.getText();
        caret = message.length();
        if (caret < state.message.length()) {
          message += state.message.charAt(caret);
          dialogue.setText(message);
        }
        try { Thread.sleep(SCROLL_DELAY); }
        catch (Exception exc) { exc.printStackTrace(); }
      }
    }
  }
}
