package com.mati.chihuahuamod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.level.Level;
/** Small companion using vanilla wolf taming, sitting, following, breeding and collar behavior. */
public class ChihuahuaEntity extends Wolf {
 public ChihuahuaEntity(EntityType<? extends Wolf> type, Level level){super(type,level);}
}