package edu.pitt.cs;

import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public interface RentACat {
	public static RentACat createInstance(InstanceType type) {
		switch (type) {
			case IMPL:
				return new RentACatImpl();
			case BUGGY:
				return new RentACatBuggy();
			case SOLUTION:
				return new RentACatSolution();
			case MOCK:
				// TODO: Return a mock object that emulates the behavior of the real object, if
				// you feel you need one.
				// Create a mock object of the RentACat interface
				RentACat mockRentACat = Mockito.mock(RentACat.class);

				// Define default behavior for the mock object
				when(mockRentACat.returnCat(anyInt())).thenReturn(false); // Default behavior for returnCat
				when(mockRentACat.rentCat(anyInt())).thenReturn(false); // Default behavior for rentCat
				when(mockRentACat.renameCat(anyInt(), anyString())).thenReturn(false); // Default behavior for renameCat
				when(mockRentACat.listCats()).thenReturn(""); // Default behavior for listCats

				// Return the mock object
				return mockRentACat;
			default:
				assert (false);
				return null;
		}
	}

	// WARNING: You are not allowed to change any part of the interface.
	// That means you cannot add any method nor modify any of these methods.

	public boolean returnCat(int id);

	public boolean rentCat(int id);

	public boolean renameCat(int id, String name);

	public String listCats();

	public void addCat(Cat c);
}
