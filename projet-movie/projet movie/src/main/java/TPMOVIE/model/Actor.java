package TPMOVIE.model;

import io.swagger.annotations.ApiModelProperty;

public class Actor {

	public Actor(int i, String nom, String prenom, String dateNaiss) {
		
	}
	public Actor(Integer id, String firstName, String lastName, String dateNaiss) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateNaiss = dateNaiss;
	}

	@ApiModelProperty(notes = "Actor ID",name="ID",required=true,value="ID")
	private Integer id;
	@ApiModelProperty(notes = "Actor First Name",name="FirstName",required=true,value="FirstName")
	private String firstName;
	@ApiModelProperty(notes = "Actor Last Name",name="LastName",required=true,value="LastName")
	private String lastName;
	@ApiModelProperty(notes = "Actor Birth Date (String)",name="Birth",required=true,value="xx/xx/xx")
	private String dateNaiss;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", date de naissance=" + dateNaiss  ;
	}
}
