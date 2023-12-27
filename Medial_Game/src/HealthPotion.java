public class HealthPotion extends Potion {
    private int staminaIndex;
    private int healingPower;

    // Constructor for HealthPotion
    public HealthPotion(String name, String description, int staminaIndex, int healingPower) {
        super(name, description, staminaIndex);
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public int getStaminaIndex() {
        return staminaIndex;
    }

    public void consume() {
        // Increase the player's staminaIndex when the potion is consumed
        int increasedStamina = staminaIndex + 10; 
        setStaminaIndex(increasedStamina);
    }

    // Override toString method to provide a meaningful representation
    @Override
    public String toString() {
        return getName() + " - Stamina Index: " + staminaIndex + ", Healing Power: " + healingPower;
    }

    // You might want to add a setter for staminaIndex if needed
    public void setStaminaIndex(int staminaIndex) {
        this.staminaIndex = staminaIndex;
    }
}
