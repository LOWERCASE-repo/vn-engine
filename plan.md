- master inits everything
- scene loads the first line
  - renderer.setBackground
    - renderer updates jpanel
- scene loads a dialogue line
  - renderer.setSpeaker
    - renderer updates jtextarea
  - renderer.setSprite
    - renderer updates jpanel
  - renderer.setMessage
    - renderer updates dialogue
      - dialogue starts scroll coroutine
  - update savemaster
- input receives advance
  - if dialogue is done
    - scene.loadLine()
  - else, skip scroll
    - dialogue.skip()
- input receives save
  - savemaster.save()
- input receives load
  - savemaster.load()
    - updates scene
      - FileInputStream.skip()

###### Renderer.java
- inits blank
- creates Dialogue.java
- gui containment chamber

###### Scene.java
- inits with renderer

###### Input.java
- inits with dialogue, scene, saver
- listener containment chamber

###### Saver.java
- GameState serialization

###### State.java
- x will remember this
- current image, text, etc

# extensions
- transitions
  - fade in and out
  - zooms
- encrypted save file
- chara voices and music
- mouse navigation
- resizable window
- katana zero polish
  - time sensitive choices
  - ALL the text effects
