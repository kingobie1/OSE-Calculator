package calc.util;

import java.awt.Color;

/**
 * Manages the colors of all GUI elements.
 * @author Obatola Seward-Evans
 *
 */
public class ColorManager {
	private static ColorManager instance = new ColorManager();
	ColorMode theme = ColorMode.LIGHT;
	
	private ColorManager() {
		
	}
	
	public static ColorManager getInstance() {
		return instance;
	}
	
	public Color getColor(ColorType type){
		Color color;
		
		switch (theme) {
			case LIGHT:
				color = getLightColor(type);
				break;
				
			case DARK:
				color = getDarkColor(type);
				break;	
	
			default:
				color = getDarkColor(type);
				break;
		}
		
		return color;
	}
	
	/* * * * LIGHT THEME * * * */
	public Color getLightColor(ColorType type){
		Color color;
		switch (type) {
			case calculateBUTTON:
				color = Color.decode("0x8f2f29");
				break;
				
			case numberBUTTON:
				color = Color.decode("0xffffff");
				break;
				
			case operationBUTTON:
				color = Color.decode("0xffffff");
				break;
				
			case BACKGROUND:
				color = Color.decode("0xffffff");
				break;
				
			case TEXT:
				color = Color.decode("0x262626");
				break;
				
			case textVIEW:
				color = Color.decode("0xffffff");
				break;
				
			case buttonPRESSED:
				color = Color.decode("0xf3f3f3");
				break;
	
			default:
				color = Color.white;
				break;
		}
		
		return color;
	}
	
	/* * * * DARK THEME * * * */
	public Color getDarkColor(ColorType type){
		Color color;
		switch (type) {
			case calculateBUTTON:
				color = Color.decode("0x8f2f29");
				break;
				
			case numberBUTTON:
				color = Color.decode("0x2b2b2b");
				break;
				
			case operationBUTTON:
				color = Color.decode("0x1e1e1e");
				break;
				
			case BACKGROUND:
				color = Color.decode("0x050505");
				break;
				
			case TEXT:
				color = Color.decode("0xede8ec");
				break;
				
			case textVIEW:
				color = Color.decode("0x050505");
				break;
				
			case buttonPRESSED:
				color = Color.BLACK;
				break;
	
			default:
				color = Color.white;
				break;
		}
		
		return color;
	}
	
	public void setTheme(ColorMode theme) {
		this.theme = theme;
	}
	
	public void alternateTheme(){
		if (this.theme == ColorMode.DARK) {
			this.theme = ColorMode.LIGHT;
		} else {
			this.theme = ColorMode.DARK;
		}
	}
	
}
