package src.designpattern.facotry_method._01_before;

public class Ship {
	
	private String name;
	
	private String color;
	
	private String logo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Ship{");
		sb.append("name='").append(name).append('\'');
		sb.append(", color='").append(color).append('\'');
		sb.append(", logo='").append(logo).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
