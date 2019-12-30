package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.BaseClass;

public class ViewLeadPage extends BaseClass {

	public FindLeadsPage clickFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();
		
	}
	public ViewLeadPage enterFirstName() {
		System.out.println("Enter First Name");
		return this;
	}

	
}
