package rldragonsteel.block;

import com.github.alexthe666.iceandfire.IceAndFire;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import rldragonsteel.core.ModBlocks;

public class BlockGeneric extends Block {

	public BlockGeneric(Material materialIn, String gameName, String name, String toolUsed, int toolStrength, float hardness, float resistance, SoundType sound) {
		super(materialIn);
		this.setTranslationKey(name);
		this.setHarvestLevel(toolUsed, toolStrength);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setSoundType(sound);
		this.setCreativeTab(IceAndFire.TAB_BLOCKS);
		this.setRegistryName(IceAndFire.MODID, gameName);
	}

	@Override
	public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
		return this == ModBlocks.dragonsteel_fire_block
				|| this == ModBlocks.dragonsteel_ice_block
				|| this == ModBlocks.dragonsteel_lightning_block;
	}
}
