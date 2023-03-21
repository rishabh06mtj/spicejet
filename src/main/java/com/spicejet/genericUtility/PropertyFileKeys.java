package com.spicejet.genericUtility;

public enum PropertyFileKeys {
	URL("url"),BROWSER("browser"),TIMEOUT("timeout");
	private String keys;
	private PropertyFileKeys(String keys)
	{
		this.keys=keys;
	}
	public String convertToString() {
		
		return keys.toString(); 
	}
}
