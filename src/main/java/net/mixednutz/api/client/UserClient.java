package net.mixednutz.api.client;

import java.time.Instant;

import net.mixednutz.api.model.Page;
import net.mixednutz.api.model.PageRequest;
import net.mixednutz.api.model.TimelineElement;
import net.mixednutz.api.model.UserSmall;

public interface UserClient {

	UserSmall getUser(String username);
	
	/**
	 * Retrieve a timeline for the current user's content to for this given network.
	 * 
	 * @param username
	 * @return
	 */
	Page<TimelineElement, Instant> getTimeline();
	
	/**
	 * Retrieve a timeline for the current user's content to for this given network.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	Page<TimelineElement, Instant> getTimeline(PageRequest<Instant> pagination);
	
	
	/**
	 * Retrieve a timeline of user's content to for this given network.
	 * 
	 * @param username
	 * @return
	 */
	Page<TimelineElement, Instant> getTimeline(String username);
	
	/**
	 * Retrieve a timeline of user's content to for this given network.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	Page<TimelineElement, Instant> getTimeline(String username, PageRequest<Instant> pagination);
	
	void subscribeToUser(String username);
}
