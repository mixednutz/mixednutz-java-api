package net.mixednutz.api.model;

public class UserSmall extends ApiObject {

	private String username;
	private String displayName;
	private NetworkInfo networkInfo;
	private Image avatar;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public NetworkInfo getNetworkInfo() {
		return networkInfo;
	}
	public void setNetworkInfo(NetworkInfo networkInfo) {
		this.networkInfo = networkInfo;
	}
	public Image getAvatar() {
		return avatar;
	}
	public void setAvatar(Image avatar) {
		this.avatar = avatar;
	}	
	
}
