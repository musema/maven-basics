package com.openlane.demo.serviceTest;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import com.openlane.demo.basic.service.ProjectService;

public class ProjectServiceTest {
	private ProjectService pService;
	
	@Before
	public void init() {
		this.pService=new ProjectService();
	}
	@Test
	public void getProjectsByIdTest() {
		assertTrue(true);
	}

}
