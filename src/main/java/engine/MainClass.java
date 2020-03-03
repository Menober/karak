package engine;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class MainClass {
  public static void main(String[] argv) throws Exception {
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice gs = ge.getDefaultScreenDevice();

    Button btn = new Button("OK");
    btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gs = ge.getDefaultScreenDevice();
        gs.setFullScreenWindow(null);
      }
    });
    Frame frame = new Frame(gs.getDefaultConfiguration());
    Window win = new Window(frame);
    win.add(btn, BorderLayout.CENTER);
    try {
      gs.setFullScreenWindow(win);
      win.validate();
    } finally {
      gs.setFullScreenWindow(null);
    }
  }
}