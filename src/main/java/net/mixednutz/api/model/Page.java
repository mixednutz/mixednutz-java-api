package net.mixednutz.api.model;

import java.util.List;

public class Page<D, Token> {

	private List<D> items;
	private PageRequest<Token> pageRequest;
	private PageRequest<Token> prevPage;
	private PageRequest<Token> nextPage;
	
	public List<D> getItems() {
		return items;
	}
	public void setItems(List<D> items) {
		this.items = items;
	}
	/**
	 * Get the newest Page
	 * 
	 * @return
	 */
	public PageRequest<Token> getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(PageRequest<Token> nextPage) {
		this.prevPage = nextPage;
	}
	public PageRequest<Token> getPageRequest() {
		return pageRequest;
	}
	public void setPageRequest(PageRequest<Token> currentPage) {
		this.pageRequest = currentPage;
	}
	public PageRequest<Token> getNextPage() {
		return nextPage;
	}
	public void setNextPage(PageRequest<Token> previousPage) {
		this.nextPage = previousPage;
	}
}