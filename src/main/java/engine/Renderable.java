package engine;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Renderable {

  protected float x, y, rotation;
  protected int width, height;
  protected BufferedImage image;

  public void render(Graphics g){
    g.drawImage(image,(int) x, (int) y, width, height, null);
  }

  public void render(Graphics g, BufferedImage image) {
    g.drawImage(image, (int) x, (int) y, width, height, null);
  }

  public void render(Graphics g, BufferedImage image, float x, float y, int width, int height) {
    g.drawImage(image, (int) x, (int) y, width, height, null);
  }

  public void render(Graphics g, BufferedImage image, float x, float y, int width, int height, float rotation) {
    g.drawImage(image, (int) x, (int) y, width, height, null);
  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public float getRotation() {
    return rotation;
  }

  public void setRotation(float rotation) {
    this.rotation = rotation;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public BufferedImage getImage() {
    return image;
  }

  public void setImage(BufferedImage image) {
    this.image = image;
  }
}
