package com.mati.chihuahuamod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
@Mod(ChihuahuaMod.MOD_ID)
public final class ChihuahuaMod {
 public static final String MOD_ID="chihuahuamod";
 public ChihuahuaMod(IEventBus modEventBus){
  ModEntities.register(modEventBus);
  ModItems.register(modEventBus);
 }
}