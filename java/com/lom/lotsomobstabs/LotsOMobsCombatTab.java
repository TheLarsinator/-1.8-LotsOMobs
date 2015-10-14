package com.lom.lotsomobstabs;


import com.lom.lotsomobsinit.LotsOMobsItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LotsOMobsCombatTab extends CreativeTabs
{
	public LotsOMobsCombatTab(int i, String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return LotsOMobsItems.HornSword;
	}
}
