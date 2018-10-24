package net.mixednutz.api.client;

import java.time.Instant;

import net.mixednutz.api.model.GroupSmall;
import net.mixednutz.api.model.Page;
import net.mixednutz.api.model.PageRequest;
import net.mixednutz.api.model.TimelineElement;

public interface GroupClient {
	
	GroupSmall getGroup(String groupName);
	
	/**
	 * Retrieve a timeline of group's content to for this given network.
	 * 
	 * @param groupName
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	Page<TimelineElement, Instant> getTimeline(String groupName);
	
	/**
	 * Retrieve a timeline of group's content to for this given network.
	 * 
	 * @param groupName
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	Page<TimelineElement, Instant> getTimeline(String groupName, PageRequest<Instant> pagination, 
			int pageSize);

	void subscribeToUser(String username);
}
