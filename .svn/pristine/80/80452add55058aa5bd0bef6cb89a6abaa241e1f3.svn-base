/*
 * 
 */
package buddychallenge.util;

// TODO: Auto-generated Javadoc
/**
 * The Class Password.
 */
public class Password {
	
	/** The value. */
	String value;

	/**
	 * Instantiates a new password.
	 *
	 * @param password the password
	 */
	public Password(String password) {
		this.value = password;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return value;
	}

	/**
	 * Checks if is valid.
	 *
	 * @return true, if is valid
	 */
	public boolean isValid() {
		boolean latin = false;
		boolean number = false;
		char c;
		for(int i=0; i<value.length(); i++){
			c = value.charAt(i);
			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')
				latin = true;
			if (c >='0' && c <= '9')
				number = true;
		}
		if (!number || !latin)
			return false;
		if(value.length() <= 5)
			return false;
		if(value.isEmpty())
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

		if (!(other instanceof Password)) {
			return false;
		}

		Password password = (Password) other;
		return value == null ? password.getPassword() == null : value
				.equals(password.getPassword());
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
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password){
		value = password;
	}
}
