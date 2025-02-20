package kadai04;

import java.awt.Color;

public class CurrentColor {
  private int red = 0;
  private int green = 0;
  private int blue = 0;
  
  public Color changeRed() {
    red = nextBright(red);
    return new Color(red, green, blue);
  }
  
  public Color changeGreen() {
    green = nextBright(green);
    return new Color(red, green, blue);
  }
  
  public Color changeBlue() {
    blue = nextBright(blue);
    return new Color(red, green, blue);
  }
  
  private int nextBright(int b) {
    int resolution = -1;
    if (b == 0) resolution = 128;
    if (b == 128) resolution = 255;
    if (b == 255) resolution = 0;
    
    return resolution;
  }
}