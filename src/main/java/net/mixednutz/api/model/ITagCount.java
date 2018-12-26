package net.mixednutz.api.model;

/**
 * Object representing a count of tags
 * 
 * @author apfesta
 *
 */
public interface ITagCount extends ICount {
		
	public String getName();
	
	public String getDisplayName();
	
	/**
	 * Toggle this tag
	 * @return
	 */
	public IAction getToggleAction();
	
}
