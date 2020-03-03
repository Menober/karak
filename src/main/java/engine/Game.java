package engine;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game implements Runnable {

  private Display display;
  boolean running = false;
  private Thread thread;
  private BufferStrategy bs;
  private Graphics g;

  public void initialize() {
    display = new Display("Title", 1920, 1080);
  }


  public void update() {
  }

  public void render() {
    bs = display.getCanvas().getBufferStrategy();
    if (bs == null) {
      display.getCanvas().createBufferStrategy(3);
      return;
    }
    g = bs.getDrawGraphics();
    //Clear Screen
    g.clearRect(0, 0, 100, 100);
    //Draw Here!

   // if (State.getState() != null) {
  //    State.getState().render(g);
  //  }

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
