
public class Therapist extends User{
	
	private String speciality;
	private String serviceOffered;
	
	public Therapist()
	{
		
	}

	public Therapist(String profileIcon, String firstName, String lastName, String username, String birthday,
			int contactNo, String email, String password, String speciality, String serviceOffered) {
		super(profileIcon, firstName, lastName, username, birthday, contactNo, email, password);
		this.speciality = speciality;
		this.serviceOffered = serviceOffered;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getServiceOffered() {
		return serviceOffered;
	}

	public void setServiceOffered(String serviceOffered) {
		this.serviceOffered = serviceOffered;
	}
	
	public void displayProfile()
	{
		super.displayProfile();
		
		System.out.printf("Speciality: %s", getSpeciality());
		System.out.println();
		System.out.printf("Service Offered: %s", getServiceOffered());
	}

	@Override
	public String toString() {
		return String.format("Therapist [%s speciality=%s, serviceOffered=%s]", super.toString(), speciality, serviceOffered);
	}
	
}
