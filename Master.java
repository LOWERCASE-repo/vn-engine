

public class Master {
  
  public static void main(String[] args) {
    State state = new State();
    Renderer renderer = new Renderer(state);
    renderer.init();
    Scene scene = new Scene(state);
  }
}
