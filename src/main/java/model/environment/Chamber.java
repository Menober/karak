package model.environment;

import engine.assets.Assets;

public class Chamber extends Tile {

  public Chamber(TileParameters tileParameters) {
    super(tileParameters);
    this.image= Assets.tile_chamber_bend;//todo
  }
}
