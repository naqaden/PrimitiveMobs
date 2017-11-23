package net.daveyx0.primitivemobs.core;

import net.daveyx0.primitivemobs.client.renderer.entity.RenderBlazingJuggernaut;
import net.daveyx0.primitivemobs.client.renderer.entity.RenderBrainSlime;
import net.daveyx0.primitivemobs.client.renderer.entity.RenderChameleon;
import net.daveyx0.primitivemobs.client.renderer.entity.RenderEchantedBook;
import net.daveyx0.primitivemobs.client.renderer.entity.RenderFilchLizard;
import net.daveyx0.primitivemobs.client.renderer.entity.RenderGroveSprite;
import net.daveyx0.primitivemobs.client.renderer.entity.RenderHauntedTool;
import net.daveyx0.primitivemobs.client.renderer.entity.RenderLilyLurker;
import net.daveyx0.primitivemobs.client.renderer.entity.RenderPrimitiveCreeper;
import net.daveyx0.primitivemobs.client.renderer.entity.RenderPrimitiveTNTPrimed;
import net.daveyx0.primitivemobs.client.renderer.entity.RenderSkeletonWarrior;
import net.daveyx0.primitivemobs.client.renderer.entity.RenderTreasureSlime;
import net.daveyx0.primitivemobs.common.PrimitiveMobs;
import net.daveyx0.primitivemobs.config.PrimitiveMobsConfigMobs;
import net.daveyx0.primitivemobs.entity.item.EntityPrimitiveTNTPrimed;
import net.daveyx0.primitivemobs.entity.monster.EntityBlazingJuggernaut;
import net.daveyx0.primitivemobs.entity.monster.EntityBrainSlime;
import net.daveyx0.primitivemobs.entity.monster.EntityEnchantedBook;
import net.daveyx0.primitivemobs.entity.monster.EntityFestiveCreeper;
import net.daveyx0.primitivemobs.entity.monster.EntityHauntedTool;
import net.daveyx0.primitivemobs.entity.monster.EntityLilyLurker;
import net.daveyx0.primitivemobs.entity.monster.EntityRocketCreeper;
import net.daveyx0.primitivemobs.entity.monster.EntitySkeletonWarrior;
import net.daveyx0.primitivemobs.entity.monster.EntitySupportCreeper;
import net.daveyx0.primitivemobs.entity.monster.EntityTreasureSlime;
import net.daveyx0.primitivemobs.entity.passive.EntityChameleon;
import net.daveyx0.primitivemobs.entity.passive.EntityFilchLizard;
import net.daveyx0.primitivemobs.entity.passive.EntityGroveSprite;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.client.renderer.entity.RenderTNTPrimed;
import net.minecraft.entity.EntityList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class PrimitiveMobsEntities {

		public static int id;
		
	    public static void preInit()
	    {
	    	id = 0;
	    	addEntities(EntityChameleon.class, "chameleon", ++id ,0x048C00, 0x025600, PrimitiveMobsConfigMobs.enableChameleon);
	    	addEntities(EntityTreasureSlime.class, "treasure_slime", ++id , 0xFFF399, 0xFFE332, PrimitiveMobsConfigMobs.enableTreasureSlime);
	    	addEntities(EntityHauntedTool.class, "haunted_tool", ++id , 0x493615, 0x684E1E, PrimitiveMobsConfigMobs.enableHauntedTool);
	    	addEntities(EntityGroveSprite.class, "grovesprite", ++id , 0x5B4E3D, 0x62A72F, PrimitiveMobsConfigMobs.enableGroveSprite);
	    	addEntities(EntityEnchantedBook.class, "bewitched_tome", ++id , 0xB77A35, 0xD0D0D0, PrimitiveMobsConfigMobs.enableEnchantedBook);
	    	addEntities(EntityFilchLizard.class, "filch_lizard", ++id , 0xC2B694, 0xD1CDC0, PrimitiveMobsConfigMobs.enableFilchLizard);
	    	addEntities(EntityBrainSlime.class, "brain_slime", ++id , 0xC696B0, 0xD1A5BD, PrimitiveMobsConfigMobs.enableBrainSlime);
	    	addEntities(EntityRocketCreeper.class, "rocket_creeper", ++id ,0x4CA9D0, 0x000000, PrimitiveMobsConfigMobs.enableRocketCreeper);
	    	addEntities(EntityFestiveCreeper.class, "festive_creeper", ++id ,0xBC3608, 0x000000, PrimitiveMobsConfigMobs.enableFestiveCreeper);
	    	addEntities(EntitySupportCreeper.class, "support_creeper", ++id ,0xDBBD2F, 0x000000, PrimitiveMobsConfigMobs.enableSupportCreeper);
	    	addEntities(EntitySkeletonWarrior.class, "skeleton_warrior", ++id ,0xABA188, 0x6C5239, PrimitiveMobsConfigMobs.enableSkeletonWarrior);
	    	addEntities(EntityBlazingJuggernaut.class, "blazing_juggernaut", ++id ,0x30181C, 0xB0A938, PrimitiveMobsConfigMobs.enableBlazingJuggernaut);
	    	addEntities(EntityLilyLurker.class, "lily_lurker", ++id, 0x593D29, 0x3D3C1C, PrimitiveMobsConfigMobs.enableLilyLurker);
	    	
	    	addCustomEntities(EntityPrimitiveTNTPrimed.class, "primitive_tnt_primed", ++id, 64, 20, true);
	    }

	    public static void registerRenderers()
	    {
	    	RenderingRegistry.registerEntityRenderingHandler(EntityChameleon.class, RenderChameleon::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntityTreasureSlime.class, RenderTreasureSlime::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntityHauntedTool.class, RenderHauntedTool::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntityGroveSprite.class, RenderGroveSprite::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntityEnchantedBook.class, RenderEchantedBook::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntityFilchLizard.class, RenderFilchLizard::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntityBrainSlime.class, RenderBrainSlime::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntityRocketCreeper.class, RenderPrimitiveCreeper::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntityFestiveCreeper.class, RenderPrimitiveCreeper::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntitySupportCreeper.class, RenderPrimitiveCreeper::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntityPrimitiveTNTPrimed.class, RenderPrimitiveTNTPrimed::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntitySkeletonWarrior.class, RenderSkeletonWarrior::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntityBlazingJuggernaut.class, RenderBlazingJuggernaut::new);
	    	RenderingRegistry.registerEntityRenderingHandler(EntityLilyLurker.class, RenderLilyLurker::new);
	    }
	    
	    
	    private static void addEntities(Class var1, String name1,  int entityid, int bkEggColor, int fgEggColor, boolean flag)
	    {
	    	if(!flag)
	    		return;
	    	
	    	int trackingRange = 80;
	    	int updateFrequency = 3;
	    	boolean sendsVelocityUpdates = true;
	    		final ResourceLocation registryName = new ResourceLocation(PrimitiveMobsReference.MODID, name1);
			    EntityRegistry.registerModEntity(registryName, var1, name1, entityid,  PrimitiveMobs.instance, trackingRange, updateFrequency, sendsVelocityUpdates, bkEggColor, fgEggColor);
	    }
	    
	    
	    private static void addCustomEntities(Class var1, String name1,  int entityid, int track, int freq, boolean vel)
	    {
	    	int trackingRange = track;
	    	int updateFrequency = freq;
	    	boolean sendsVelocityUpdates = vel;
	    	final ResourceLocation registryName = new ResourceLocation(PrimitiveMobsReference.MODID, name1);
			    EntityRegistry.registerModEntity(registryName,var1, name1, entityid,  PrimitiveMobs.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	    }
	    
	    
	    private static void addEntities(Class var1, String name1,  int entityid)
	    {
	    	int trackingRange = 80;
	    	int updateFrequency = 3;
	    	boolean sendsVelocityUpdates = true;
	    	final ResourceLocation registryName = new ResourceLocation(PrimitiveMobsReference.MODID, name1);
			    EntityRegistry.registerModEntity(registryName,var1, name1, entityid,  PrimitiveMobs.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	    }
		 
	}