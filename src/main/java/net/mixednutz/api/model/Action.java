package net.mixednutz.api.model;

public class Action {

	private String name;
	private String displayName;
	private Link url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public Link getUrl() {
		return url;
	}
	public void setUrl(Link url) {
		this.url = url;
	}
	
}
