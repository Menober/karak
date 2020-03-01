package model.environment;

import model.items.Item;

public abstract class Tile {

  boolean isTopOpened;
  boolean isBottomOpened;
  boolean isLeftOpened;
  boolean isRightOpened;
  Item item;


  public Tile(TileParameters tileParameters) {
    this.isTopOpened = tileParameters.isTopOpened();
    this.isBottomOpened = tileParameters.isBottomOpened();
    this.isLeftOpened = tileParameters.isLeftOpened();
    this.isRightOpened = tileParameters.isRightOpened();
    this.item = tileParameters.getItem();
  }
}
