package org.lucky.services;

public class TutorialFinder 
{
	public String bestTutorial(String language)
	{
		System.out.println("parameter passed in url " + language);
		if(language.equalsIgnoreCase("java"))
			return "LakshmanTutorials";
		else
			return "not available";
		
	}
}
