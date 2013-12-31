package es.amadornes.openlauncher.modpack;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class Modpack {
	
	private String name;
	private BufferedImage logo;
	private boolean isPublic;
	private boolean unlocked;
	private String description = "No description available.";
	private String creator = "Unknown";
	
	public Modpack(String name, URL logo, boolean isPublic) {
		this.name = name;
		try {
			this.logo = ImageIO.read(logo);
		} catch (Exception e) {}
		this.isPublic = isPublic;
	}
	
	public String getName() {
		return name;
	}
	
	public BufferedImage getLogo() {
		return logo;
	}
	
	public boolean isPublic() {
		return isPublic;
	}
	
	public void unlock() {
		this.unlocked = true;
	}
	
	public boolean isUnlocked() {
		return unlocked;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}
	
	public String getCreator() {
		return creator;
	}
	
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
}
