package rldragonsteel.core;

import com.github.alexthe666.iceandfire.IceAndFire;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rldragonsteel.block.BlockGeneric;

public class ModBlocks {
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_fire_block")
    public static Block dragonsteel_fire_block = new BlockGeneric(Material.IRON, "dragonsteel_fire_block", "iceandfire.dragonsteel_fire_block", "pickaxe", 3, 10.0F, 1000.0F, SoundType.METAL);
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_ice_block")
    public static Block dragonsteel_ice_block = new BlockGeneric(Material.IRON, "dragonsteel_ice_block", "iceandfire.dragonsteel_ice_block", "pickaxe", 3, 10.0F, 1000.0F, SoundType.METAL);
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_lightning_block")
    public static Block dragonsteel_lightning_block = new BlockGeneric(Material.IRON, "dragonsteel_lightning_block", "iceandfire.dragonsteel_lightning_block", "pickaxe", 3, 10.0F, 1000.0F, SoundType.METAL);
}