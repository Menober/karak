package model.world;

import java.util.ArrayList;
import model.environment.SpawnTile;
import model.environment.Tile;
import model.environment.TileParameters;

public class Dungeon {

  ArrayList<Tile> tiles;
  SpawnTile spawnTile;

  public Dungeon() {
    this.tiles = new ArrayList<Tile>();
    addSpawnTile();
  }

  public void addSpawnTile() {
    TileParameters spawnParameters = new TileParameters(true, true, true, true, null, null);
    SpawnTile spawnTile = new SpawnTile(spawnParameters);
    spawnTile.setX(200);
    spawnTile.setY(200);
    this.spawnTile = spawnTile;
    tiles.add(spawnTile);
  }

  public ArrayList<Tile> getTiles() {
    return tiles;
  }

  public SpawnTile getSpawnTile() {
    return spawnTile;
  }
}
