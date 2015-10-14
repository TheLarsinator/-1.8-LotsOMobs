package com.lom.lotsomobsitems;

import com.lom.lotsomobscore.LotsOMobs;

import net.minecraft.item.ItemFood;

public class ItemLOMFood extends ItemFood
{
	public ItemLOMFood(int healAmount, float saturation, boolean wolfFood)
	{
		super(healAmount, saturation, wolfFood);
		this.setCreativeTab(LotsOMobs.LotsOMobsFoodTab);
	}
}
