package logicalstatements;

import java.util.Scanner;

public class Nukari {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO THE NUKARI PORTAL ");
		System.out.println("ENTER THE USER TYPE:Job Seeker or Recruiter");
		String userType = sc.nextLine();
		if (userType.equalsIgnoreCase("job seeker") || userType.equalsIgnoreCase("jobseeker")
				|| userType.equalsIgnoreCase("Job seeker")) {
			System.out.println("ENTER FRESHER OR EXPEREINCED");
			String fresher = sc.nextLine();
			if (fresher.equalsIgnoreCase("fresher")) {
				System.out.println("ENTER YOUR QUALIFICATION DETAILS: btech or mca");
				String qualifications = sc.nextLine();
				if (qualifications.equalsIgnoreCase("btech")) {
					System.out.println("ENTER YOUR CLG NAME:");
					String clgname = sc.nextLine();
					System.out.println("ENTER YOUR PERCENTAGE:");
					int per = sc.nextInt();
					sc.nextLine();
					System.out.println("HAVE YOU DONE ANY CERTIFICATION COURSES");
					String certi = sc.nextLine();
					if (certi.equalsIgnoreCase("yes")) {
						System.out.println("UPLOAD YOUR CERTIFICATES");
					} else if (certi.equalsIgnoreCase("no")) {
						System.out.println(
								"NO PROBLEM CERTIFICATION COURSE IS NOT MANDATORY IT DOES NOT EFFECT ON RECRUTING YOU ITS JUST AN POSTIVITE POINT TO THE RECUTER");
					}
					System.out.println("UPLOAD YOUR RESUME");
					System.out.println(
							"THANKYOU FOR ENROLLING THE NUKARI, THE TEAM WILL REACH YOU WHEN WE GET ANY MATCH WITH YOUR RESUME ");
				} else if (qualifications.equalsIgnoreCase("mca")) {
					System.out.println("ENTER YOUR CLG NAME:");
					String clgname = sc.nextLine();
					System.out.println("ENTER YOUR PERCENTAGE:");
					int per = sc.nextInt();
					sc.nextLine();
					System.out.println("HAVE YOU DONE ANY CERTIFICATION COURSES");
					String certi = sc.nextLine();
					if (certi.equalsIgnoreCase("yes")) {
						System.out.println("UPLOAD YOUR CERTIFICATES");
					} else if (certi.equalsIgnoreCase("no")) {
						System.out.println(
								"NO PROBLEM CERTIFICATION COURSE IS NOT MANDATORY IT DOES NOT EFFECT ON RECRUTING YOU ITS JUST AN POSTIVITE POINT TO THE RECUTER");
					}
					System.out.println("UPLOAD YOUR RESUME");
					System.out.println(
							"THANKYOU FOR ENROLLING THE NUKARI, THE TEAM WILL REACH YOU WHEN WE GET ANY MATCH WITH YOUR RESUME ");
				}
			} else if (fresher.equalsIgnoreCase("experienced")) {
//			 Company Name
//			 Job Role
//			 Required Experience
				System.out.println("ENTER THE COMPANY NAME YOU ARE WORKING RIGHT NOW");
				String companyName = sc.nextLine();
				System.out.println("ENTER THE ROLE YOU ARE WORKING ON");
				String jobRole = sc.nextLine();
				System.out.println("ENTER THE YEAR OF EXPERIENCE");
				int years = sc.nextInt();
				sc.nextLine();
				System.out.println("UPLOAD YOUR RESUME");
				System.out.println(
						"THANKYOU FOR ENROLLING THE NUKARI, THE TEAM WILL REACH YOU WHEN WE GET ANY MATCH WITH YOUR RESUME ");

			}
		} else if (userType.equalsIgnoreCase("Recruiter") || userType.equalsIgnoreCase("recruiter")) {
			System.out.println("ENTER YOUR COMPANY NAME");
			String companyName = sc.nextLine();
			System.out.println("ENTER THE ROLE YOU WANT TO RECRUIT");
			String role = sc.nextLine();
			System.out.println("WHAT ARE THE QUALIFICATIONS SHOULD THE CANDIDATE HAVE");
			String qualifications = sc.nextLine();
			System.out.println("WHAT ARE THE SKILLS SHOULD CANDIDATE HAVE");
			String skill = sc.nextLine();
			System.out.println("WHAT IS YOUR LOCATION");
			String loc = sc.nextLine();
			System.out.println("WHAT IS THE PACKAGE FOR THE ROLE");
			int pack = sc.nextInt();
			sc.nextLine();
			System.out.println(
					"THANK YOU FOR REACHING THE NUKARI PORTAL, THE TEAM WILL FORWARD THE CANDIDATE RESUMES WHICH WILL MATCH YOUR REQURIED SPECIFICATIONS");

		}

	}

}
