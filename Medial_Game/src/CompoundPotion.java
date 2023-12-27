public class CompoundPotion extends Potion {
    private int staminaIndex;
    private int staminaHealingPower;

    // Constructor
    public CompoundPotion(String name, String description, int staminaIndex, int staminaHealingPower) {
        super(name, description, staminaIndex);
        this.staminaHealingPower = staminaHealingPower;
    }

    public int getStaminaHealingPower() {
        return staminaHealingPower;
    }

    public int getStaminaIndex() {
        return staminaIndex;
    }

    public void consume() {
        int increasedStaminaIndex = staminaIndex ; // Adjust the amount as needed
        int increasedStaminaHealingPower = staminaHealingPower + 10; // Adjust the amount as needed

        setStaminaIndex(increasedStaminaIndex);
        setStaminaHealingPower(increasedStaminaHealingPower);
    }

    // Override toString method to provide a meaningful representation
    @Override
    public String toString() {
        return getName() + " - Stamina Index: " + staminaIndex + ", Stamina Healing Power: " + staminaHealingPower;
    }

    // Add setters for staminaIndex and staminaHealingPower if needed
    public void setStaminaIndex(int staminaIndex) {
        this.staminaIndex = staminaIndex;
    }

    public void setStaminaHealingPower(int staminaHealingPower) {
        this.staminaHealingPower = staminaHealingPower;
    }
}
