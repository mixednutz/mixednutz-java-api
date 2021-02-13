package net.mixednutz.api.client;

import net.mixednutz.api.model.IPost;

public interface PostClient<P extends IPost> {

	void postToTimeline(P post);
	
	/**
	 * Creates a new instance of a post to be filled
	 * 
	 * @return
	 */
	P create();
	
}
