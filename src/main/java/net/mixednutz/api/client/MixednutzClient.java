package net.mixednutz.api.client;

public interface MixednutzClient {

	GroupClient getGroupClient();
	
	NetworkInfoClient getNetworkInfoClient();
	
	TimelineClient getTimelineClient();
	
	UserClient getUserClient();
	
}
