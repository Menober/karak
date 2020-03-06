package engine;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Renderable {

  float x, y;
  int width, height;
  BufferedImage image;

  public void render(Graphics g, BufferedImage image) {
    g.drawImage(image, (int) x, (int) y, width, height, null);
  }

  public void render(Graphics g, BufferedImage image, float x, float y, int width, int height) {
    g.drawImage(image, (int) x, (int) y, width, height, null);
  }


}
