package Entities;

public abstract class Present {
	private String Name;
	
	public Present(String Name) {
        this.Name = Name;
    }
	
	public void setName(String Name) {
        this.Name = Name;
	}

    public String getName() {
        return Name;
	}
}
