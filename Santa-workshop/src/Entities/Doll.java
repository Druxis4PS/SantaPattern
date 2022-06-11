package Entities;

public class Doll extends Present {
	private String Material;
	
	public Doll(String Name, String Material) {
        super(Name);
        this.Material = Material;
    }
	
	public void SetMaterial(String Material) {
        this.Material = Material;
    }
	
	public String GetMaterial() {
        return Material;
    }
}
