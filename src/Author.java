
public class Author {
	private String FirstName;
	private String LastName;
	private String Address;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Author(String FirstName, String LastName, String Address) {
		setFirstName(FirstName);
		setLastName(LastName);
		setAddress(Address);
	}
}
