
public class User {
	
	private String profileIcon;
	private String firstName;
	private String lastName;
	private String username;
	private String birthday;
	private int contactNo;
	private String email;
	private String password;
	
	public User()
	{
		
	}

	public User(String profileIcon, String firstName, String lastName, String username, String birthday, int contactNo,
			String email, String password) {
		this.profileIcon = profileIcon;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.birthday = birthday;
		this.contactNo = contactNo;
		this.email = email;
		this.password = password;
	}

	public String getProfileIcon() {
		return profileIcon;
	}

	public void setProfileIcon(String profileIcon) {
		this.profileIcon = profileIcon;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void displayProfile() {
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("USER PROFILE");
		System.out.println("-----------------------------");
		
		System.out.printf("Profile Picture: %s", getProfileIcon());
		System.out.println();
		System.out.printf("First Name: %s", getFirstName());
		System.out.println();
		System.out.printf("Last Name: %s", getLastName());
		System.out.println();
		System.out.printf("Username: %s", getUsername());
		System.out.println();
		System.out.printf("Birthday: %s", getBirthday());
		System.out.println();
		System.out.printf("Contact No: %d", getContactNo());
		System.out.println();
		System.out.printf("Email Address: %s", getEmail());
		System.out.println();
		System.out.printf("Password: %s", getPassword());
	}
	
	public void editProfile()
	{
		System.out.println("Directing you to edit profile page...");
	}
	
	public void refreshProfile()
	{
		System.out.println("Refreshing profile...");
	}

	@Override
	public String toString() {
		return String.format(
				"User [profileIcon=%s, firstName=%s, lastName=%s, username=%s, birthday=%s, contactNo=%s, email=%s, password=%s]",
				profileIcon, firstName, lastName, username, birthday, contactNo, email, password);
	}
	
	
}
