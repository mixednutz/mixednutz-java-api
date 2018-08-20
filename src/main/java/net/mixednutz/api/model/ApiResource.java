package net.mixednutz.api.model;

import java.util.List;

/**
 * Base building block for API resource.  Each API resource should have a URI, a URL and 
 * potential actions.
 * 
 * @author apfesta
 *
 */
class ApiResource {
	
	/**
	 * Resource Identifier of element.  
	 * Also Internet location of the Machine-readable version of the Element.
	 */
	private String uri;
	
	/**
	 * Internet location of the UI version of the Element
	 */
	private String url;
	
	/**
	 * Possible additional actions (outside of normal CRUD actions) that can be performed
	 */
	private List<Action> actions;
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public List<Action> getActions() {
		return actions;
	}
	public void setActions(List<Action> actions) {
		this.actions = actions;
	}	

}
