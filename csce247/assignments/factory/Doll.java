/*
 * The Doll class is a type of Toy that overrides the assemble method found in Toy, and sets the Toy name to Doll.
 *  
 * @author	Tyson J. Medlin		
 * @version 1.0
 * @date 09/19/2019
 * 	
 */
package csce247.assignments.factory;
//The Doll class is a object of type Toy. The Doll extends the standards of Toy.
public class Doll extends Toy{
	//When Doll is initialized, the name of this Toy is set to Doll
	public Doll() {
		name = "Doll";
	}
	//The Toy-base method assemble is overridden to add the functionality of more printed text-based statements to the user.
	public void assemble() {
		super.assemble();
		System.out.println("Connect all pieces");
		System.out.println("Paint the face");
		System.out.println("Add the dress");
		System.out.println("Add the shoes");
	}
	
}
