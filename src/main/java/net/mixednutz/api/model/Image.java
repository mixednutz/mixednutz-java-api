package net.mixednutz.api.model;

/**
 * Link to an external image.
 * 
 * @author apfesta
 *
 */
public class Image {
	
	private String src;
	private String alt;

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}
	
}
