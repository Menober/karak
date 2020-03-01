package model.characters;

import model.characters.skills.Skill;
import model.effects.Effect;
import model.items.Chest;
import model.items.Key;
import model.items.spells.Spell;
import model.items.weapons.Weapon;

public abstract class Character {

  int hp;
  String name;
  Key[] keys;
  Weapon[] weapons;
  Spell[] spells;
  Chest[] chests;
  Effect[] effects;
  Skill[] skills;

  public Character(CharacterParameters characterParameters) {
    hp = characterParameters.getHp();
    name = characterParameters.getName();
    keys = new Key[characterParameters.getKeysLimit()];
    weapons = new Weapon[characterParameters.getWeaponsLimit()];
    spells = new Spell[characterParameters.getSpellsLimit()];
    chests = new Chest[characterParameters.getChestsLimit()];
    effects = new Effect[characterParameters.getEffectsLimit()];
    skills = new Skill[characterParameters.getSpellsLimit()];
  }
}
