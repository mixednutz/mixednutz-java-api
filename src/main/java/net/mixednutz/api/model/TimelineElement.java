package net.mixednutz.api.model;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;

import net.mixednutz.api.model.Oembeds.Oembed;

public class TimelineElement extends ApiObject {

	/**
	 * The type of element
	 */
	private Type type;

	/**
	 * User who posted this element
	 */
	private UserSmall postedByUser;

	/**
	 * This can be either
	 * <li>the date created
	 * <li>the last post in the conversation
	 */
	private ZonedDateTime postedOnDate;

	/**
	 * Unique value to relative to the timeline page.
	 */
	private Serializable paginationId;

	/**
	 * Optional Oembed data.
	 */
	private Oembed oembed;

	/**
	 * Optional count of reactions this element has received
	 */
	private List<ReactionCount> reactions;

	/**
	 * Optional count of tags this element has received
	 */
	private List<TagCount> tags;

	/**
	 * Optional count of times this element has been reshared by network.
	 */
	private List<ReshareCount> reshares;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public UserSmall getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(UserSmall postedByUser) {
		this.postedByUser = postedByUser;
	}

	public ZonedDateTime getPostedOnDate() {
		return postedOnDate;
	}

	public void setPostedOnDate(ZonedDateTime postedOnDate) {
		this.postedOnDate = postedOnDate;
	}

	public Serializable getPaginationId() {
		return paginationId;
	}

	public void setPaginationId(Serializable paginationId) {
		this.paginationId = paginationId;
	}

	public Oembed getOembed() {
		return oembed;
	}

	public void setOembed(Oembed oembed) {
		this.oembed = oembed;
	}

	public List<ReactionCount> getReactions() {
		return reactions;
	}

	public void setReactions(List<ReactionCount> reactions) {
		this.reactions = reactions;
	}

	public List<TagCount> getTags() {
		return tags;
	}

	public void setTags(List<TagCount> tags) {
		this.tags = tags;
	}

	public List<ReshareCount> getReshares() {
		return reshares;
	}

	public void setReshares(List<ReshareCount> reshares) {
		this.reshares = reshares;
	}

	/**
	 * The type can be a custom type created by the remote network,
	 */
	public static class Type {

		String name;
		NetworkInfo networkInfo;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public NetworkInfo getNetworkInfo() {
			return networkInfo;
		}

		public void setNetworkInfo(NetworkInfo networkInfo) {
			this.networkInfo = networkInfo;
		}

	}
}
