package net.mixednutz.api.model;

/**
 * An element you can post to the service
 * 
 * @author apfesta
 *
 */
public interface IPost {

	public void setText(String text);
		
	public void setUrl(String url);
	
	public void setTags(String[] tags);
		
}
