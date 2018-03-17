import java.util.Random;

import javax.swing.JOptionPane;

public class SkilledPractice {
public static void main(String[] args) {

SkilledPractice skills = new SkilledPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String x = JOptionPane.showInputDialog("How many dimes do you have?");


int y = Integer.parseInt(x);
// Tell them how many cents they have (hint multiply by 10)

JOptionPane.showMessageDialog(null, "You have "+(y*10)+(" cents."));


// Ask the user how tall they are (inches)
String c = JOptionPane.showInputDialog("How tall are you (inches)?");


int v = Integer.parseInt(c);



// If they are shorter than 36 inches, tell them to eat their Wheaties
if(v<36) {
	JOptionPane.showMessageDialog(null, "Eat your wheaties.");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
for(int q=3;q<=30;q++) {
if(q%3==0) {	
	System.out.println(q);	
}
}
}

void skill3() { // Get a random number that is less than 20 and print it to the console 
Random r = new Random();
int r1=r.nextInt(20);
System.out.println(r1);


// Get another random number that is less than 10 and print it to the console 
int r2 = r.nextInt(10);
System.out.println(r2);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
int y = r2-r1;
JOptionPane.showMessageDialog(null, y);


}

void skill4() { // In a pop-up, ask the user for the city they live in 
String p = JOptionPane.showInputDialog("Which city do you live in?");


// If they answered "San Diego", tell them they live in Americ's Finest City 
if(p.equalsIgnoreCase("San Diego")) {
JOptionPane.showMessageDialog(null, "San Diego is the America's finest city.");
} else {
// Otherwise, tell them to move to San Diego 
JOptionPane.showMessageDialog(null, "Move to San Diego");

}

// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 


// If there is 1 car, use a pop-up to display the make/model of the car 
JOptionPane.showMessageDialog(null, "Acura");


// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



}

void skill5() { // In a pop-up, ask the user for the name of their school 

String school = JOptionPane.showInputDialog("What is the name of your school?");

// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, school + " is a fantastic school.");


}
}