import javax.swing.JFrame;
import javax.swing.JPanel;

public class Renderer extends JFrame {
  
  private State state;
  
  public Renderer(State state) {
    this.state = state.
  }
  
  public void init() {
    setSize(1280, 720);
    // setExtendedState(JFrame.MAXIMIZED_BOTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // GridLayout gl = new GridLayout(1, 2);
    // getContentPane().setLayout(gl);
    setResizable(false);
    revalidate();
    setVisible(true);
  }
  
  
}