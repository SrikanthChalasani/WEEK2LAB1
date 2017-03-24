
public class Publisher {
	private String Name;
	private String Address;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Publisher(String Name, String Address) {
		setName(Name);
		setAddress(Address);
	}
}
