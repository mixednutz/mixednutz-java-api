package net.mixednutz.api.model;

public interface IPageRequest<Token> {
		
	public Token getEnd();
	
	public Token getStart();
	
	public SortDirection getSortDirection();
		
}