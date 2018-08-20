package net.mixednutz.api.model;

/**
 * Information about this social network.
 * 
 * @author apfesta
 *
 */
public class NetworkInfo {

	private String displayName;
	private String hostName;
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	
}
