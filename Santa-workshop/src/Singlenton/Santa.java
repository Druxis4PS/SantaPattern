package Singlenton;

import java.util.ArrayList;
import java.util.List;

import Entities.Present;

public class Santa {
	private static Santa SantaClaus;
	private final List<Present> Presents;
	
	public Santa( ) {
		this.Presents = new ArrayList<>();
	}
	
	public static void SetSanta(Santa SantaClaus) {
		Santa.SantaClaus = SantaClaus;
	}
	
	public static Santa GetSantaClaus() {
		if (SantaClaus == null) {
			return new Santa();
		}
		return SantaClaus;
	}
	
	public void AddToList(Present present) {
		if (present == null) {
			return;
		}
		Presents.add(present);
	}
}
