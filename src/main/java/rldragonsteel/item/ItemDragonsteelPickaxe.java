package rldragonsteel.item;

import com.github.alexthe666.iceandfire.IceAndFire;
import com.github.alexthe666.iceandfire.client.StatCollector;
import com.github.alexthe666.iceandfire.integration.CompatLoadUtil;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import rldragonsteel.core.ModItems;

import javax.annotation.Nullable;
import java.util.List;

public class ItemDragonsteelPickaxe extends ItemPickaxe implements DragonsteelHitEffect {

	public ItemDragonsteelPickaxe(ToolMaterial toolmaterial, String gameName, String name) {
		super(toolmaterial);
		this.setTranslationKey(name);
		this.setCreativeTab(IceAndFire.TAB_ITEMS);
		this.setRegistryName(IceAndFire.MODID, gameName);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		ItemStack mat = this.toolMaterial.getRepairItemStack();
		if (!mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false)) return true;
		return super.getIsRepairable(toRepair, repair);
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (this.toolMaterial == ModItems.dragonsteel_fire_tools) {
			tooltip.add(TextFormatting.GREEN + StatCollector.translateToLocal("fire_dragonsteel.hurt1"));
			tooltip.add(TextFormatting.RED + StatCollector.translateToLocal("fire_dragonsteel.hurt2"));
		} else if (this.toolMaterial == ModItems.dragonsteel_ice_tools) {
			tooltip.add(TextFormatting.GREEN + StatCollector.translateToLocal("ice_dragonsteel.hurt1"));
			tooltip.add(TextFormatting.RED + StatCollector.translateToLocal("ice_dragonsteel.hurt2"));
		} else if (this.toolMaterial == ModItems.dragonsteel_lightning_tools) {
			tooltip.add(TextFormatting.GREEN + StatCollector.translateToLocal("lightning_dragonsteel.hurt1"));
			tooltip.add(TextFormatting.RED + StatCollector.translateToLocal("lightning_dragonsteel.hurt2"));
		}
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		if(!CompatLoadUtil.isRLCombatLoaded()) this.doHitEffect(target, attacker);
		return super.hitEntity(stack, target, attacker);
	}

	@Override
	public ToolMaterial getMaterial() { return this.toolMaterial; }
}