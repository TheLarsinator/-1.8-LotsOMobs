package com.lom.lotsomobscore;

import com.lom.lotsomobsentity.EntityDeer;
import com.lom.lotsomobsmodels.ModelDeer;
import com.lom.lotsomobsmodels.armor.ModelDeerArmor;
import com.lom.lotsomobsrender.RenderDeer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class LotsOMobsClient extends LotsOMobsProxy
{
	
    private static final ModelDeerArmor DeerFurHelmet = new ModelDeerArmor(0.5F);

    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
    {
    		//Mobs
    		RenderingRegistry.registerEntityRenderingHandler(EntityDeer.class, new RenderDeer(Minecraft.getMinecraft().getRenderManager(), new ModelDeer(), 0.5F));
    }
    
    public ModelBiped getArmorModel(int id)
    {
    	switch (id) 
    	{
    		default:
    		case 0:
    			return DeerFurHelmet;
    	}
    }
}
