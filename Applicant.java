package com.gl.caseStudy1;

public class Applicant {

	public Integer id;
	public String name;
	public Double subject1Mark;
	public Double subjec2Mark;
	public Double subject3Mark;
	public Double total;
	public Double percentage;
	public Integer idGenerator = 100;
	
	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Applicant(Integer id, String name, Double subject1Mark, Double subjec2Mark, Double subject3Mark, Double total,
			Double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.subject1Mark = subject1Mark;
		this.subjec2Mark = subjec2Mark;
		this.subject3Mark = subject3Mark;
		this.total = total;
		this.percentage = percentage;
	}

	public Applicant(String name, Double subject1Mark, Double subjec2Mark, Double subject3Mark, Double total,
			Double percentage, Integer idGenerator) {
		super();
		this.name = name;
		this.subject1Mark = subject1Mark;
		this.subjec2Mark = subjec2Mark;
		this.subject3Mark = subject3Mark;
		this.total = total;
		this.percentage = percentage;
		this.idGenerator = idGenerator;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSubject1Mark() {
		return subject1Mark;
	}

	public void setSubject1Mark(Double subject1Mark) {
		this.subject1Mark = subject1Mark;
	}

	public Double getSubjec2Mark() {
		return subjec2Mark;
	}

	public void setSubjec2Mark(Double subjec2Mark) {
		this.subjec2Mark = subjec2Mark;
	}

	public Double getSubject3Mark() {
		return subject3Mark;
	}

	public void setSubject3Mark(Double subject3Mark) {
		this.subject3Mark = subject3Mark;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		String output = String.format("%-5s %-10s %-5s %-5s %-5s %-10s %-10s", id,name,subject1Mark,subjec2Mark,subject3Mark,total,percentage);
		return output;
	}
	

	
}
