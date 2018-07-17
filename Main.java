
public class Main {

	public static void main(String[] args) {
		//create a string variable and set it to your name
        String name = "Charlotte Morrison";
        
        //print out "My name is: " and use the plus sign to add your name
        System.out.print("My Name is " +  name);
        
        //print out a statement that tells how long your name is. -use variable.length()
        System.out.println("My name is " + name.length() + " letters long.");
        
        //explain what your favorite subject is and why you like it. 
        //Use the plus sign to write the statement on two lines in the code.
        System.out.println("My favorite subject in school is computer science. "
                               + "I enjoy computer science because I like programming.");
        
        //use the plus sign to share the course and concatenate a number for the period you have the class.
        System.out.println("I teach AP Computer Science A: " + 6 + "th period.");
        
        System.out.println("8 plus 5 is " + 8 + 5);
        System.out.println("8 plus 5 is " + (8 + 5));
        System.out.println(8 + 5 + " equals 8 plus 5.");

        System.out.println("The first statement treats the numbers like strings and concatenates them "
        		+ "instead of doing the math.  \nThe second statement has the numbers in parenthesis "
        		+ "so they are calculated first, then concatenated.  \nThe third statement doesn't need "
        		+ "parenthesis because the calculation is encountered and completed first.");
        
	}

}
