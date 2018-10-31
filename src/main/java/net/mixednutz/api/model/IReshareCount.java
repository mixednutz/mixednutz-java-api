package net.mixednutz.api.model;

/**
 * Object representing times an element has been reshared with a given network
 * @author apfesta
 *
 */
public interface IReshareCount extends ICount {
	
	public INetworkInfoSmall getNetworkInfo();
	
}
