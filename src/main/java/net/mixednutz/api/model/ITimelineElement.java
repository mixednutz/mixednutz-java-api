package net.mixednutz.api.model;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;

/**
 * An element that appears in a network, group, or user timeline.
 * 
 * @author apfesta
 *
 */
public interface ITimelineElement extends IApiResource {

	/**
	 * The type of element
	 * @return
	 */
	public Type getType();
	
	/**
	 * Who can see this element
	 * @return
	 */
	public IVisibility getVisibility();

	/**
	 * User who posted this element
	 * @return
	 */
	public IUserSmall getPostedByUser();

	/**
	 * Optional group this element was posted to
	 * @return
	 */
	public IGroupSmall getPostedToGroup();

	/**
	 * The date created
	 * @return
	 */
	public ZonedDateTime getPostedOnDate();

	/**
	 * The date updated or the last post in the conversation
	 * @return
	 */
	public ZonedDateTime getUpdatedOnDate();

	/**
	 * Unique value to relative to the timeline page.
	 * Implementations are expected to provide a subtype of Serializable
	 * 
	 * @return
	 */
	public Serializable getPaginationId();

	/**
	 * Optional Title
	 * @return
	 */
	public String getTitle();

	/**
	 * Optional short description (may be truncated)
	 * @return
	 */
	public String getDescription();

	/**
	 * Optional Alternate data.
	 * @return
	 */
	public Collection<? extends IAlternateLink> getAlternateLinks();

	/**
	 * Optional count of reactions this element has received
	 * @return
	 */
	public List<? extends IReactionCount> getReactions();

	/**
	 * Optional count of tags this element has received
	 * @return
	 */
	public List<? extends ITagCount> getTags();

	/**
	 * Optional count of times this element has been reshared by network.
	 * @return
	 */
	public List<? extends IReshareCount> getReshares();
	
	/**
	 * Optional list of comments about this element
	 * 
	 * @return
	 */
	public List<? extends ITimelineElement> getComments();

	/**
	 * The type can be a custom type created by the remote network,
	 */
	public interface Type {

		/**
		 * Display name of this type
		 * 
		 * @return
		 */
		public String getName();

		/**
		 * Namespace/hostname this type originates from
		 * @return
		 */
		public String getNamespace();
		
		/**
		 * Unique ID of this type.
		 * 
		 * @return
		 */
		public String getId();

	}
}
