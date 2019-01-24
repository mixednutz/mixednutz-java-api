package net.mixednutz.api.model;

import java.util.List;

public interface IPage<D, Token> {
	
	public List<D> getItems();
	
	/**
	 * Reverses the pagination and returns the first page in the opposite direction.
	 * Reverse should only be called once and subsequent requests should use nextPage.
	 * @return
	 */
	public IPageRequest<Token> getReversePage();
	
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
	
	public boolean hasReverse();
	
}