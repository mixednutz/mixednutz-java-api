package net.mixednutz.api.client;

import java.util.Map;

import net.mixednutz.api.model.IPost;

public interface PostClient<P extends IPost> {

	void postToTimeline(P post);
	
	/**
	 * Creates a new instance of a post to be filled
	 * 
	 * @return
	 */
	P create();
	
	/**
	 * Additional data to show in the posting dialog to help with the user 
	 * filling out the post.
	 * 
	 * @return
	 */
	Map<String, Object> referenceDataForPosting();
	
}
