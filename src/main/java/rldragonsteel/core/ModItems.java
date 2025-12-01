package rldragonsteel.core;

import com.github.alexthe666.iceandfire.IceAndFire;
import com.github.alexthe666.iceandfire.item.ItemDragonArmor;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rldragonsteel.RLDragonsteelConfig;
import rldragonsteel.item.ItemDragonsteelArmor;
import rldragonsteel.item.ItemDragonsteelAxe;
import rldragonsteel.item.ItemDragonsteelHoe;
import rldragonsteel.item.ItemDragonsteelPickaxe;
import rldragonsteel.item.ItemDragonsteelShovel;
import rldragonsteel.item.ItemDragonsteelSword;
import rldragonsteel.item.ItemGeneric;

public class ModItems {
    public static ItemArmor.ArmorMaterial dragonsteel_fire_armor = EnumHelper.addArmorMaterial("Dragonsteel Fire", "iceandfire:dragonsteel_fire", (int) (0.02D * RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBaseDurability), new int[]{RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBootsArmor, RLDragonsteelConfig.MISC_SETTINGS.dragonsteelLeggingsArmor, RLDragonsteelConfig.MISC_SETTINGS.dragonsteelChestplateArmor, RLDragonsteelConfig.MISC_SETTINGS.dragonsteelHelmetArmor}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, (float) RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBaseArmorToughness);
    public static ItemArmor.ArmorMaterial dragonsteel_ice_armor = EnumHelper.addArmorMaterial("Dragonsteel Ice", "iceandfire:dragonsteel_ice", (int) (0.02D * RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBaseDurability), new int[]{RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBootsArmor, RLDragonsteelConfig.MISC_SETTINGS.dragonsteelLeggingsArmor, RLDragonsteelConfig.MISC_SETTINGS.dragonsteelChestplateArmor, RLDragonsteelConfig.MISC_SETTINGS.dragonsteelHelmetArmor}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, (float) RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBaseArmorToughness);
    public static ItemArmor.ArmorMaterial dragonsteel_lightning_armor = EnumHelper.addArmorMaterial("Dragonsteel Lightning", "iceandfire:dragonsteel_lightning", (int) (0.02D * RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBaseDurability), new int[]{RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBootsArmor, RLDragonsteelConfig.MISC_SETTINGS.dragonsteelLeggingsArmor, RLDragonsteelConfig.MISC_SETTINGS.dragonsteelChestplateArmor, RLDragonsteelConfig.MISC_SETTINGS.dragonsteelHelmetArmor}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, (float) RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBaseArmorToughness);

