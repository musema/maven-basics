package com.openlane.demo.basic.model;

import java.util.List;

public class Project {
	private List<Commit> commits;

	private List<Contributor> contributors;
	
	public Project() {
		
	}
	public List<Commit> getCommits() {
		return commits;
	}

	public void setCommits(List<Commit> commits) {
		this.commits = commits;
	}

	public List<Contributor> getContributors() {
		return contributors;
	}

	public void setContributors(List<Contributor> contributors) {
		this.contributors = contributors;
	}

}