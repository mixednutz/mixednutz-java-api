package net.mixednutz.api.adapter.client;

/**
 * Adapter for social networks that don't follow the MixedNutz API
 * 
 * @author apfesta
 *
 */
public interface SocialNetworkClient<Api, Credentials> {
	
	public String getProviderId();
	
	public Class<Api> getApiClass();
	
	public Api getApi(Credentials creds);

}
