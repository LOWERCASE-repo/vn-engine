
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Renderer extends JFrame {
  
  public void init() {
    setSize(1280, 720);
    // setExtendedState(JFrame.MAXIMIZED_BOTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // GridLayout gl = new GridLayout(1, 2);
    // getContentPane().setLayout(gl);
    setVisible(true);
    revalidate();
    
    // Thread focusUpdater = new Thread(new FocusUpdater());
    // focusUpdater.start();
  }
  
  // private class FocusUpdater implements Runnable {
  //   private long oldTime = System.currentTimeMillis();
  //   private long deltaTime;
  //   private final long targDeltaTime = 10;
  // 
  //   @Override
  //   public void run() {
  //     while (this != null) {
  //       deltaTime = System.currentTimeMillis() - oldTime;
  //       oldTime = System.currentTimeMillis();
  //       switch (phase) {
  //         case MENU:
  //           menu.update(deltaTime);
  //           break;
  //         case GAME:
  //           rendererOne.update(deltaTime);
  //           rendererTwo.update(deltaTime);
  //           engine.update(deltaTime);
  //           break;
  //         case RESULTS:
  //           results.update(deltaTime);
  //           break;
  //       }
  //       try {
  //         Thread.sleep(targDeltaTime);
  //       } catch (Exception exc) {
  //         exc.printStackTrace();
  //       }
  //     }
  //   }
}