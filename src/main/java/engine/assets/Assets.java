package engine.assets;

import java.awt.image.BufferedImage;

public class Assets {

  public static BufferedImage dragon;

  public static void loadAssets(){
    SpriteSheet dragonSheet = new SpriteSheet(ImageLoader.loadImage("/dragon.png"));
    dragon = dragonSheet.crop(0,0,201,242);
  }

}
