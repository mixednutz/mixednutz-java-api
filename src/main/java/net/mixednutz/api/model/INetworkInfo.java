package net.mixednutz.api.model;

/**
 * Information about this social network.
 * 
 * @author apfesta
 *
 */
public interface INetworkInfo extends INetworkInfoSmall {
		
	public String getOauth2AuthorizeUrl();
	public void setOauth2AuthorizeUrl(String oauthAuthorizeUrl);
	public String getOauth2TokenUrl();
	public void setOauth2TokenUrl(String oauthTokenUrl);
	public String getTimelineUrl();
	public void setTimelineUrl(String timelineEndpointUrl);
	public String getTimelineNextPageUrl();
	public void setTimelineNextPageUrl(String timelineNextPageUrl);
	public String getPublicTimelineUrl();
	public void setPublicTimelineUrl(String publicTimelineUrl);
	public String getPublicTimelineNextPageUrl();
	public void setPublicTimelineNextPageUrl(String publicTimelineNextPageUrl);
	public String getUserTimelineUrl();
	public void setUserTimelineUrl(String userTimelineUrl);
	public String getUserTimelineNextPageUrl();
	public void setUserTimelineNextPageUrl(String userTimelineNextPageUrl);
	
}
