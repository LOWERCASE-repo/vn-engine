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
  private State state;
  
  public Input(Renderer renderer, Scene scene, State state) {
    keys = new HashSet<Integer>();
    AWTEventListener keysUpdater = new KeysUpdater();
    Toolkit.getDefaultToolkit().addAWTEventListener(keysUpdater, AWTEvent.KEY_EVENT_MASK);
    this.renderer = renderer;
    this.scene = scene;
    this.state = state;
  }
  
  private void processInput(int input) {
    if (input == 32 || input == 39) { // space, right
      // if (renderer.dialogue.getText().equals(state.message)) {
      //   renderer.dialogue.setText("");
      //   scene.loadLine();
      // } else renderer.dialogue.setText(state.message);
      if (renderer.advance(state.message)) {
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
      // for (int num : keys) System.out.print(num + " ");
      // System.out.println();
    }
  }
}
