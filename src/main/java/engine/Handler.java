package engine;

import model.environment.Chamber;
import model.environment.HealingFountain;
import model.environment.TeleportationGate;
import model.environment.Tile;
import model.environment.TileParameters;
import model.environment.Tunnel;
import model.world.Dungeon;

public class Handler {

  Dungeon dungeon;
  long lastTime;

  public Dungeon getDungeon() {
    return dungeon;
  }

  public void update() {

    if (System.currentTimeMillis() - lastTime > 2000) {
      createRandomTile(dungeon);
      lastTime = System.currentTimeMillis();
    }
  }

  private void createRandomTile(Dungeon dungeon) {
    Tile tile = null;
    TileParameters t = new TileParameters(true, true, true, true, null, null);
    switch (Utils.randomInt(0, 3)) {
      case 0:
        tile = new Chamber(t);
        break;
      case 1:
        tile = new HealingFountain(t);
        break;
      case 2:
        tile = new Tunnel(t);
        break;
      case 3:
        tile = new TeleportationGate(t);
        break;
    }
    switch (Utils.randomInt(0, 3)) {
      case 0:
        dungeon.getSpawnTile().setTopNeighbour(tile);
        tile.setX(dungeon.getSpawnTile().getX());
        tile.setY(dungeon.getSpawnTile().getY() - dungeon.getSpawnTile().getHeight());
        break;
      case 1:
        dungeon.getSpawnTile().setBottomNeighbour(tile);
        tile.setX(dungeon.getSpawnTile().getX());
        tile.setY(dungeon.getSpawnTile().getY() + dungeon.getSpawnTile().getHeight());
        break;
      case 2:
        dungeon.getSpawnTile().setLeftNeigbour(tile);
        tile.setX(dungeon.getSpawnTile().getX() - dungeon.getSpawnTile().getWidth());
        tile.setY(dungeon.getSpawnTile().getY());
        break;
      case 3:
        dungeon.getSpawnTile().setRightNeighbour(tile);
        tile.setX(dungeon.getSpawnTile().getX() + dungeon.getSpawnTile().getWidth());
        tile.setY(dungeon.getSpawnTile().getY());
        break;
    }
    dungeon.getTiles().add(tile);
  }

}
