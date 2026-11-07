package com.mati.chihuahuamod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.bus.BusGroup;
public final class ModEntities {
 private ModEntities() {}
 public static final DeferredRegister<EntityType<?>> ENTITY_TYPES=DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,ChihuahuaMod.MOD_ID);
 public static final RegistryObject<EntityType<ChihuahuaEntity>> CHIHUAHUA=ENTITY_TYPES.register("chihuahua",()->EntityType.Builder.of(ChihuahuaEntity::new,MobCategory.CREATURE).sized(0.42F,0.52F).clientTrackingRange(10).build("chihuahuamod:chihuahua"));
 public static void register(BusGroup bus){ENTITY_TYPES.register(bus);}
}