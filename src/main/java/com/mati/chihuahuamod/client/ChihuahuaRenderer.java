package com.mati.chihuahuamod.client;
import com.mati.chihuahuamod.ChihuahuaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WolfRenderer;
import net.minecraft.resources.ResourceLocation;
public class ChihuahuaRenderer extends WolfRenderer {
 private static final ResourceLocation TEXTURE=ResourceLocation.fromNamespaceAndPath("minecraft","textures/entity/wolf/wolf_chestnut.png");
 public ChihuahuaRenderer(EntityRendererProvider.Context context){super(context);}
 @Override public ResourceLocation getTextureLocation(ChihuahuaEntity entity){return TEXTURE;}
}