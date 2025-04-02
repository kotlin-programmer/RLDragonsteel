package rldragonsteel.integration;

import bettercombat.mod.event.RLCombatModifyDamageEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import rldragonsteel.item.DragonsteelHitEffect;

public class RLCombatCompat {

    @SubscribeEvent
    public static void modifyAttackDamagePre(RLCombatModifyDamageEvent.Pre event) {
        EntityPlayer player = event.getEntityPlayer();
        Entity target = event.getTarget();
        if (player == null || !(target instanceof EntityLivingBase) || event.getStack().isEmpty()) return;

        Item item = event.getStack().getItem();
        if (item instanceof DragonsteelHitEffect) {
            event.setDamageModifier(event.getDamageModifier() + ((DragonsteelHitEffect) item).getHitEffectModifier((EntityLivingBase)target, player));
        }
    }
}