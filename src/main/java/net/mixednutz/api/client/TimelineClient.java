package net.mixednutz.api.client;

import java.time.Instant;

import net.mixednutz.api.model.Page;
import net.mixednutz.api.model.PageRequest;
import net.mixednutz.api.model.TimelineElement;

/**
 * Client to interact with a networks timeline
 * 
 * @author apfesta
 *
 */
public interface TimelineClient {
	
	/**
	 * Retrieve a timeline of all content subscribed to for this given network.
	 * 	 
	 * @param username
	 * @return
	 */
	Page<TimelineElement, Instant> getTimeline();
	
	/**
	 * Retrieve a timeline of all content subscribed to for this given network.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	Page<TimelineElement, Instant> getTimeline(PageRequest<Instant> pagination);
	
	/**
	 * Retrieve a timeline of all public to for this given network.
	 * 
	 * @param username
	 * @return
	 */
	Page<TimelineElement, Instant> getPublicTimeline();
	
	/**
	 * Retrieve a timeline of all public to for this given network.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	Page<TimelineElement, Instant> getPublicTimeline(PageRequest<Instant> pagination);
	
	

}
