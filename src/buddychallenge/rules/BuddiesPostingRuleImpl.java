/*
 * 
 */
package buddychallenge.rules;

import buddychallenge.entities.User;

// TODO: Auto-generated Javadoc
/**
 * The Class BuddiesPostingRuleImpl.
 */
public class BuddiesPostingRuleImpl implements PostingRules {	
	
	/* (non-Javadoc)
	 * @see buddychallenge.rules.PostingRules#hasAccess(buddychallenge.entities.User, buddychallenge.entities.User)
	 */
	public boolean hasAccess(User creator, User viewer){
		if (creator.hasBuddy(viewer)){
			return true;
		}
		return false;
	}
	
}
