package net.mixednutz.api.adapter.client;

import net.mixednutz.api.model.IPage;
import net.mixednutz.api.model.IPageRequest;

public interface TimelineAdapterClient<Item, Token> {

	/**
	 * Retrieve a timeline of all content subscribed to for this given network.
	 * 	 
	 * @param username
	 * @return
	 */
	IPage<? extends Item, Token> getTimeline();
	
	/**
	 * Retrieve a timeline of all content subscribed to for this given network.
	 * 
	 * @param username
	 * @param pagination
	 * @param pageSize
	 * @return
	 */
	IPage<? extends Item, Token> getTimeline(IPageRequest<Token> pagination);
	
	
}
