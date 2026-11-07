package com.mati.chihuahuamod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraft.world.entity.SpawnPlacementType;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraftforge.client.event.EntityRenderersEvent;
import com.mati.chihuahuamod.client.ChihuahuaRenderer;
@Mod(ChihuahuaMod.MOD_ID)
public final class ChihuahuaMod {
 public static final String MOD_ID="chihuahuamod";
 public ChihuahuaMod(FMLJavaModLoadingContext context){
  var bus=context.getModBusGroup();
  ModEntities.register(bus);
  ModItems.register(bus);
  EntityAttributeCreationEvent.BUS.addListener(e->e.put(ModEntities.CHIHUAHUA.get(),Wolf.createAttributes().build()));
  SpawnPlacementRegisterEvent.BUS.addListener(e->e.register(ModEntities.CHIHUAHUA.get(),SpawnPlacementType.ON_GROUND,Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, net.minecraft.world.entity.animal.Animal::checkAnimalSpawnRules,SpawnPlacementRegisterEvent.Operation.OR));
  BuildCreativeModeTabContentsEvent.BUS.addListener(e->{if(e.getTabKey()==CreativeModeTabs.SPAWN_EGGS)e.accept(ModItems.CHIHUAHUA_SPAWN_EGG);});
  EntityRenderersEvent.RegisterRenderers.BUS.addListener(e->e.registerEntityRenderer(ModEntities.CHIHUAHUA.get(),ChihuahuaRenderer::new));
 }
}