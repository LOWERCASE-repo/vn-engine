import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.io.IOException;

public class Script {
  
  public void init() {
    FileInputStream input = null;
    try { input = new FileInputStream("dialog.lines"); }
    catch (IOException e) { e.printStackTrace(); }
    
    String name = parseString(input, 44);
    String message = parseString(input, 58);
    String mood = parseString(input, 10);
    System.out.println(name + "|" + mood + "|" + message);
  }
  
  private String parseString(FileInputStream input, int stop) {
    int c;
    String str = "";
    try { while ((c = input.read()) != stop) str += (char)c; }
    catch (IOException e) { e.printStackTrace(); }
    return str.trim();
  }
}