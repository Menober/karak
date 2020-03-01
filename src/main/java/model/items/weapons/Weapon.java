package model.items.weapons;

import model.items.Item;

public abstract class Weapon extends Item {

  int damage;

  public Weapon(int damage) {
    this.damage = damage;
  }
}
