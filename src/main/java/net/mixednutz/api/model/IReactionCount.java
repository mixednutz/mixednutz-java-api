package net.mixednutz.api.model;

/**
 * Object representing a count of unicode based reactions
 * 
 * @author apfesta
 *
 */
public interface IReactionCount extends ICount {
		
	/**
	 * HTML Unicode value
	 * @return
	 */
	public String getUnicode();
	public void setUnicode(String unicode);

	/**
	 * Description of the Unicode
	 * @return
	 */
	public String getDescription();
	public void setDescription(String description);
	
}
