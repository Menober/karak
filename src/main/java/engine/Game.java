package engine;

import engine.assets.Assets;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import model.world.Dungeon;

public class Game implements Runnable {

  private Display display;
  boolean running = false;
  private Thread thread;
  private BufferStrategy bs;
  private Graphics g;
  private int width;
  private int height;
  private String title;
  private Handler handler;
  private Renderer renderer;

  public Game(String title, int width, int height) {
    this.title = title;
    this.width = width;
    this.height = height;

    Assets.loadAssets();

    this.renderer = new Renderer();
    this.handler = new Handler();
    createNewGame();
  }

  public void initialize() {
    display = new Display(title, width, height);
  }

  public void createNewGame() {
    handler.dungeon = new Dungeon();


  }

  public void update() {
    handler.update();
  }

  public void render() {
    bs = display.getCanvas().getBufferStrategy();
    if (bs == null) {
      display.getCanvas().createBufferStrategy(3);
      return;
    }
    g = bs.getDrawGraphics();
    //Clear Screen
    g.clearRect(0, 0, width, height);
    g.setColor(Color.black);
    g.fillRect(0,0,width,height);
    //Draw Here!

    renderer.render(handler, g);

    //End Drawing!
    bs.show();
    g.dispose();
  }

  public void run() {
    initialize();

    int fps = 60;
    double timePerTick = 1000000000 / fps;
    double delta = 0;
    long now;
    long lastTime = System.nanoTime();
    long timer = 0;
    int ticks = 0;

    while (running) {
      now = System.nanoTime();
      delta += (now - lastTime) / timePerTick;
      timer += now - lastTime;
      lastTime = now;

      if (delta >= 1) {
        update();
        render();
        ticks++;
        delta--;
      }

      if (timer >= 1000000000) {
        System.out.println("Ticks and Frames: " + ticks);
        ticks = 0;
        timer = 0;
      }
    }

    stop();

  }

  public synchronized void start() {
    if (running) {
      return;
    }
    running = true;
    thread = new Thread(this);
    thread.start();
  }

  public synchronized void stop() {
    if (!running) {
      return;
    }
    running = false;
    try {
      thread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
