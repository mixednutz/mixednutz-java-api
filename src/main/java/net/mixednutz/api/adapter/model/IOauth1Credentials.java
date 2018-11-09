package net.mixednutz.api.adapter.model;


public interface IOauth1Credentials extends ICredentials {

	public String getAccessToken();
	public void setAccessToken(String accessToken);
	
	public String getSecret();
	public void setSecret(String secret);
		
}
