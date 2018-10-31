package net.mixednutz.api.client;

import java.time.Instant;

import net.mixednutz.api.model.IGroupSmall;
import net.mixednutz.api.model.IPage;
import net.mixednutz.api.model.IPageRequest;
import net.mixednutz.api.model.ITimelineElement;

public interface GroupClient {
	
	IGroupSmall getGroup(String groupName);
	
	/**
	 * Retrieve a timeline of group's content to for this given network.
	 * 
	 * @param groupName
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	IPage<ITimelineElement, Instant> getTimeline(String groupName);
	
	/**
	 * Retrieve a timeline of group's content to for this given network.
	 * 
	 * @param groupName
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	IPage<ITimelineElement, Instant> getTimeline(String groupName, IPageRequest<Instant> pagination, 
			int pageSize);

	void subscribeToUser(String username);
}
