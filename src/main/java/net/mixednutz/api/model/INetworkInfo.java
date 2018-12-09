package net.mixednutz.api.model;

/**
 * Information about this social network.
 * 
 * @author apfesta
 *
 */
public interface INetworkInfo extends INetworkInfoSmall {
		
	public String getOauth2AuthorizeUrl();
	public String getOauth2TokenUrl();
	public String getTimelineUrl();
	public String getTimelineNextPageUrl();
	public String getPublicTimelineUrl();
	public String getPublicTimelineNextPageUrl();
	public String getUserTimelineUrl();
	public String getUserTimelineNextPageUrl();
	public String getUserProfileUrl();
	
}
