package Factory;

import Entities.Bicycle;
import Singlenton.Santa;

public class BicycleFactory implements PresentFactory {
	
	@Override
	public void CreatePresent() {
		Santa.GetSantaClaus().AddToList(new Bicycle("Merida"));
	}
}
