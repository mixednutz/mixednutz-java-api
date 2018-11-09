package net.mixednutz.api.model;

public interface INetworkInfoSmall {

	/**
	 * Name of this social network
	 * 
	 * @return
	 */
	public String getDisplayName();
	
	/**
	 * Name of the host/server.  Maybe be used as a unique ID.
	 * 
	 * @return
	 */
	public String getHostName();
	
	/**
	 * Get the FontAwesome Icon name (Optional)
	 * @return
	 */
	public String getFontAwesomeIconName();
	
}
