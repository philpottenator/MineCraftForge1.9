package dadgamer.mrcrayfish.tutorial.Items;

import dadgamer.mrcrayfish.tutorial.Reference;

import net.minecraft.item.Item;

public class ItemCheese extends Item {

	public ItemCheese() {
		//constructor for the item
		setUnlocalizedName(Reference.TutorialItems.CHEESE.getUnlocalizedName());
		setRegistryName (Reference.TutorialItems.CHEESE.getRegistryName());
	}
}
