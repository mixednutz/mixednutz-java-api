package net.mixednutz.api.model;

/**
 * A brief version of a User for use in other resources.
 * 
 * @author apfesta
 *
 */
public interface IUserSmall extends IApiResource {

	public String getUsername();
	public String getDisplayName();
	public IImage getAvatar();
	
	/**
	 * Returns whether this user disallows unauthenticated queries against
	 * their resources.
	 * 
	 * @return
	 */
	public boolean isPrivate();
		
}
