package net.mixednutz.api.model;

import java.time.Instant;
import java.util.List;



public class TimelineElementPage extends Page<TimelineElement, Instant> {
	private Page<TimelineElement, Instant> delegate = new Page<TimelineElement, Instant>();

	public TimelineElementPage(Page<TimelineElement, Instant> delegate) {
		super();
		this.delegate = delegate;
	}

	public List<TimelineElement> getItems() {
		return delegate.getItems();
	}

	public void setItems(List<TimelineElement> items) {
		delegate.setItems(items);
	}

	public PageRequest<Instant> getPrevPage() {
		return delegate.getPrevPage();
	}

	public void setPrevPage(PageRequest<Instant> nextPage) {
		delegate.setPrevPage(nextPage);
	}

	@Override
	public PageRequest<Instant> getPageRequest() {
		return delegate.getPageRequest();
	}

	@Override
	public void setPageRequest(PageRequest<Instant> currentPage) {
		delegate.setPageRequest(currentPage);
	}
}
