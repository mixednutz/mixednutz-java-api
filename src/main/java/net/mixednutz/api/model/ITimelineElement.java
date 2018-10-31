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

	public void setPostedOnDate(ZonedDateTime postedOnDate);

	/**
	 * The date updated or the last post in the conversation
	 * @return
	 */
	public ZonedDateTime getUpdatedOnDate();

	public void setUpdatedOnDate(ZonedDateTime updatedOnDate);

	/**
	 * Unique value to relative to the timeline page.
	 * @return
	 */
	public Serializable getPaginationId();

	public void setPaginationId(Serializable paginationId);

	/**
	 * Optional Title
	 * @return
	 */
	public String getTitle();

	public void setTitle(String title);

	/**
	 * Optional short description (may be truncated)
	 * @return
	 */
	public String getDescription();

	public void setDescription(String description);

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
	 * The type can be a custom type created by the remote network,
	 */
	public interface Type {

		public String getName();

		public void setName(String name);

		public String getNamespace();

		public void setNamespace(String namespace);

	}
}
