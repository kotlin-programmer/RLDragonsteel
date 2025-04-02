package rldragonsteel;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = RLDragonsteel.MODID)
public class RLDragonsteelConfig {

	@Config.Comment("Config Options for Misc Settings")
	@Config.Name("Misc Config")
	public static final MiscConfig MISC_SETTINGS = new MiscConfig();

	@Config.Comment("Config Options for Clientside")
	@Config.Name("Client Config")
	public static final ClientConfig CLIENT_SETTINGS = new ClientConfig();

	public static class MiscConfig {
		@Config.Comment("Default attack strength of a dragonsteel sword")
		@Config.Name("Dragonsteel Sword Base Attack Strength")
		@Config.RangeDouble(min = 5.5D, max = 21.0D)
		public double dragonsteelBaseDamage = 7.0D;

		@Config.Comment("Default armor value of dragonsteel helmets")
		@Config.Name("Dragonsteel Helmet Armor")
		@Config.RangeInt(min = 5, max = 7)
		public int dragonsteelHelmetArmor = 6;

		@Config.Comment("Default armor value of dragonsteel chestplates")
		@Config.Name("Dragonsteel Base Chestplate Armor")
		@Config.RangeInt(min = 9, max = 12)
		public int dragonsteelChestplateArmor = 11;

		@Config.Comment("Default armor value of dragonsteel leggings")
		@Config.Name("Dragonsteel Base Leggings Armor")
		@Config.RangeInt(min = 7, max = 9)
		public int dragonsteelLeggingsArmor = 8;

		@Config.Comment("Default armor value of dragonsteel boots")
		@Config.Name("Dragonsteel Base Boots Armor")
		@Config.RangeInt(min = 5, max = 6)
		public int dragonsteelBootsArmor = 6;

		@Config.Comment("Default armor toughness value of dragonsteel armor")
		@Config.Name("Dragonsteel Base Armor Toughness")
		@Config.RangeDouble(min = 2.0F, max = 6.0F)
		public double dragonsteelBaseArmorToughness = 2.5F;


		@Config.Comment("Default durability value of dragonsteel sword")
		@Config.Name("Dragonsteel Base Durability")
		@Config.RangeInt(min = 2000, max = 8000)
		public int dragonsteelBaseDurability = 2500;
	}

	public static class ClientConfig {
		@Config.Comment("Enables armor rendering fixes - to resolve overlapping armor model issues")
		@Config.Name("Enable Armor Rendering Fixes")
		public boolean fixArmorRenderingBugs = true;
	}

	@Mod.EventBusSubscriber(modid = RLDragonsteel.MODID)
	private static class EventHandler{
		@SubscribeEvent
		public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
			if(event.getModID().equals(RLDragonsteel.MODID)) {
				ConfigManager.sync(RLDragonsteel.MODID, Config.Type.INSTANCE);
			}
		}
	}
}