package net.mixednutz.api.model;

/**
 * Interface for seek pagination request.
 * 
 * This will query for a result set
 * PageSize number of records in a 
 * Direction of (Greater/Less than)
 * Start token.
 * 
 * @author apfesta
 *
 * @param <Token>
 */
public interface IPageRequest<Token> {
					
	/**
	 * Starting value for the seek.  
	 * 
	 * Start may be null, but a default value will be chosen.
	 * 
	 * @return
	 */
	Token getStart();
	
	/**
	 * Limit results to this page size.
	 * 
	 * Page Size may be null, but a default value will be chosen
	 * 
	 * @return
	 */
	Integer getPageSize();
	
	/**
	 * Which direction do you want to seek relative to getStart()?
	 * 
	 * @return
	 */
	Direction getDirection();
		
	public enum Direction {
		GREATER_THAN,
		LESS_THAN
	}
}