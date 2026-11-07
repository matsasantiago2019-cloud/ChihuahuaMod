package com.mati.chihuahuamod.client;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WolfRenderer;
import net.minecraft.client.renderer.entity.state.WolfRenderState;
import net.minecraft.resources.Identifier;
public class ChihuahuaRenderer extends WolfRenderer {
 private static final Identifier TEXTURE=Identifier.fromNamespaceAndPath("chihuahuamod","textures/entity/chihuahua.png");
 public ChihuahuaRenderer(EntityRendererProvider.Context context){super(context);}
 @Override public Identifier getTextureLocation(WolfRenderState state){return TEXTURE;}
}