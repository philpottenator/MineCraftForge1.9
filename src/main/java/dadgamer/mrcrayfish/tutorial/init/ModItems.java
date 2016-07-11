/* This class initializes all of the items that are being added to the game 
*intiallizing the object
*registering it Forge
*registering the render for the inventory
*/
package dadgamer.mrcrayfish.tutorial.init;

import dadgamer.mrcrayfish.tutorial.Reference;
import dadgamer.mrcrayfish.tutorial.Items.ItemCheese;
import dadgamer.mrcrayfish.tutorial.Items.ItemCracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	//The new items to be added	
	public static Item cheese;
	public static Item cracker;
	
	public static void init(){
		//initialize the new objects
		cheese = new ItemCheese();
		cracker = new ItemCracker();
	}
	
	public static void register(){
		//registers the new items in the game
		GameRegistry.register(cheese);
		GameRegistry.register(cracker);
		
	}
	
	public static void registerRenders() {
		//contains all the calls for registering the renders for each items
		registerRender(cheese);
		registerRender(cracker);
	}
	private static void registerRender(Item item) {
		//Where in the assets folder to find the items
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}

}
