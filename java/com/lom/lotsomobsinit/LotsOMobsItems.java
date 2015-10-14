package com.lom.lotsomobsinit;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobscore.LotsOMobsProxy;
import com.lom.lotsomobsitems.Item3DArmor;
import com.lom.lotsomobsitems.ItemLOMFood;
import com.lom.lotsomobsitems.ItemMaterials;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LotsOMobsItems 
{
	@SidedProxy(clientSide = "com.lom.lotsomobscore.LotsOMobsClient",serverSide = "com.lom.lotsomobscore.LotsOMobsProxy")
	public static LotsOMobsProxy proxy;
	
	//Items
		public static Item DeerHide;
		public static Item Horn;
		
		public static Item Venison;
		public static Item RawVenison;
		
		public static Item HornSword;

		public static Item DeerHideHelmet;
		public static Item DeerHideChestPlate;
		public static Item DeerHideLeggings;
		public static Item DeerHideBoots;
		
		
	public static void Init()
	{
		//Materials
		DeerHide = new ItemMaterials().setUnlocalizedName("DeerHide");
		Horn = new ItemMaterials().setUnlocalizedName("Horn");
		
		//Food
		Venison = new ItemLOMFood(2, 1, true).setUnlocalizedName("Venison");
		RawVenison = new ItemLOMFood(4, 3, false).setUnlocalizedName("RawVenison");
		
		//Weapons
		HornSword = new ItemSword(LotsOMobs.EnumToolMaterialHorn).setUnlocalizedName("HornSword").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		
		//Armor
		DeerHideHelmet = new Item3DArmor(LotsOMobs.Fur, proxy.addArmor("DeerArmor"), 0).setUnlocalizedName("DeerHideHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		DeerHideChestPlate = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("DeerArmor"), 1).setUnlocalizedName("DeerHideChestPlate").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		DeerHideLeggings = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("DeerArmor"), 2).setUnlocalizedName("DeerHideLeggings").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		DeerHideBoots = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("DeerArmor"), 3).setUnlocalizedName("DeerHideBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);

		
		//Register that shit
		registerItemAndTexture(DeerHide, "DeerHide");
		registerItemAndTexture(Horn, "Horn");
		
		registerItemAndTexture(Venison, "Venison");
		registerItemAndTexture(RawVenison, "RawVenison");
		
		registerItemAndTexture(HornSword, "HornSword");
		
		registerItemAndTexture(DeerHideHelmet, "DeerHideHelmet");
		registerItemAndTexture(DeerHideChestPlate, "DeerHideChestPlate");
		registerItemAndTexture(DeerHideLeggings, "DeerHideLeggings");
		registerItemAndTexture(DeerHideBoots, "DeerHideBoots");

	}
	
	public static void registerItemAndTexture(Item item, String name)
	{
		GameRegistry.registerItem(item, name);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(LotsOMobs.modid + ":" + name, "inventory"));

	}
}
