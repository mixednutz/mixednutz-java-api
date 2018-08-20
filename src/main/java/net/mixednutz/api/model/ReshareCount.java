package net.mixednutz.api.model;

/**
 * Object representing times an element has been reshared with a given network
 * @author apfesta
 *
 */
public class ReshareCount {
	
	private NetworkInfo networkInfo;
	private Integer count;
	
	public NetworkInfo getNetworkInfo() {
		return networkInfo;
	}
	public void setNetworkInfo(NetworkInfo networkInfo) {
		this.networkInfo = networkInfo;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
}
