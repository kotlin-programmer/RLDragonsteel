package rldragonsteel;

import com.github.alexthe666.iceandfire.item.ICustomRendered;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rldragonsteel.client.model.ModelDragonsteelFireArmor;
import rldragonsteel.client.model.ModelDragonsteelIceArmor;
import rldragonsteel.client.model.ModelDragonsteelLightningArmor;
import rldragonsteel.core.ModBlocks;
import rldragonsteel.core.ModItems;

import java.lang.reflect.Field;

@Mod.EventBusSubscriber
public class ClientProxy extends CommonProxy {
	private static final ModelDragonsteelFireArmor DRAGONSTEEL_FIRE_ARMOR_MODEL = new ModelDragonsteelFireArmor(0.4F);
	private static final ModelDragonsteelFireArmor DRAGONSTEEL_FIRE_ARMOR_MODEL_LEGS = new ModelDragonsteelFireArmor(0.2F);
	private static final ModelDragonsteelIceArmor DRAGONSTEEL_ICE_ARMOR_MODEL = new ModelDragonsteelIceArmor(0.4F);
	private static final ModelDragonsteelIceArmor DRAGONSTEEL_ICE_ARMOR_MODEL_LEGS = new ModelDragonsteelIceArmor(0.2F);
	private static final ModelDragonsteelLightningArmor DRAGONSTEEL_LIGHTNING_ARMOR_MODEL = new ModelDragonsteelLightningArmor(0.4F);
	private static final ModelDragonsteelLightningArmor DRAGONSTEEL_LIGHTNING_ARMOR_MODEL_LEGS = new ModelDragonsteelLightningArmor(0.2F);

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void registerModels(ModelRegistryEvent event) {
		// Items
		try {
			for (Field f : ModItems.class.getDeclaredFields()) {
				Object obj = f.get(null);
				if (obj instanceof Item && !(obj instanceof ICustomRendered)) {
					ModelLoader.setCustomModelResourceLocation((Item)obj, 0, new ModelResourceLocation("iceandfire:" + ((Item)obj).getRegistryName().getPath(), "inventory"));
				} else if (obj instanceof Item[]) {
					for (Item item : (Item[]) obj) {
						if (!(item instanceof ICustomRendered)) {
							ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation("iceandfire:" + item.getRegistryName().getPath(), "inventory"));
						}
					}
				}
			}
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}

		// ItemBlocks
		try {
			for (Field f : ModBlocks.class.getDeclaredFields()) {
				Object obj = f.get(null);
				if (obj instanceof Block && !(obj instanceof ICustomRendered)) {
					ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock((Block)obj), 0, new ModelResourceLocation("iceandfire:" + ((Block)obj).getRegistryName().getPath(), "inventory"));
				} else if (obj instanceof Block[]) {
					for (Block block : (Block[]) obj) {
						if(!(block instanceof ICustomRendered)){
							ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("iceandfire:" + block.getRegistryName().getPath(), "inventory"));

						}
					}
				}
			}
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	@SideOnly(Side.CLIENT)
	public Object getArmorModel(int armorId) {
		switch (armorId) {
			case 0:
				return DRAGONSTEEL_FIRE_ARMOR_MODEL;
			case 1:
				return DRAGONSTEEL_FIRE_ARMOR_MODEL_LEGS;
			case 2:
				return DRAGONSTEEL_ICE_ARMOR_MODEL;
			case 3:
				return DRAGONSTEEL_ICE_ARMOR_MODEL_LEGS;
			case 4:
				return DRAGONSTEEL_LIGHTNING_ARMOR_MODEL;
			case 5:
				return DRAGONSTEEL_LIGHTNING_ARMOR_MODEL_LEGS;
		}
		return null;
	}
}
