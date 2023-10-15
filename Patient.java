
public class Patient extends User{
	
	private String nextOfKin;
	private String medicalHistory;
	
	
	public Patient() 
	{

	}
	
	public Patient(String profileIcon, String firstName, String lastName, String username, String birthday,
			int contactNo, String email, String password, String nextOfKin, String medicalHistory) {
		super(profileIcon, firstName, lastName, username, birthday, contactNo, email, password);
		this.nextOfKin = nextOfKin;
		this.medicalHistory = medicalHistory;
	}

	public String getNextOfKin() {
		return nextOfKin;
	}

	public void setNextOfKin(String nextOfKin) {
		this.nextOfKin = nextOfKin;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	
	public void displayProfile()
	{
		super.displayProfile();
		
		System.out.printf("Next of Kin: %s", getNextOfKin());
		System.out.println();
		System.out.printf("Medical History: %s", getMedicalHistory());
	}

	@Override
	public String toString() {
		return String.format("Patient [%s nextOfKin=%s, medicalHistory=%s]", super.toString(), nextOfKin, medicalHistory);
	}
	
}
