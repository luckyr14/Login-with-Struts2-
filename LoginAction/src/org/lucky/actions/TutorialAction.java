package org.lucky.actions;

import org.lucky.services.*;

public class TutorialAction 
{
	private String getBestSite;
	
	private String language;
	
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String execute()
	{
		System.out.println("Tutorial Action execute");
		TutorialFinder tf = new TutorialFinder();
		setGetBestSite(tf.bestTutorial(getLanguage()));
		return "error";
	}

	public String getGetBestSite() {
		return getBestSite;
	}

	public void setGetBestSite(String getBestSite) {
		this.getBestSite = getBestSite;
	}
}
