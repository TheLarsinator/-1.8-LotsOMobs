package com.lom.lotsomobsbiomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenIcePlains extends BiomeGenBase
{
    public BiomeGenIcePlains(int var1)
    {
        super(var1);
        this.setBiomeName("IceAgePlains");
        this.waterColorMultiplier = -13395457;
        this.setHeight(height_MidHills);
        this.spawnableCreatureList.clear();
        this.topBlock = Blocks.snow.getDefaultState();
        this.fillerBlock = Blocks.packed_ice.getDefaultState();
        this.getEnableSnow();
        this.setTemperatureRainfall(0.1F, 17F);       
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
    }

        
    }   
 

