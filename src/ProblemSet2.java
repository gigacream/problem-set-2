import java.util.Scanner;

/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

public class ProblemSet2 {
	
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String firstname = in.nextLine();
		String lastname = in.nextLine();
		System.out.println("Hello, " + firstname + lastname);
	}
	
	public void gradeMe() {
		double homework = 0;
		System.out.print("Enter your 1st homework grade:");
		double homework = in.nextDouble();
		System.out.print("Enter your 2nd homework grade:");
		double homework = in.nextDouble();
		System.out.print("Enter your 3rd homework grade:");
		double homework = in.nextDouble();
		homework /= 3;
		
		double quiz = 0;
		System.out.print("Enter your 1st quiz grade:");
		double quiz = in.nextDouble();
		System.out.print("Enter your 2nd quiz grade:");
		double quiz = in.nextDouble();
		System.out.print("Enter your 3rd quiz grade:");
		double quiz = in.nextDouble();
		quiz /= 3;

		double test = 0;
		System.out.print("Enter your 1st test grade:");
		test += in.nextDouble();
		System.out.print("Enter your 2nd test grade:");
		test += in.nextDouble();
		System.out.print("Enter your 3rd test grade:");
		test += in.nextDouble();
		test /= 3;
		
		double final_grade = hmwk*0.15 + quiz*0.30 + test *0.55;
		System.out.printf("%.2f%",final_grade);
		in.close();	
	}
	
	public void groupUs() {
		System.out.println("How many students are attending the trip?");
		Scanner in = new Scanner(System.in);
		int students = in.nextInt();
		System.out.println("How many teachers are attending the trip?");
		int teachers = in.nextInt();	
	}
	
	public void info() {
		System.out.println("Enter your first and last name.");
		Scanner in = new Scanner(System.in);
		String fname = in.nextLine();
		String lname = in.nextLine();
		System.out.println("Enter your grade level.");
		int grade = in.nextInt();
		System.out.println("Enter your age.");
		int age = in.nextInt();
		String town = in.nextLine();
		System.out.println("Enter your hometown.");
		System.out.println("Name    : " + fname + " " + lname);
		System.out.println("Grade    : " + grade);
		System.out.println("Age    : " + age);
		System.out.println("Hometown    : " + town);	
	}
	
	public void initials() {
		Scanner in =new Scanner(System.in);
        System.out.print("Enter your full name:" );
        String name= in.nextLine();
        int l = name.length();
        int pos = 0;
        for(int i=l-1;i>=0;i--)
        {
            char ch=name.charAt(i);
            if(ch==' ')
            {
                pos=i;
                break;
            }
        }
        System.out.print("Your intials are: ");
        System.out.print(name.charAt(0)+".");
        for(int x=1;x<pos;x++)
        {
            char ch=name.charAt(x);
                  if(ch==' ')
            {
                                
                System.out.print(name.charAt(x+1)+".");
            }	
	}
        in.close();}}