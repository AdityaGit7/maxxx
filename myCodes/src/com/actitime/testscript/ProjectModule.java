package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass{
	@Test
	public void createProject() {
		Reporter.log("createProject", true);
	}
	@Test
	public void modifyUser() {
		Reporter.log("modifyProject", true);
	}
	@Test
	public void deleteUser() {
		Reporter.log("deleteProject", true);
	}

}
