import java.io.FileInputStream;
// import java.io.FileOutputStream;

public class Script {
  
  private FileInputStream input;
  private State state;
  
  public Script(State state) {
    this.state = state;
    init();
  }
  
  public void init() {
    loadScene("intro");
    loadLine();
    loadLine();
  }
  
  public void loadLine() {
    state.speaker = parseString(44);
    state.mood = parseString(58);
    state.message = parseString(10);
    state.debug();
  }
  
  private void loadScene(String name) {
    try { input = new FileInputStream("Scripts/" + name); }
    catch (Exception exc) {
      e.printStackTrace();
      System.exit(1);
    }
  }
  
  private String parseString(int stop) {
    int c;
    String str = "";
    try { while ((c = input.read()) != stop) str += (char)c; }
    catch (IOException e) { e.printStackTrace(); }
    return str.trim();
  }
}