package model.environment;

import model.items.Item;

public class TileParameters {
  boolean isTopOpened;
  boolean isBottomOpened;
  boolean isLeftOpened;
  boolean isRightOpened;
  Item item;

  public TileParameters(boolean isTopOpened, boolean isBottomOpened, boolean isLeftOpened,
    boolean isRightOpened, Item item) {
    this.isTopOpened = isTopOpened;
    this.isBottomOpened = isBottomOpened;
    this.isLeftOpened = isLeftOpened;
    this.isRightOpened = isRightOpened;
    this.item = item;
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
}
