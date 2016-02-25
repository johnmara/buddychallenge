/*
 * 
 */
package buddychallenge.util;


public class EmailAddress {
    
    /** The value. */
    private String value;

    public EmailAddress(String email) {
        this.value = email;
    }

    public String getAddress() {
        return value;
    }

    public boolean isValid() {
    	if(value.contains("@") && value.contains("."))
    		return true;
    	
    	return false;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (this == other) {
            return true;
        }

        if (!(other instanceof EmailAddress)) {
            return false;
        }

        EmailAddress theEmail = (EmailAddress) other;
        return value == null ? theEmail.getAddress() == null
                : value.equals(theEmail.getAddress());
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return value == null ? 0 : value.hashCode();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return value;
    }
    
    /**
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(String email){
		value = email;
	}
}
