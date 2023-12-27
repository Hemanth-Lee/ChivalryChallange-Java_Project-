public class StaminaPotion extends Potion {
    private int staminaIndex;
    private int staminaPower;

    // Constructor for HealthPotion
    public StaminaPotion(String name, String description, int staminaIndex, int staminaPower) {
        super(name, description, staminaIndex);
        this.staminaPower = staminaPower;
    }

    public int getStaminaPower() {
        return staminaPower;
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
        return getName() + " - Stamina Index: " + staminaIndex + ", Stamina Power: " + staminaPower;
    }

    // You might want to add a setter for staminaIndex if needed
    public void setStaminaIndex(int staminaIndex) {
        this.staminaIndex = staminaIndex;
    }
}
