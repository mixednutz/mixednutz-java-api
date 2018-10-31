package net.mixednutz.api.model;

import java.util.Map;

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
	public Map<String, String> getProfileData();

	public void setProfileData(Map<String, String> data);
	
}
