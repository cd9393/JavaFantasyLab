package healingTool;

public abstract class HealingTool {

    private int healthBoost;

    public HealingTool(int healthBoost) {
        this.healthBoost = healthBoost;
    }

    public int getHealthBoost() {
        return healthBoost;
    }
}
