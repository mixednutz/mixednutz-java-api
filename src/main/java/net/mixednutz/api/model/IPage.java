package net.mixednutz.api.model;

import java.util.List;

public interface IPage<D, Token> {
	
	public List<D> getItems();
	
	/**
	 * Get the request for the previous page according to the tokens and sort.
	 * @return
	 */
	public IPageRequest<Token> getPrevPage();
	
	/**
	 * Get the current page request
	 * @return
	 */
	public IPageRequest<Token> getPageRequest();
	
	/**
	 * Get the next page request according to the tokens and sort
	 * @return
	 */
	public IPageRequest<Token> getNextPage();
	
	public boolean hasNext();
	
	public boolean hasPrev();
	
}