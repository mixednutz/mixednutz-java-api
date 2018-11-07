package net.mixednutz.api.model;

import java.time.ZonedDateTime;

/**
 * Represents Site-wide notifications.
 * 
 * @author apfesta
 *
 */
public interface INotification extends IApiResource {
	
	/**
	 * Type of Notification
	 * @return
	 */
	public String getTopic();
	/**
	 * Link to the Icon to be shown
	 * @return
	 */
	public ILink getIconUrl();
	/**
	 * Text-based Message
	 * @return
	 */
	public String getMessage();
	/**
	 * Rich HTML based Message
	 * @return
	 */
	public String getHtmlMessage();
	/**
	 * Date of this notification
	 * @return
	 */
	public ZonedDateTime getDateNotified();
		
}
