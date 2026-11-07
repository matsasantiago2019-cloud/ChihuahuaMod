package com.mati.chihuahuamod.client;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WolfRenderer;
import net.minecraft.resources.ResourceLocation;
public class ChihuahuaRenderer extends WolfRenderer {
 private static final ResourceLocation TEXTURE=ResourceLocation.fromNamespaceAndPath("chihuahuamod","textures/entity/chihuahua.png");
 public ChihuahuaRenderer(EntityRendererProvider.Context context){super(context);}
}