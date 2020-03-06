import engine.Display;
import engine.assets.Assets;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.junit.Test;

public class TestTest {

  public static void main(String[]args) throws InterruptedException {
    Assets.loadAssets();
    Display display = new Display("",300,300);

    BufferStrategy bs = display.getCanvas().getBufferStrategy();
    if (bs == null) {
      display.getCanvas().createBufferStrategy(3);
      return;
    }
    Graphics g = bs.getDrawGraphics();
    g.drawImage(Assets.dragon,0,0,232,201,null);
    Thread.sleep(10000);
  }
}
