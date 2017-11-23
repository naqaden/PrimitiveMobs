package net.daveyx0.primitivemobs.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelEmpty extends ModelBase
{
	  //fields
	    ModelRenderer Empty;
	    float f3;
	  
	  public ModelEmpty()
	  {
	    textureWidth = 64;
	    textureHeight = 32;
	    
	      Empty = new ModelRenderer(this, 0, 0);
	      Empty.addBox(0F, 0F, 0F, 0, 0, 0);
	      Empty.setRotationPoint(0F, 10F, 0F);
	      Empty.setTextureSize(64, 32);
	      Empty.mirror = true;
	      setRotation(Empty, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Empty.render(f5);
	  }
	  
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	  {
	    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	  }

	}