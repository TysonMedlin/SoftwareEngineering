/*
 * InTransitState is a State that provides appropriate output as to inform of the current state.
 * 
 * @author	Tyson J. Medlin		
 * @date 11/19/2019
 * 	
 */
package csce247.assignments.state;

public class InTransitState implements State{
	private Package pkg;
	/* The constructor of this State sets its given package to the package to be referenced to.
	 * @param a package
	 * @returns none
	 */
	public InTransitState(Package Pkg)
	{
		pkg = Pkg;
	}
	/* displays the most current status of the package.
	 * @param none
	 * @returns none
	 */
	public void displayStatus()
	{
		System.out.println(pkg.getName() + " is out for delivery");
	}
	/* displays the most current estimated time of arrival of the package.
	 * @param none
	 * @returns none
	 */
	public void displayETA()
	{
		System.out.println(pkg.getName() + " should arrive within 5 days");
	}
}
