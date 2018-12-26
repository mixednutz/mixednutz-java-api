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

	/**
	 * Description of the Unicode
	 * @return
	 */
	public String getDescription();
	
	/**
	 * Toggle this reaction
	 * @return
	 */
	public IAction getToggleAction();
	
}