    public static Item.ToolMaterial dragonsteel_fire_tools = EnumHelper.addToolMaterial("DragonsteelFire", 5, RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBaseDurability, 10.0F, (float) RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBaseDamage, 10);
    public static Item.ToolMaterial dragonsteel_ice_tools = EnumHelper.addToolMaterial("DragonsteelIce", 5, RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBaseDurability, 10.0F, (float) RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBaseDamage, 10);
    public static Item.ToolMaterial dragonsteel_lightning_tools = EnumHelper.addToolMaterial("DragonsteelLightning", 5, RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBaseDurability, 10.0F, (float) RLDragonsteelConfig.MISC_SETTINGS.dragonsteelBaseDamage, 10);

    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_fire_ingot")
    public static Item dragonsteel_fire_ingot = new ItemGeneric("dragonsteel_fire_ingot", "iceandfire.dragonsteel_fire_ingot");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_fire_sword")
    public static Item dragonsteel_fire_sword = new ItemDragonsteelSword(dragonsteel_fire_tools, "dragonsteel_fire_sword", "iceandfire.dragonsteel_fire_sword");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_fire_pickaxe")
    public static Item dragonsteel_fire_pickaxe = new ItemDragonsteelPickaxe(dragonsteel_fire_tools, "dragonsteel_fire_pickaxe", "iceandfire.dragonsteel_fire_pickaxe");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_fire_axe")
    public static Item dragonsteel_fire_axe = new ItemDragonsteelAxe(dragonsteel_fire_tools, "dragonsteel_fire_axe", "iceandfire.dragonsteel_fire_axe");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_fire_shovel")
    public static Item dragonsteel_fire_shovel = new ItemDragonsteelShovel(dragonsteel_fire_tools, "dragonsteel_fire_shovel", "iceandfire.dragonsteel_fire_shovel");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_fire_hoe")
    public static Item dragonsteel_fire_hoe = new ItemDragonsteelHoe(dragonsteel_fire_tools, "dragonsteel_fire_hoe", "iceandfire.dragonsteel_fire_hoe");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_fire_helmet")
    public static Item dragonsteel_fire_helmet = new ItemDragonsteelArmor(dragonsteel_fire_armor, 0, EntityEquipmentSlot.HEAD, "dragonsteel_fire_helmet", "iceandfire.dragonsteel_fire_helmet");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_fire_chestplate")
    public static Item dragonsteel_fire_chestplate = new ItemDragonsteelArmor(dragonsteel_fire_armor, 1, EntityEquipmentSlot.CHEST, "dragonsteel_fire_chestplate", "iceandfire.dragonsteel_fire_chestplate");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_fire_leggings")
    public static Item dragonsteel_fire_leggings = new ItemDragonsteelArmor(dragonsteel_fire_armor, 2, EntityEquipmentSlot.LEGS, "dragonsteel_fire_leggings", "iceandfire.dragonsteel_fire_leggings");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_fire_boots")
    public static Item dragonsteel_fire_boots = new ItemDragonsteelArmor(dragonsteel_fire_armor, 3, EntityEquipmentSlot.FEET, "dragonsteel_fire_boots", "iceandfire.dragonsteel_fire_boots");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_ice_ingot")
    public static Item dragonsteel_ice_ingot = new ItemGeneric("dragonsteel_ice_ingot", "iceandfire.dragonsteel_ice_ingot");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_ice_sword")
    public static Item dragonsteel_ice_sword = new ItemDragonsteelSword(dragonsteel_ice_tools, "dragonsteel_ice_sword", "iceandfire.dragonsteel_ice_sword");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_ice_pickaxe")
    public static Item dragonsteel_ice_pickaxe = new ItemDragonsteelPickaxe(dragonsteel_ice_tools, "dragonsteel_ice_pickaxe", "iceandfire.dragonsteel_ice_pickaxe");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_ice_axe")
    public static Item dragonsteel_ice_axe = new ItemDragonsteelAxe(dragonsteel_ice_tools, "dragonsteel_ice_axe", "iceandfire.dragonsteel_ice_axe");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_ice_shovel")
    public static Item dragonsteel_ice_shovel = new ItemDragonsteelShovel(dragonsteel_ice_tools, "dragonsteel_ice_shovel", "iceandfire.dragonsteel_ice_shovel");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_ice_hoe")
    public static Item dragonsteel_ice_hoe = new ItemDragonsteelHoe(dragonsteel_ice_tools, "dragonsteel_ice_hoe", "iceandfire.dragonsteel_ice_hoe");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_ice_helmet")
    public static Item dragonsteel_ice_helmet = new ItemDragonsteelArmor(dragonsteel_ice_armor, 0, EntityEquipmentSlot.HEAD, "dragonsteel_ice_helmet", "iceandfire.dragonsteel_ice_helmet");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_ice_chestplate")
    public static Item dragonsteel_ice_chestplate = new ItemDragonsteelArmor(dragonsteel_ice_armor, 1, EntityEquipmentSlot.CHEST, "dragonsteel_ice_chestplate", "iceandfire.dragonsteel_ice_chestplate");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_ice_leggings")
    public static Item dragonsteel_ice_leggings = new ItemDragonsteelArmor(dragonsteel_ice_armor, 2, EntityEquipmentSlot.LEGS, "dragonsteel_ice_leggings", "iceandfire.dragonsteel_ice_leggings");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_ice_boots")
    public static Item dragonsteel_ice_boots = new ItemDragonsteelArmor(dragonsteel_ice_armor, 3, EntityEquipmentSlot.FEET, "dragonsteel_ice_boots", "iceandfire.dragonsteel_ice_boots");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_lightning_ingot")
    public static Item dragonsteel_lightning_ingot = new ItemGeneric("dragonsteel_lightning_ingot", "iceandfire.dragonsteel_lightning_ingot");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_lightning_sword")
    public static Item dragonsteel_lightning_sword = new ItemDragonsteelSword(dragonsteel_lightning_tools, "dragonsteel_lightning_sword", "iceandfire.dragonsteel_lightning_sword");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_lightning_pickaxe")
    public static Item dragonsteel_lightning_pickaxe = new ItemDragonsteelPickaxe(dragonsteel_lightning_tools, "dragonsteel_lightning_pickaxe", "iceandfire.dragonsteel_lightning_pickaxe");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_lightning_axe")
    public static Item dragonsteel_lightning_axe = new ItemDragonsteelAxe(dragonsteel_lightning_tools, "dragonsteel_lightning_axe", "iceandfire.dragonsteel_lightning_axe");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_lightning_shovel")
    public static Item dragonsteel_lightning_shovel = new ItemDragonsteelShovel(dragonsteel_lightning_tools, "dragonsteel_lightning_shovel", "iceandfire.dragonsteel_lightning_shovel");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_lightning_hoe")
    public static Item dragonsteel_lightning_hoe = new ItemDragonsteelHoe(dragonsteel_lightning_tools, "dragonsteel_lightning_hoe", "iceandfire.dragonsteel_lightning_hoe");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_lightning_helmet")
    public static Item dragonsteel_lightning_helmet = new ItemDragonsteelArmor(dragonsteel_lightning_armor, 0, EntityEquipmentSlot.HEAD, "dragonsteel_lightning_helmet", "iceandfire.dragonsteel_lightning_helmet");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_lightning_chestplate")
    public static Item dragonsteel_lightning_chestplate = new ItemDragonsteelArmor(dragonsteel_lightning_armor, 1, EntityEquipmentSlot.CHEST, "dragonsteel_lightning_chestplate", "iceandfire.dragonsteel_lightning_chestplate");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_lightning_leggings")
    public static Item dragonsteel_lightning_leggings = new ItemDragonsteelArmor(dragonsteel_lightning_armor, 2, EntityEquipmentSlot.LEGS, "dragonsteel_lightning_leggings", "iceandfire.dragonsteel_lightning_leggings");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonsteel_lightning_boots")
    public static Item dragonsteel_lightning_boots = new ItemDragonsteelArmor(dragonsteel_lightning_armor, 3, EntityEquipmentSlot.FEET, "dragonsteel_lightning_boots", "iceandfire.dragonsteel_lightning_boots");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonarmor_dragonsteel_fire")
    public static Item dragon_armor_dragonsteel_fire = new ItemDragonArmor(ItemDragonArmor.DragonArmorType.FIRE_DRAGONSTEEL, "dragonarmor_dragonsteel_fire");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonarmor_dragonsteel_ice")
    public static Item dragon_armor_dragonsteel_ice = new ItemDragonArmor(ItemDragonArmor.DragonArmorType.ICE_DRAGONSTEEL, "dragonarmor_dragonsteel_ice");
    @GameRegistry.ObjectHolder(IceAndFire.MODID + ":dragonarmor_dragonsteel_lightning")
    public static Item dragon_armor_dragonsteel_lightning = new ItemDragonArmor(ItemDragonArmor.DragonArmorType.LIGHTNING_DRAGONSTEEL, "dragonarmor_dragonsteel_lightning");
}