package com.lom.lotsomobsinit;

import static com.lom.lotsomobsinit.LotsOMobsItems.*;
import static com.lom.lotsomobsinit.LotsOMobsItems.HornSword;
import static com.lom.lotsomobsinit.LotsOMobsItems.RawVenison;
import static com.lom.lotsomobsinit.LotsOMobsItems.Venison;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LotsOMobsRecipes 
{
	public static void RecipeBook()
	{
		//Smelting
		 GameRegistry.addSmelting(RawVenison, new ItemStack(Venison, 1), 1.0F);
		 
		//Shaped Recipes
		 GameRegistry.addRecipe(new ItemStack(HornSword, 1), new Object [] {"#", "#", "X", Character.valueOf('#'), Horn, Character.valueOf('X'), Items.stick});
		 
		 GameRegistry.addRecipe(new ItemStack(DeerHideHelmet, 1), new Object [] {"# #", "XXX", "X X", Character.valueOf('#'), Horn, Character.valueOf('X'), DeerHide});
		 GameRegistry.addRecipe(new ItemStack(DeerHideChestPlate, 1), new Object [] {"X X", "XXX", "XXX", Character.valueOf('#'), Horn, Character.valueOf('X'), DeerHide});
		 GameRegistry.addRecipe(new ItemStack(DeerHideLeggings, 1), new Object [] {"XXX", "X X", "X X", Character.valueOf('#'), Horn, Character.valueOf('X'), DeerHide});
		 GameRegistry.addRecipe(new ItemStack(DeerHideBoots, 1), new Object [] {"X X", "X X", Character.valueOf('#'), Horn, Character.valueOf('X'), DeerHide});

	}
}
