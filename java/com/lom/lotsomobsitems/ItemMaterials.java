package com.lom.lotsomobsitems;

import com.lom.lotsomobscore.LotsOMobs;

import net.minecraft.item.Item;

public class ItemMaterials extends Item
{
    public ItemMaterials()
    {
        super();
        this.maxStackSize = 64;
        this.setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
        
    }
}