

public class Master {
  
  public static void main(String[] args) {
    State state = new State();
    Scene scene = new Scene(state);
    Renderer renderer = new Renderer(state);
    renderer.init();
    Input input = new Input(renderer, scene, state);
  }
}
