import java.io.FileInputStream;
// import java.io.FileOutputStream;

public class Scene {
  
  private FileInputStream input;
  private State state;
  
  private String speaker;
  private String mood;
  private String message;
  
  public String getSpeaker() { return speaker; }
  public String getMood() { return mood; }
  public String getMessage() { return message; }
  
  public Scene() {
    loadScene("intro");
    loadLine();
  }
  
  public void loadLine() {
    speaker = parseString(44); // comma
    mood = parseString(58); // colon
    message = parseString(10); // newline
    System.out.println(speaker + "|" + mood + "|" + message);
    
    // TODO try moving renderer updates here
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
