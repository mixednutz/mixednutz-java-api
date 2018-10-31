package net.mixednutz.api.client;

public interface MixednutzClient {

	GroupClient getGroupClient();
		
	TimelineClient getTimelineClient();
	
	UserClient getUserClient();
	
}
