package model.environment;

import engine.assets.Assets;

public class Tunnel extends Tile {

  public Tunnel(TileParameters tileParameters) {
    super(tileParameters);
    this.image = Assets.tile_tunnel_cross;//todo
  }
}
