package net.mixednutz.api.model;

/**
 * Information about this social network.
 * 
 * @author apfesta
 *
 */
public class NetworkInfo {

	private String displayName;
	private String hostName;
	
	private String oauth2AuthorizeUrl;
	private String oauth2TokenUrl;
	private String timelineUrl;
	private String timelineNextPageUrl;
	
	public NetworkInfo() {
		super();
	}
	public NetworkInfo(String hostName) {
		super();
		this.hostName = hostName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getOauth2AuthorizeUrl() {
		return oauth2AuthorizeUrl;
	}
	public void setOauth2AuthorizeUrl(String oauthAuthorizeUrl) {
		this.oauth2AuthorizeUrl = oauthAuthorizeUrl;
	}
	public String getOauth2TokenUrl() {
		return oauth2TokenUrl;
	}
	public void setOauth2TokenUrl(String oauthTokenUrl) {
		this.oauth2TokenUrl = oauthTokenUrl;
	}
	public String getTimelineUrl() {
		return timelineUrl;
	}
	public void setTimelineUrl(String timelineEndpointUrl) {
		this.timelineUrl = timelineEndpointUrl;
	}
	public String getTimelineNextPageUrl() {
		return timelineNextPageUrl;
	}
	public void setTimelineNextPageUrl(String timelineNextPageUrl) {
		this.timelineNextPageUrl = timelineNextPageUrl;
	}
	
}
