package Factory;

import Entities.Doll;
import Singlenton.Santa;

public class DollFactory implements PresentFactory {
	@Override
	public void CreatePresent() {
		Santa.GetSantaClaus().AddToList(new Doll("Buyanov", "Steel"));
	}
}
