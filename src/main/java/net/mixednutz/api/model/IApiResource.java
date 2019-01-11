package net.mixednutz.api.model;

import java.io.Serializable;
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
	 * Identifier used by the provider.  
	 * Implementations are expected to provide a subtype of Serializable
	 * 
	 * @return
	 */
	public Serializable getProviderId();
	
	/**
	 * Resource Identifier of element.  
	 * Also Internet location of the Machine-readable version of the Element.
	 * @return
	 */
	public String getUri();
		
	/**
	 * Internet location of the UI version of the Element
	 * @return
	 */
	public String getUrl();
		
	/**
	 * Possible additional actions (outside of normal CRUD actions) that can be 
	 * performed
	 * @return
	 */
	public List<? extends IAction> getActions();

}
