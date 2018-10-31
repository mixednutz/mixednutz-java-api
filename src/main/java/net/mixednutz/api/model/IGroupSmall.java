package net.mixednutz.api.model;

/**
 * A brief version of a Group for use in other resources.
 * 
 * @author apfesta
 *
 */
public interface IGroupSmall extends IApiResource {

	public String getGroupName();
	public void setGroupName(String groupName);
	public String getDisplayName();
	public void setDisplayName(String displayName);
	public INetworkInfo getNetworkInfo();
	public IImage getAvatar();
	
}
