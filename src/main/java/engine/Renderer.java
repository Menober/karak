package engine;

import java.awt.Graphics;
import model.environment.Tile;

public class Renderer {

  public void render(Handler handler, Graphics g){
    for(Tile t:handler.getDungeon().getTiles()){
      t.render(g);
    }

  }


}
