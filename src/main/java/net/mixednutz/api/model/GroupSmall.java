package net.mixednutz.api.model;

public class GroupSmall {

	private String uri;
	private String groupName;
	private String displayName;
	private NetworkInfo networkInfo;
	private Image avatar;
	
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
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
