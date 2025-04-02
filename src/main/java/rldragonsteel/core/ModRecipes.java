package rldragonsteel.core;

import com.github.alexthe666.iceandfire.item.IafDragonForgeRecipeRegistry;
import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.github.alexthe666.iceandfire.recipe.DragonForgeRecipe;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModRecipes {

    public static void preInit() {
        IafDragonForgeRecipeRegistry.FIRE_FORGE_RECIPES.add(new DragonForgeRecipe(new ItemStack(Items.IRON_INGOT), new ItemStack(IafItemRegistry.fire_dragon_blood), new ItemStack(ModItems.dragonsteel_fire_ingot), false));
        IafDragonForgeRecipeRegistry.ICE_FORGE_RECIPES.add(new DragonForgeRecipe(new ItemStack(Items.IRON_INGOT), new ItemStack(IafItemRegistry.ice_dragon_blood), new ItemStack(ModItems.dragonsteel_ice_ingot), false));
        IafDragonForgeRecipeRegistry.LIGHTNING_FORGE_RECIPES.add(new DragonForgeRecipe(new ItemStack(Items.IRON_INGOT), new ItemStack(IafItemRegistry.lightning_dragon_blood), new ItemStack(ModItems.dragonsteel_lightning_ingot), false));

        OreDictionary.registerOre("ingotFireDragonsteel", ModItems.dragonsteel_fire_ingot);
        OreDictionary.registerOre("blockFireDragonsteel", ModBlocks.dragonsteel_fire_block);
        OreDictionary.registerOre("ingotIceDragonsteel", ModItems.dragonsteel_ice_ingot);
        OreDictionary.registerOre("blockIceDragonsteel", ModBlocks.dragonsteel_ice_block);
        OreDictionary.registerOre("ingotLightningDragonsteel", ModItems.dragonsteel_lightning_ingot);
        OreDictionary.registerOre("blockLightningDragonsteel", ModBlocks.dragonsteel_lightning_block);

        ModItems.dragonsteel_fire_armor.setRepairItem(new ItemStack(ModItems.dragonsteel_fire_ingot));
        ModItems.dragonsteel_ice_armor.setRepairItem(new ItemStack(ModItems.dragonsteel_ice_ingot));
        ModItems.dragonsteel_lightning_armor.setRepairItem(new ItemStack(ModItems.dragonsteel_lightning_ingot));

        ModItems.dragonsteel_fire_tools.setRepairItem(new ItemStack(ModItems.dragonsteel_fire_ingot));
        ModItems.dragonsteel_ice_tools.setRepairItem(new ItemStack(ModItems.dragonsteel_ice_ingot));
        ModItems.dragonsteel_lightning_tools.setRepairItem(new ItemStack(ModItems.dragonsteel_lightning_ingot));
    }
}
