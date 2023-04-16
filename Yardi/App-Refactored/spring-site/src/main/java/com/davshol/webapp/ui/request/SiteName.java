package com.davshol.webapp.ui.request;

import javax.validation.constraints.NotNull;

public class SiteName {
	
	@NotNull(message="Site name can not be null")
	private String siteName;

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

}
