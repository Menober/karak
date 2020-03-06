package model.monsters;

import engine.Renderable;

public abstract class Monster extends Renderable {
  int hp;

  public Monster(int hp) {
    this.hp = hp;
  }
}
