package net.mixednutz.api.client;

import java.time.Instant;

import net.mixednutz.api.model.IPage;
import net.mixednutz.api.model.IPageRequest;
import net.mixednutz.api.model.ITimelineElement;

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
	IPage<? extends ITimelineElement, Instant> getTimeline();
	
	/**
	 * Retrieve a timeline of all content subscribed to for this given network.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	IPage<? extends ITimelineElement, Instant> getTimeline(IPageRequest<Instant> pagination);
	
	/**
	 * Retrieve a timeline of all public to for this given network.
	 * 
	 * @param username
	 * @return
	 */
	IPage<? extends ITimelineElement, Instant> getPublicTimeline();
	
	/**
	 * Retrieve a timeline of all public to for this given network.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	IPage<? extends ITimelineElement, Instant> getPublicTimeline(IPageRequest<Instant> pagination);
	
	

}
