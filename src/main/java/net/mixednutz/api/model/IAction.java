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

	/**
	 * ID for Action.  Should be unique.
	 * @return
	 */
	public String getName();
	
	/**
	 * Display name for Action.  May be included as a button or link's text
	 * @return
	 */
	public String getDisplayName();
	
	/**
	 * Description for Action.  Maybe be included as a action's tooltip.
	 * @return
	 */
	public String getDescription();
	
	/**
	 * Get the FontAwesome Icon name (Optional)
	 * Do not include the "fa-" prefix. (Ex. twitter)
	 * 
	 * @return
	 */
	public String getFontAwesomeIconName();
	
	/**
	 * Get the Gyphicon Icon name (Optional)
	 * Do not include the "glyphicon-" prefix.  (Ex. tag)
	 * 
	 * @return
	 */
	public String getGlyphiconIconName();
	
	/**
	 * URL for action
	 * 
	 * @return
	 */
	public ILink getUrl();
		
}
