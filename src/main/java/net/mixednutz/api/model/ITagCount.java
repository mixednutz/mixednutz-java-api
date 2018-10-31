package net.mixednutz.api.model;

/**
 * Object representing a count of tags
 * 
 * @author apfesta
 *
 */
public interface ITagCount extends ICount {
		
	public String getName();
	public void setName(String name);
	public String getDisplayName();
	public void setDisplayName(String displayName);
	
}
