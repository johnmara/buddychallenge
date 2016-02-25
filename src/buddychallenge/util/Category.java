/*
 * 
 */
package buddychallenge.util;

// TODO: Auto-generated Javadoc
/**
 * The Enum Category.
 */
public enum Category {
	
	/** The category1. */
	category1("VIOLATION"), 
	
	/** The category2. */
	category2("RACISM"),
	
	/** The category3. */
	category3("SPAM");
	
	/** The name. */
	private final String name;       

    /**
     * Instantiates a new category.
     *
     * @param c the c
     */
    private Category(String c) {
        name = c;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    public String toString(){
        return name;
     }
}
