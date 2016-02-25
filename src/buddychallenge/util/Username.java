/*
 * 
 */
package buddychallenge.util;

// TODO: Auto-generated Javadoc
/**
 * The Class Username.
 */
public class Username {
	
	/** The value. */
	String value;

	/**
	 * Instantiates a new username.
	 *
	 * @param username the username
	 */
	public Username(String username) {
		this.value = username;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return value;
	}

	/**
	 * Checks if is valid.
	 *
	 * @return true, if is valid
	 */
	public boolean isValid() {
		if (value.isEmpty())
			return false;
		char c = value.charAt(0);
		if(value.length() <= 3 || value.length() > 10)
			return false;
		if(!(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'))
			return false;
		
		return true;
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

		Username username = (Username) other;
		return value == null ? username.getUsername() == null : value
				.equals(username.getUsername());
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
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username){
		value = username;
	}
}
