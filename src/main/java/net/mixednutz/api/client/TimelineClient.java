package net.mixednutz.api.client;

import net.mixednutz.api.model.IPage;
import net.mixednutz.api.model.IPageRequest;
import net.mixednutz.api.model.ITimelineElement;

/**
 * Client to interact with a networks timeline
 * 
 * @author apfesta
 *
 */
public interface TimelineClient<Token> {
	
	/**
	 * Create a IPageRequest that can be used to poll the next set of data.
	 * Allows the provider to provide the page size and direction data should go.
	 * 
	 * @return
	 */
	<T> IPageRequest<T> getTimelinePollRequest(T start);
		
	/**
	 * Retrieve a timeline of all content subscribed to for this given network.
	 * 	 
	 * @param username
	 * @return
	 */
	IPage<? extends ITimelineElement, Token> getTimeline();
	
	/**
	 * Retrieve a timeline of all content subscribed to for this given network.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	IPage<? extends ITimelineElement, Token> getTimeline(IPageRequest<Token> pagination);
	
	/**
	 * Retrieve a timeline of all content subscribed to for this given network.
	 * 
	 * This provides a String token and allows the service to parse it.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	IPage<? extends ITimelineElement, Token> getTimelineStringToken(IPageRequest<String> pagination);
	
	/**
	 * Retrieve a timeline of all public to for this given network.
	 * 
	 * @param username
	 * @return
	 */
	IPage<? extends ITimelineElement, Token> getPublicTimeline();
	
	/**
	 * Retrieve a timeline of all public to for this given network.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	IPage<? extends ITimelineElement, Token> getPublicTimeline(IPageRequest<Token> pagination);
	
	/**
	 * Retrieve a timeline of all public to for this given network.
	 * 
	 * This provides a String token and allows the service to parse it.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	IPage<? extends ITimelineElement, Token> getPublicTimelineStringToken(IPageRequest<String> pagination);
	
	

}
