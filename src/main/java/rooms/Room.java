package rooms;

import behaviours.IDamage;
import enemies.Enemy;
import treasures.Treasure;

import java.util.ArrayList;

public abstract class Room {

    private Enemy enemy;
    private Treasure loot;
    private ArrayList<IDamage> characters;

    public Room(Enemy enemy, Treasure loot) {
        this.enemy = enemy;
        this.loot = loot;
        this.characters = new ArrayList<IDamage>();
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public Treasure getLoot() {
        return loot;
    }

    public void setLoot(Treasure loot) {
        this.loot = loot;
    }

    public void addCharacter(IDamage character){
        this.characters.add(character);
    }

    public int getNumberOfCharacters() {
        return this.characters.size();
    }
}
