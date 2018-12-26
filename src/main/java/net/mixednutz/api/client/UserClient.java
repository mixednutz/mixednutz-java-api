package net.mixednutz.api.client;

import net.mixednutz.api.model.IPage;
import net.mixednutz.api.model.IPageRequest;
import net.mixednutz.api.model.ITimelineElement;
import net.mixednutz.api.model.IUserSmall;

public interface UserClient<Token> {

	/**
	 * Gets the current user's profile
	 * 
	 * @return
	 */
	IUserSmall getUser();
	
	/**
	 * Gets the given user's profile
	 * 
	 * @param username
	 * @return
	 */
	IUserSmall getUser(String username);
	
	/**
	 * Retrieve a timeline for the current user's content to for this given network.
	 * 
	 * @param username
	 * @return
	 */
	IPage<? extends ITimelineElement, Token> getUserTimeline();
	
	/**
	 * Retrieve a timeline for the current user's content to for this given network.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	IPage<? extends ITimelineElement, Token> getUserTimeline(IPageRequest<Token> pagination);
	
	
	/**
	 * Retrieve a timeline of user's content to for this given network.
	 * 
	 * @param username
	 * @return
	 */
	IPage<? extends ITimelineElement, Token> getUserTimeline(String username);
	
	/**
	 * Retrieve a timeline of user's content to for this given network.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	IPage<? extends ITimelineElement, Token> getUserTimeline(String username, IPageRequest<Token> pagination);
	
	void subscribeToUser(String username);
}
