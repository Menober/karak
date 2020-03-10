package model.environment;

import engine.assets.Assets;

public class HealingFountain extends Tile {

  public HealingFountain(TileParameters tileParameters) {
    super(tileParameters);
    this.image = Assets.tile_tunnel_healing;
  }
}
