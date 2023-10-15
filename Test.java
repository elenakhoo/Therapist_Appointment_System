
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient p1 = new Patient("[ICON]", "Susan", "Grande", "Susan123", "13/12/2005", 176342360, "susan@gmail.com", "Susan13122005!", "Spouse", "Post-depression");
		Patient p2 = new Patient("[ICON]", "George", "Hyde", "GeorgeTheBoss", "13/12/2004", 451629573, "george@gmail.com", "George13122004!", "Children", "Post-anxiety");
		Patient p3 = new Patient("[ICON]", "David", "Bent", "DavidBentzz", "13/12/2003", 123153423, "david@gmail.com", "David13122003!", "Spouse", "Post-depression");
		
		Therapist t1 = new Therapist("[ICON]", "Ben", "Clood", "Ben123", "13/12/2005", 1015952393, "ben@gmail.com", "Ben13122005!", "Addiction", "Art Therapy");
		Therapist t2 = new Therapist("[ICON]", "Jenny", "Pepper", "JennyTheGirl", "13/12/2004", 921858258, "jenny@gmail.com", "Jenny13122003!", "Divorce", "Relxation Therapy");
		Therapist t3 = new Therapist("[ICON]", "Hannah", "Montana", "HannahMontanazz", "13/12/2003", 591258159, "hannah@gmail.com", "Hannah13122004!", "Children", "Massage Therapy");
		
		Feedback f1 = new Feedback("Very lovely! I loved the service here.", p1, t1);
		Feedback f2 = new Feedback("I like it very much! I wish it offered longer sessions.", p2, t2);
		Feedback f3 = new Feedback("This didn't help me as much, but maybe it might for others.", p3, t3);
		
		Review r1 = new Review();
		
		r1.addFeedback(f1);
		r1.addFeedback(f2);
		r1.addFeedback(f3);
		
		Appointment a1 = new Appointment(p1, "17/12/2022", "2-4 PM", "Yes", t1, "You have made the appointment successfully!"); // Can also try if the option is "No", it will not give them the choice to choose their therapist.
		
		Summary s1 = new Summary(r1, a1);
		
		s1.displayFinalisedSummary(); // in reviews, it prints out the USERNAMES on the online platform, as required in the figure 4 given.

	}

}
