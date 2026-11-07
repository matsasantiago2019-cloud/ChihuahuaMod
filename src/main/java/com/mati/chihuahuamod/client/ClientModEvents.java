package com.mati.chihuahuamod.client;
import com.mati.chihuahuamod.ChihuahuaMod;
import com.mati.chihuahuamod.ModEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(modid=ChihuahuaMod.MOD_ID,bus=Mod.EventBusSubscriber.Bus.MOD,value=Dist.CLIENT)
public final class ClientModEvents {
 private ClientModEvents(){}
 @SubscribeEvent public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){event.registerEntityRenderer(ModEntities.CHIHUAHUA.get(),ChihuahuaRenderer::new);}
}