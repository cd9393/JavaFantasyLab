package players;

import armour.MythicalCreature;
import weapons.Spell;

public abstract class MagicPlayer {

    private int health;
    private Spell spell;
    private MythicalCreature companion;

    public MagicPlayer(int health, Spell spell, MythicalCreature companion) {
        this.health = health;
        this.spell = spell;
        this.companion = companion;
    }

}
