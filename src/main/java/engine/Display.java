package engine;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import javax.swing.JFrame;

public class Display {

  private JFrame frame;
  private Canvas canvas;

  private String title;
  private int width, height;

  public Display(String title, int width, int height) {
    this.title = title;
    this.width = width;
    this.height = height;
    createDisplay();

  }

  private void createDisplay() {
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice gs = ge.getDefaultScreenDevice();

    frame = new JFrame(title,gs.getDefaultConfiguration());

    frame.setSize(width, height);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setUndecorated(true);
    frame.setVisible(true);

    canvas = new Canvas();
    canvas.setPreferredSize(new Dimension(width, height));
    canvas.setMaximumSize(new Dimension(width, height));
    canvas.setMinimumSize(new Dimension(width, height));
    canvas.setFocusable(false);

    frame.add(canvas);
    frame.pack();

  }

  public Canvas getCanvas() {
    return canvas;
  }

  public JFrame getFrame() {
    return frame;
  }

}
