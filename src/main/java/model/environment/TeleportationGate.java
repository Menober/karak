package model.environment;

import engine.assets.Assets;

public class TeleportationGate extends Tile {

  public TeleportationGate(TileParameters tileParameters) {
    super(tileParameters);
    this.image = Assets.tile_tunnel_teleport;
  }
}
