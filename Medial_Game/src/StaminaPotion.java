
public class StaminaPotion extends Potion{
	private int staminaIndex;
	private int staminaPower;

//const
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

	        int increasedStamina = staminaIndex + 2;
	        setStaminaIndex(increasedStamina);
	    }

	    // Override toString method to provide a meaningful representation
	    @Override
	    public String toString() {
	        return getName() + " - Stamina Health Index: " + staminaIndex + ", Stamina Power: " + staminaPower;
}
	    public void setStaminaIndex(int staminaIndex) {
	        this.staminaIndex = staminaIndex;
	    }
}