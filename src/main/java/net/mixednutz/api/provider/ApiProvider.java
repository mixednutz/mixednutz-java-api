package net.mixednutz.api.provider;

import net.mixednutz.api.model.INetworkInfoSmall;

/**
 * Social network API provider.
 * 
 * @author apfesta
 *
 */
public interface ApiProvider<Api, Credentials> {
	
	public String getProviderId();
	
	public INetworkInfoSmall getNetworkInfo();
	
	public Class<Api> getApiClass();
	
	public Api getApi(Credentials creds);

}
