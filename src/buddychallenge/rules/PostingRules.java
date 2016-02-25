/*
 * 
 */
package buddychallenge.rules;

import buddychallenge.entities.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface PostingRules.
 */
public interface PostingRules {
	
	/**
	 * Checks for access.
	 *
	 * @param creator, User Instance, the creator of the post
	 * @param viewer, User Instance, the viewer of the post
	 * @return true, if the two users satisfies the rules.
	 */
	public boolean hasAccess(User creator, User viewer);
}
