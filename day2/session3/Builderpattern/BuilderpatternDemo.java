package builderpattern;

import java.util.Scanner;
public class BuilderpatternDemo {

	public static void main(String args[]) {
	Mealbuilder mb=new Mealbuilder();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println(" vegmeal or non-vegmeal");
	String ans=sc.nextLine();
	
	if(ans.equalsIgnoreCase("vegmeal")) {
	       Meal vegmeal=mb.vegMeal();
	       System.out.println(" veg Meal");
	       vegmeal.showItems();
	       System.out.println("Total cost "+vegmeal.getCost());
	     }
	if(ans.equalsIgnoreCase("non-vegmeal")) {
	       Meal nonvegmeal=mb.nonvegMeal();
	       System.out.println("non-veg Meal");
	       nonvegmeal.showItems();
	       System.out.println("Total cost "+nonvegmeal.getCost());
	     }
	
	}
}