package net.mixednutz.api.model;

import java.io.Serializable;

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
	
	public void setInReplyTo(Serializable inReplyToId);
		
}
