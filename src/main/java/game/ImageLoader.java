package game;

import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

import javax.imageio.ImageIO;

public class ImageLoader 
{
	private Map<String, Image> imageBank;	//declares a map to hold images
	private static ImageLoader instance;
	/**
	 *  Constructor to initialize imageBank variable
	 *  
	 * @param null
	 */
	private ImageLoader()
	{
		imageBank = new TreeMap<String, Image>();	// creates a treeMap
	}
	
	/**
	 * 
	 * 
	 * @param null
	 * @return image loader
	 */
	static ImageLoader getLoader()
	{	
		if(instance == null)
			instance = new ImageLoader();
		return instance;	// gets the image loader object
	}
	
	/**
	 * 
	 * @param pic
	 * @return Image
	 */
	public Image getImage(String pic)
	{	
		// Prevents and image from being loaded twice
		if (imageBank.containsKey(pic))	// if image is already in the map	
			return imageBank.get(pic) ;	// return that image
		else
		{
			try (InputStream imageStream = getClass()
				.getClassLoader()
				.getResourceAsStream(pic)
			) {
        if (imageStream == null) {
          throw new IllegalStateException("Image introuvable : resources/"+pic) ;
				}

        Image img = ImageIO.read(imageStream) ;
        imageBank.put(pic, img) ;
        return img ;
			} catch (IOException e) {
				throw new RuntimeException("Erreur lors du chargement de " + pic, e) ;
			}
		}
	}
}