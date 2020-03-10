# functionality

###### storing dialogue trees
- dev bottleneck!
- serialize a directed graph
- functions needed
  - text and effects
  - player choices
  - background changes
  - x will remember this
- possibilities
  - yaml json or xml parser
  - script with gotos
    - tempting but not extensible
  - node forest
    - easy to burn out

###### game components
- background image
- dialogue box
- dialogue sprite
- choices buttons
- save and load buttons

# classes

###### Init.java
- public static void pain
- calls literally everything

###### Renderer.java
- gui containment chamber
- jframe with background image
  - not resizable because of image jank

###### SaveMaster.java
- file io containment chamber
- GameState serialization

###### GameState.java
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