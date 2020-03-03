package engine;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class Display extends Window {

  private JFrame frame;
  private Canvas canvas;

  private String title;
  private int width, height;

  public Display(String title, int width, int height) {
    super(new Frame());
    this.title = title;
    this.width = width;
    this.height = height;

    createDisplay();
  }

  private void createDisplay() {
    frame = new JFrame(title);
    frame.setSize(width, height);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

    canvas = new Canvas();
    canvas.setPreferredSize(new Dimension(width, height));
    canvas.setMaximumSize(new Dimension(width, height));
    canvas.setMinimumSize(new Dimension(width, height));
    canvas.setFocusable(false);

    frame.add(canvas);
    frame.pack();

    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice screen = ge.getDefaultScreenDevice();
    screen.setFullScreenWindow(new Display("",100,100));

  }

  public Canvas getCanvas() {
    return canvas;
  }

  public JFrame getFrame() {
    return frame;
  }

}
