package net.mixednutz.api.model;

public interface INetworkInfoSmall {

	/**
	 * Name of this social network.  (Ex. MixedNutz.net)
	 * 
	 * @return
	 */
	public String getDisplayName();
	
	/**
	 * Name of the host/server. (Ex. mixednutz.net)
	 * Include domain name without scheme or ports.
	 * 
	 * @return
	 */
	public String getHostName();
	
	/**
	 * ID of the social network.  IDs should be text-based and contain no special
	 * characters.  (Ex. mixednutz)
	 * 
	 * @return
	 */
	public String getId();
	
	/**
	 * Get the FontAwesome Icon name (Optional)
	 * Do not include the "fa-" prefix. (Ex. twitter)
	 * 
	 * @return
	 */
	public String getFontAwesomeIconName();
	
	/**
	 * Returns a list of MIME types that this Network can post.
	 * 
	 * @return
	 */
	public String[] compatibleMimeTypes();
	
}
