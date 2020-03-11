# functionality

###### game components
- background image
- dialogue box
- dialogue sprite
- choices buttons
- save and load buttons

###### novel script
- dev bottleneck!
- directed graph serialization
- functions needed
  - text and effects
  - player choices
  - background changes
  - x will remember this
- possibilities
  - yaml json or xml parser
    - kinda boomer
    - too much typing
    - prolly should learn it anyways
  - script with gotos (chosen)
    - peak readability
    - not reusable
    - high debug time cost
  - node forest
    - customizable
    - easy to burn out
    - rip memory

###### implementation
- input tells flow to flip page
- script gives flow data
- flow updates state
- renderer displays state
- clock moves renderer along

# classes

###### Init.java
- public static void pain
- calls literally everything

###### Renderer.java
- gui containment chamber
- jframe with background image
  - not resizable because of image jank
- renders state

###### Saver.java
- GameState serialization

###### Script.java
- parses serialized script

###### Flow.java
- logic containment chamber
- parses input
- gets data from script
- changes state

###### State.java
- x will remember this
- current image, text, etc

###### Clock.java
- unlimited fps
- text scroll speed
  - constantly try to append characters

###### Input.java
- listener containment chamber
- i am NOT working with jbuttons
- arrow keys + space
- numbers
- s and l for save and load

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
