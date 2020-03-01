package model.characters;

public class CharacterParameters {

  int hp;
  String name;
  int keysLimit;
  int spellsLimit;
  int weaponsLimit;
  int chestsLimit;
  int effectsLimit;

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKeysLimit() {
    return keysLimit;
  }

  public void setKeysLimit(int keysLimit) {
    this.keysLimit = keysLimit;
  }

  public int getSpellsLimit() {
    return spellsLimit;
  }

  public void setSpellsLimit(int spellsLimit) {
    this.spellsLimit = spellsLimit;
  }

  public int getWeaponsLimit() {
    return weaponsLimit;
  }

  public void setWeaponsLimit(int weaponsLimit) {
    this.weaponsLimit = weaponsLimit;
  }

  public int getChestsLimit() {
    return chestsLimit;
  }

  public void setChestsLimit(int chestsLimit) {
    this.chestsLimit = chestsLimit;
  }

  public int getEffectsLimit() {
    return effectsLimit;
  }

  public void setEffectsLimit(int effectsLimit) {
    this.effectsLimit = effectsLimit;
  }
}
