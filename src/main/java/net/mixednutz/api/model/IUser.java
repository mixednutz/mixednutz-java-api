package net.mixednutz.api.model;

/**
 * Full user profile.  For a smaller element see UserSmall.
 * 
 * @author apfesta
 * @see IUserSmall
 */
public interface IUser extends IUserSmall {
	
	/**
	 * Custom data provided by the network
	 * @return
	 */
	public IUserProfile getProfileData();
	
}
