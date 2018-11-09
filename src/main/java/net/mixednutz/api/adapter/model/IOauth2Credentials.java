package net.mixednutz.api.adapter.model;


public interface IOauth2Credentials extends ICredentials {
		
	public String getAuthCode();
	public void setAuthCode(String authCode);

	public String getRefreshToken();
	public void setRefreshToken(String refreshToken);

	public Long getExpireTime();
	public void setExpireTime(Long expireTime);

	
	
}
