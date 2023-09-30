import processing.core.PApplet;

/**
 * Outputs a picture of a house with the sun, which adjusts to match any frame size. The sky colour will change depending on the width.
 * @author: Timothy C. 
 */

public class Sketch extends PApplet {
	
  public void settings() {
    size(562, 297);
  }

  public void setup() {
    background(0, 0, width/4);
  }

  public void draw() {
    // the sun
    fill(255, 255, 0);
	  ellipse(width, 0, width/2, width/2);

    // the grass
    fill(0, 128,0);
    rect(0, (float) (height/1.14285714), (float)width, (float)(height/8));

    // the house
    fill(181, 101, 29);
    rect((float) (width/2.28571429), (float) (height/1.333333), width/8, height/8);
    fill(128, 128, 128);
    triangle(width / 2, (float) (height/1.6), (float) (width/2.28571429), (float) (height/1.333333), (float) (width/1.77777778), (float) (height/1.333333));

    // windows
    fill(255, 255, 255);
    rect((float) (width/2.22222222), (float) (height/1.31147541), (float) (width/26.6666667) , (float) (height/26.6666667));
    fill(255, 255, 255);
    rect((float) (width/2.22222222), (float) (height/1.21212121), (float) (width/26.6666667), (float) (height/26.6666667));
    fill(255, 255, 255);
    rect((float) (width/1.95121951), (float) (height/1.31147541), (float) (width/26.6666667), (float) (height/26.6666667));

    // door
    fill(255, 25, 0);
    rect((float)(width/1.95121951), (float) (height/1.21212121), (float) (width/26.6666667), (float) (height/20));
    
    // misc.
    textSize(width/8);
    text("'house' by Tim", width/80, height / 2);
  }
  
}