package model.environment;

import engine.assets.Assets;

public class SpawnTile extends Tile {

  public SpawnTile(TileParameters tileParameters) {
    super(tileParameters);
    this.image = Assets.tile_spawn;
  }
}
