import java.awt.event.AWTEventListener;
import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.util.HashSet;
import java.util.Scanner;

/*
it'd be a good idea to rewrite this class since i'm the only person in
mangat's teaching history that does input like this to
avoid insanely high keylistener debug times :punch joy ok_hand:
*/
public class Input {
  
  private HashSet<Integer> keys;
  private Renderer renderer;
  private Scene scene;
  
  public Input(Renderer renderer, Scene scene) {
    keys = new HashSet<Integer>();
    AWTEventListener keysUpdater = new KeysUpdater();
    Toolkit.getDefaultToolkit().addAWTEventListener(keysUpdater, AWTEvent.KEY_EVENT_MASK);
    this.renderer = renderer;
    this.scene = scene;
    renderer.advance(scene.getMessage());
    scene.loadLine();
  }
  
  private void processInput(int input) {
    if (input == 32 || input == 39) { // space, right
      if (renderer.advance(scene.getMessage())) {
        scene.loadLine();
      }
    }
  }
  
  private Scanner getParser(String input) {
    Scanner params = new Scanner(input);
    params.useDelimiter("\\p{Punct}+");
    params.next();
    return params;
  }
  
  private int forceNextInt(Scanner scanner) {
    for (; scanner.hasNext(); scanner.next()) {
      if (scanner.hasNextInt()) return scanner.nextInt();
    }
    return -1;
  }
  
  private class KeysUpdater implements AWTEventListener {
    @Override
    public void eventDispatched(AWTEvent e) {
      Scanner params = getParser(e.paramString());
      String param = params.next();
      int key = forceNextInt(params);
      if (param.equals("PRESSED") && !keys.contains(key)) {
        processInput(key);
        keys.add(key);
      } else if (param.equals("RELEASED")) {
        keys.remove(key);
      }
    }
  }
}
