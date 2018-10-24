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

	public Image() {
	}

	public Image(String src) {
		this(src, null);
	}

	public Image(String src, String alt) {
		super();
		this.src = src;
		this.alt = alt;
	}

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
