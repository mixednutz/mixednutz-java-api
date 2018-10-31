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
public interface IAction {

	public String getName();
	public void setName(String name);
	public String getDisplayName();
	public void setDisplayName(String displayName);
	public ILink getUrl();
	public void setUrl(ILink url);
	
}
