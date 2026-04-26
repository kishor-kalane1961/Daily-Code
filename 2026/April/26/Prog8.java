import java.io.*;
class Movie{
	String title;
	String director;
	double rating;

	void setDetails(String t, String d, double r){
		title = t;
		director = d;
		rating = r;
	}
	void displayDetails(){
		System.out.println("\nDisplay movie details: ");
		System.out.println("Title of Movie: "+title);
		System.out.println("Director of Movie: "+director);
		System.out.println("Rating of Movie: "+rating);
	}
	static void checkHit(double rating){
		if(rating>=7){
			System.out.println("Hit Movie");
		}else{	
			System.out.println("Average Movie");
		} 
	}

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("Enter Title of movie: ");
		String t = br.readLine();
		System.out.print("Enter Director name of movie: ");
		String d = br.readLine();
		System.out.print("Enter rating of movie: ");
		double r = Double.parseDouble(br.readLine());

		Movie m = new Movie();
		m.setDetails(t,d,r);
		m.displayDetails();
		checkHit(r);
	
	}
}
