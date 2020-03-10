package model.environment;

import static engine.RenderConstants.TILE_HEIGHT;
import static engine.RenderConstants.TILE_WIDTH;

import engine.Renderable;
import model.items.Item;
import model.monsters.Monster;

public abstract class Tile extends Renderable {

  boolean isTopOpened = false;
  boolean isBottomOpened = false;
  boolean isLeftOpened = false;
  boolean isRightOpened = false;
  Item item = null;
  Monster monster = null;
  Tile leftNeigbour = null,
    rightNeighbour = null,
    topNeighbour = null,
    bottomNeighbour = null;


  public Tile(TileParameters tileParameters) {
    super();
    this.isTopOpened = tileParameters.isTopOpened();
    this.isBottomOpened = tileParameters.isBottomOpened();
    this.isLeftOpened = tileParameters.isLeftOpened();
    this.isRightOpened = tileParameters.isRightOpened();
    this.item = tileParameters.getItem();
    this.width = TILE_WIDTH;
    this.height = TILE_HEIGHT;
  }

  public boolean isTopOpened() {
    return isTopOpened;
  }

  public void setTopOpened(boolean topOpened) {
    isTopOpened = topOpened;
  }

  public boolean isBottomOpened() {
    return isBottomOpened;
  }

  public void setBottomOpened(boolean bottomOpened) {
    isBottomOpened = bottomOpened;
  }

  public boolean isLeftOpened() {
    return isLeftOpened;
  }

  public void setLeftOpened(boolean leftOpened) {
    isLeftOpened = leftOpened;
  }

  public boolean isRightOpened() {
    return isRightOpened;
  }

  public void setRightOpened(boolean rightOpened) {
    isRightOpened = rightOpened;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public Monster getMonster() {
    return monster;
  }

  public void setMonster(Monster monster) {
    this.monster = monster;
  }

  public Tile getLeftNeigbour() {
    return leftNeigbour;
  }

  public void setLeftNeigbour(Tile leftNeigbour) {
    this.leftNeigbour = leftNeigbour;
  }

  public Tile getRightNeighbour() {
    return rightNeighbour;
  }

  public void setRightNeighbour(Tile rightNeighbour) {
    this.rightNeighbour = rightNeighbour;
  }

  public Tile getTopNeighbour() {
    return topNeighbour;
  }

  public void setTopNeighbour(Tile topNeighbour) {
    this.topNeighbour = topNeighbour;
  }

  public Tile getBottomNeighbour() {
    return bottomNeighbour;
  }

  public void setBottomNeighbour(Tile bottomNeighbour) {
    this.bottomNeighbour = bottomNeighbour;
  }
}
