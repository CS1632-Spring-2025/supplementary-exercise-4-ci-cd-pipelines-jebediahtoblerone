package edu.pitt.cs;

public class CatImpl implements Cat { //new cat

	// TODO: Fill in with member variables

	private int id;       // Unique identifier for the cat
    private String name;  // Name of the cat
    private boolean rented; // Indicates if the cat is rented


	public CatImpl(int id, String name) {
		// TODO: Fill in

		this.id = id;
		this.name = name;
		this.rented = false;

	}

	public void rentCat() {
		// TODO: Fill in

		this.rented= true;
	}

	public void returnCat() {
		// TODO: Fill in

		this.rented= false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		this.name = name;

	}

	public String getName() {
		// TODO: Fill in
		return this.name;
	}

	public int getId() {
		// TODO: Fill in
		return this.id;
	}

	public boolean getRented() {
		// TODO: Fill in
		return this.rented;
	}

	public String toString() {
		// TODO: Fill in
		return "ID " +this.id +". "+ this.name;
	}
	/**
	 * Test case for int renameCat().
	 * 
	 * <pre>
	 * Preconditions: c has been created with ID 1, and name "Jennyanydots".
	 * Execution steps: Call c.renameCat("Garfield").
	 * Postconditions: Return value of c.getName() is "Garfield".
	 *                 Return value of c.toString() is "ID 1. Garfield".
	 * </pre>
	 */

}