package net.mixednutz.api.model;

import java.util.Set;


/**
 * Common properties or fields for entities that have visibility attributes.
 * 
 * @see Type
 * @author apfesta
 *
 */
public interface IVisibility {

	public Type getVisibilityType();

	public Set<? extends IUserSmall> getSelectFollowers();
	
	public Set<? extends IGroupSmall> getFriendGroups();
	
	/**
	 * The basis for site level security based on the relation with other users
	 * 
	 * <ul>
	 * <li>PRIVATE - Only the author of the entity can see it</li>
	 * <li>SELECT_FOLLOWERS - Only a select list of followers can see it</li>
	 * <li>ALL_FOLLOWERS - All followers can see it</li>
	 * <li>FRIEND_GROUPS - One or more groups of friends (mutual followers) can see it</li>
	 * <li>ALL_FRIENDS - All friends (mutual followers) can see it
	 * <li>ALL_USERS - All authenticated users can see it
	 * <li>WORLD - Everyone including unauthenticated users can see it
	 * </ul>
	 *
	 */
	public enum Type {

		PRIVATE, 
		SELECT_FOLLOWERS, 
		FRIEND_GROUPS, 
		ALL_FRIENDS, 
		ALL_FOLLOWERS, 
		ALL_USERS,
		WORLD
			
	}
	
}
