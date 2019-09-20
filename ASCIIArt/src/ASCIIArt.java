/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main(String[] args) {
		System.out.println("   __");
		System.out.println(" /\"^^\\");
		System.out.println(" |\"^^^^|");
		System.out.println("   |\"^^^^/");
		System.out.println("   \\\"^^^/");
		System.out.println("   //\"^^^/");
		Head();
		Person();
		Person();
		Person();
		Person();
		System.out.println("This is a trash can that has a stink cloud at the top,");
		System.out.println("the people underneath are getting sucked from the bottom to");
		System.out.println("sacrifice themselves to the trashcan");
		System.out.print("I tried my best i promise");
	}

	public static void Face() {
		System.out.print(" ?_?");
	}

	public static void Side() {
		System.out.println("|\t|");

	}

	public static void Top() {
		System.out.println("|^^___^^|");
	}

	public static void Bot() {
		System.out.println("^^^^^^^^^");
	}

	public static void Head() {
		Top();
		Side();
		System.out.print("|");
		Face();
		Side();
		Side();
		Side();
		Bot();

	}

	public static void Person() {
		System.out.println(" O");
		System.out.println("-|-");
		System.out.println(" | ");
		System.out.println("/ \\");

	}
}
