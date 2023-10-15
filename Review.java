import java.util.ArrayList;

public class Review {
	
	private ArrayList<Feedback> feedbackList = new ArrayList<>();
	
	public Review()
	{
		
	}

	public Review(ArrayList<Feedback> feedbackList) {
		this.feedbackList = feedbackList;
	}

	public ArrayList<Feedback> getFeedbackList() {
		return feedbackList;
	}

	public void setFeedbackList(ArrayList<Feedback> feedbackList) {
		this.feedbackList = feedbackList;
	}
	
	public void addFeedback(Feedback feedback)
	{
		feedbackList.add(feedback);
	}
	
	public void deleteFeedback(Feedback feedback)
	{
		feedbackList.remove(feedback);
	}
	
	public void displayReview()
	{
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("REVIEWS");
		System.out.println("-----------------------------");
		
		for (Feedback f: feedbackList)
		{
			System.out.println();
			f.displayPatientName();
			System.out.println();
			System.out.printf("Feedback: %s", f.getFeedback());
			System.out.println();
			f.displayTherapistName();
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return String.format("Review [feedbackList=%s]", feedbackList);
	}

}
