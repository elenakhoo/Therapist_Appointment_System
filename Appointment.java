
public class Appointment {
	
	private Patient patient;
	private String appDate;
	private String appTime;
	private String option;
	private Therapist therapist;
	private String appMessage;
	
	// private static int totalApp; PART 2
	
	public Appointment()
	{
		
	}

	public Appointment(Patient patient, String appDate, String appTime, String option, Therapist therapist,
			String appMessage) {
		this.patient = patient;
		this.appDate = appDate;
		this.appTime = appTime;
		this.option = option;
		this.therapist = therapist;
		this.appMessage = appMessage;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getAppDate() {
		return appDate;
	}

	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}

	public String getAppTime() {
		return appTime;
	}

	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public Therapist getTherapist() {
		return therapist;
	}

	public void setTherapist(Therapist therapist) {
		this.therapist = therapist;
	}

	public String getAppMessage() {
		return appMessage;
	}

	public void setAppMessage(String appMessage) {
		this.appMessage = appMessage;
	}
	
	public boolean checkOption()
	{
		if (option.equals("Yes"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void optionChoice()
	{
		if (checkOption() == true)
		{
			therapistChoice();
		}
	}
	
	public void therapistChoice()
	{
		System.out.printf("Which therapist would you like to work with? \n%s %s", therapist.getFirstName(), therapist.getLastName());
	}
	
	public void displayAppointment()
	{
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("APPOINTMENT");
		System.out.println("-----------------------------");
		
		System.out.println();
		System.out.println("[Patient Details]");
		System.out.printf("First Name: %s", patient.getFirstName());
		System.out.println();
		System.out.printf("Last Name: %s", patient.getLastName());
		System.out.println();
		System.out.printf("Contact No: %d", patient.getContactNo());
		System.out.println();
		System.out.printf("Email Address: %s", patient.getEmail());
		System.out.println();
		System.out.printf("Appointment Date: %s", getAppDate());
		
		System.out.println();
		System.out.println();
		System.out.printf("Would you like to choose a preferred therapist? \n%s\n", getOption());
		System.out.println();
		optionChoice();

	}
	
	public void displayAppointmentSuccess()
	{
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("APPOINTMENT SUCCESSFUL");
		System.out.println("-----------------------------");
		
		System.out.println();
		System.out.printf("%s", getAppMessage());
		System.out.println();
		System.out.println();
		System.out.printf("Booking Time: %s, %s", getAppDate(), getAppTime());
		System.out.println();
		System.out.printf("Therapist: Dr. %s %s", therapist.getFirstName(), therapist.getLastName());
		
		// increaseTotal(); PART 2
	}
	
	/* PART 2
	public static void increaseTotal()
	{
		totalApp = totalApp + 1;
	}
	
	public static int getTotalApp()
	{
		return totalApp;
	}
	*/ 
	

	@Override
	public String toString() {
		return String.format("Appointment [patient=%s, appDate=%s, appTime=%s, option=%s, therapist=%s, appMessage=%s]",
				patient, appDate, appTime, option, therapist, appMessage);
	}
	
	

}
