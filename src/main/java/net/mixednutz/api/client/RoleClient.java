package net.mixednutz.api.client;

import java.util.List;

import net.mixednutz.api.model.IExternalRole;

/**
 * Interface for a client that has usable roles we use for IVisibility.getExternalGroups
 * 
 * @author apfesta
 *
 */
public interface RoleClient {
	
	boolean hasRoles();
	
	/**
	 * Available roles for limiting a posts availability
	 * 
	 * @return
	 */
	List<? extends IExternalRole> getAvailableRoles();
	
	/**
	 * The roles a user has.
	 * 
	 * @return
	 */
	List<? extends IExternalRole> getRolesAssigned();

}
