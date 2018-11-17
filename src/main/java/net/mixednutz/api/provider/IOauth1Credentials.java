package net.mixednutz.api.provider;


public interface IOauth1Credentials extends ICredentials {

	public String getAccessToken();
	public void setAccessToken(String accessToken);
	
	public String getSecret();
	public void setSecret(String secret);
		
}
