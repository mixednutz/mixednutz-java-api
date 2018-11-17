package net.mixednutz.api.provider;

/**
 * Social network API provider.
 * 
 * @author apfesta
 *
 */
public interface ApiProvider<Api, Credentials> {
	
	public String getProviderId();
	
	public Class<Api> getApiClass();
	
	public Api getApi(Credentials creds);

}
