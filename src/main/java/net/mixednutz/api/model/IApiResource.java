package net.mixednutz.api.model;

import java.util.List;

/**
 * Base building block for API resource.  Each API resource should have a URI, a URL and 
 * potential actions.
 * 
 * @author apfesta
 *
 */
public interface IApiResource {
		
	/**
	 * Resource Identifier of element.  
	 * Also Internet location of the Machine-readable version of the Element.
	 * @return
	 */
	public String getUrl();
		
	/**
	 * Internet location of the UI version of the Element
	 * @return
	 */
	public String getUri();
		
	/**
	 * Possible additional actions (outside of normal CRUD actions) that can be 
	 * performed
	 * @return
	 */
	public List<? extends IAction> getActions();

}
