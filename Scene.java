import java.io.FileInputStream;
// import java.io.FileOutputStream;

public class Scene {
  
  private FileInputStream input;
  private State state;
  
  public Scene(State state) {
    this.state = state;
    init();
  }
  
  public void init() {
    loadScene("intro");
    loadLine();
  }
  
  public void loadLine() {
    state.speaker = parseString(44);
    state.mood = parseString(58);
    state.message = parseString(10);
    state.debug();
  }
  
  private void loadScene(String name) {
    try { input = new FileInputStream("Scenes/" + name); }
    catch (Exception exc) {
      exc.printStackTrace();
      System.exit(1);
    }
  }
  
  private String parseString(int stop) {
    int c;
    String str = "";
    try { while ((c = input.read()) != stop) str += (char)c; }
    catch (Exception exc) { exc.printStackTrace(); }
    return str.trim();
  }
}
