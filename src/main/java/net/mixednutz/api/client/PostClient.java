package net.mixednutz.api.client;

import java.util.Map;

import net.mixednutz.api.model.IPost;
import net.mixednutz.api.model.ITimelineElement;

public interface PostClient<P extends IPost> {

	/**
	 * Posts to a timeline
	 * 
	 * @param post
	 * @return
	 */
	ITimelineElement postToTimeline(P post);
	
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
