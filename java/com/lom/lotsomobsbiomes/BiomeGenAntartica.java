package com.lom.lotsomobsbiomes;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenAntartica extends BiomeGenBase
{
    public BiomeGenAntartica(int var1)
    {
        super(var1);
        this.setBiomeName("Antartica");
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
 

