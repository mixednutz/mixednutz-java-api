package net.mixednutz.api.model;

/**
 * Object representing a count of tags
 * 
 * @author apfesta
 *
 */
public class TagCount {
	
	private String name;
	private String displayName;
	private Integer count;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
}
