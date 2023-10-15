
public class Feedback {
	
	private String feedback;
	private Patient patientName;
	private Therapist therapistName;
	
	public Feedback()
	{
		
	}

	public Feedback(String feedback, Patient patientName, Therapist therapistName) {
		this.feedback = feedback;
		this.patientName = patientName;
		this.therapistName = therapistName;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Patient getPatientName() {
		return patientName;
	}

	public void setPatientName(Patient patientName) {
		this.patientName = patientName;
	}

	public Therapist getTherapistName() {
		return therapistName;
	}

	public void setTherapistName(Therapist therapistName) {
		this.therapistName = therapistName;
	}

	public void displayPatientName()
	{
		System.out.printf("Username: %s", patientName.getUsername());
	}
	
	public void displayTherapistName()
	{
		System.out.printf("Therapist Name: %s %s", therapistName.getFirstName(), therapistName.getLastName());
	}
	@Override
	public String toString() {
		return String.format("Feedback [feedback=%s, patientName=%s, therapistName=%s]", feedback, patientName,
				therapistName);
	}
	

}