

public class Clock {
  
  public void init() {
    // TODO pass in the things to update into this constructor
    Thread updater = new Thread(new Updater());
    updater.start();
  }
  
  private class Updater implements Runnable {
    private final long TARGET_TIME = 10;
    
    private long oldTime = System.currentTimeMillis();
    private long deltaTime;
    
    @Override
    public void run() {
      while (this != null) {
        deltaTime = System.currentTimeMillis() - oldTime;
        oldTime = System.currentTimeMillis();
        // blah.update(deltaTime);
      }
      try { Thread.sleep(TARGET_TIME); }
      catch (Exception exc) { exc.printStackTrace(); }
    }
  }
}