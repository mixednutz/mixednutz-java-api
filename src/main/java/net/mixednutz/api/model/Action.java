package net.mixednutz.api.model;

/**
 * Action that can be performed.  
 * 
 * Action URLs should be GET requests with any required parameter already provided. 
 * The client will GET this resource with no modification of the URL.
 * 
 * @author apfesta
 *
 */
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
