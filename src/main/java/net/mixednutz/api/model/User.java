package net.mixednutz.api.model;

import java.util.Map;

/**
 * Full user profile.  For a smaller element see UserSmall.
 * 
 * @author apfesta
 * @see UserSmall
 */
public class User extends UserSmall {
	
	/**
	 * Custom data provided by the network
	 */
	private Map<String, String> profileData;

	public Map<String, String> getProfileData() {
		return profileData;
	}

	public void setProfileData(Map<String, String> data) {
		this.profileData = data;
	}
	
}
