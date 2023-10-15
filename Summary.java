
public class Summary {

	private Review reviewList;
	private Appointment appointment;
	
	public Summary()
	{
		
	}

	public Summary(Review reviewList, Appointment appointment) {
		this.reviewList = reviewList;
		this.appointment = appointment;
	}

	public Review getReviewList() {
		return reviewList;
	}

	public void setReviewList(Review reviewList) {
		this.reviewList = reviewList;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	
	public void displayFinalisedSummary()
	{
		appointment.displayAppointment();
		System.out.println();
		appointment.displayAppointmentSuccess();
		System.out.println();
		reviewList.displayReview();
	}

	@Override
	public String toString() {
		return String.format("Summary [reviewList=%s, appointment=%s]", reviewList, appointment);
	}
	
}
