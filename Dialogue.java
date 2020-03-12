import javax.swing.JTextArea;
import java.awt.Font;

public class Dialogue extends JTextArea {
  
  private String message;
  public boolean getReady() {
    return message.equals(getText());
  }
  
  public Dialogue() {
    super();
    Thread textScroller = new Thread(new TextScroller());
    textScroller.start();
    message = "";
    setText("");
  }
  
  public boolean advance(String message) {
    System.out.println(getReady());
    if (getReady()) {
      this.message = message;
      setText("");
      return true;
    } else {
      setText(this.message);
      return false;
    }
  }
  
  private class TextScroller implements Runnable {
    private final long SCROLL_DELAY = 50;
    
    @Override
    public void run() {
      while (this != null) {
        if (!getReady()) append("" + message.charAt(getText().length()));
        try { Thread.sleep(SCROLL_DELAY); }
        catch (Exception exc) { exc.printStackTrace(); }
      }
    }
  }
}
