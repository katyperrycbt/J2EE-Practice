package com.ajax;

public class Composer {

	private String id;
	private String firstName;
	private String lastName;
	private String category;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Composer(String id, String firstName, String lastName, String category) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.category = category;
		// TODO Auto-generated constructor stub
	}

	public String getCategory() {
		return category;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
