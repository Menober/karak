package engine.assets;

import java.awt.image.BufferedImage;

public class Assets {

  public static BufferedImage dragon,
    tile_chamber_bend, tile_chamber_cross, tile_chamber_straight, tile_chamber_tripod,
    tile_cover, tile_spawn, tile_tunnel_healing, tile_tunnel_teleport,
    tile_tunnel_bend, tile_tunnel_cross, tile_tunnel_straight, tile_tunnel_tripod;

  public static void loadAssets() {
    tile_chamber_bend = takeImage("tile_chamber_bend",0,0,354,354);
    tile_chamber_cross = takeImage("tile_chamber_cross",0,0,354,354);
    tile_chamber_straight = takeImage("tile_chamber_straight",0,0,354,354);
    tile_chamber_tripod = takeImage("tile_chamber_tripod",0,0,354,354);

    tile_cover = takeImage("tile_cover",0,0,354,354);
    tile_spawn = takeImage("tile_spawn",0,0,354,354);
    tile_tunnel_healing = takeImage("tile_tunnel_healing",0,0,354,354);
    tile_tunnel_teleport = takeImage("tile_tunnel_teleport",0,0,354,354);

    tile_tunnel_bend = takeImage("tile_tunnel_bend",0,0,354,354);
    tile_tunnel_cross = takeImage("tile_tunnel_cross",0,0,354,354);
    tile_tunnel_straight = takeImage("tile_tunnel_straight",0,0,354,354);
    tile_tunnel_tripod = takeImage("tile_tunnel_tripod",0,0,354,354);
  }

  public static BufferedImage takeImage(String name,int x, int y, int width, int height) {
    return new SpriteSheet(ImageLoader.loadImage("/" + name + ".png")).crop(x, y, width, height);
  }
}
