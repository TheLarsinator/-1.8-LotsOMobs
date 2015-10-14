package com.lom.lotsomobsinit;

import com.lom.lotsomobscore.handler.ConfigHandler;
import com.lom.lotsomobsentity.EntityDeer;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class LotsOMobsMobs 
{
	public static void Init()
	{
		String mobid = "lom_";
		//Temporary fix for missing vanilla creature spawn:
        EntityRegistry.addSpawn(EntityCow.class, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntityPig.class, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntitySheep.class, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntityHorse.class, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.plains});


		if(ConfigHandler.DeerOn == true)
		{	
			EntityRegistry.registerGlobalEntityID(EntityDeer.class, mobid + "Deer", EntityRegistry.findGlobalUniqueEntityId(), 0x7D3B0C, 0xB37346);
		    EntityRegistry.addSpawn(EntityDeer.class, (int)ConfigHandler.DeerRate *10, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills});
		    EntityRegistry.addSpawn(EntityDeer.class, (int)ConfigHandler.DeerRate *10, 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.FOREST));
		}
	}
}
