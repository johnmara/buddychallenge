/*
 * 
 */
package buddychallenge.util;

// TODO: Auto-generated Javadoc
/**
 * The Enum Gender.
 */
public enum Gender {
	
	/** The Gender1. */
	Gender1("MALE"), 
	
	/** The Gender2. */
	Gender2("FEMALE");
	
	/** The gender. */
	private final String gender;       

    /**
     * Instantiates a new gender.
     *
     * @param g the String instance of gender
     */
    private Gender(String g) {
        gender = g;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    public String toString(){
        return gender;
     }
}
