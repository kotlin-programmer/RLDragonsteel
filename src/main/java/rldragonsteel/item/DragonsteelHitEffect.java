package rldragonsteel.item;

import com.github.alexthe666.iceandfire.api.ChainLightningUtils;
import com.github.alexthe666.iceandfire.api.IEntityEffectCapability;
import com.github.alexthe666.iceandfire.api.InFCapabilities;
import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import rldragonsteel.core.ModItems;

public interface DragonsteelHitEffect {

    Item.ToolMaterial getMaterial();

    /**
     * Handle the default weapon effects
     */
    default void doHitEffect(EntityLivingBase target, EntityLivingBase attacker) {
        if (getMaterial() == ModItems.dragonsteel_fire_tools) {
            if (target instanceof EntityIceDragon) {
                target.attackEntityFrom(DamageSource.IN_FIRE, 3.0F + getMaterial().getAttackDamage() + 13.5F);
            }
            target.setFire(5);
            target.knockBack(target, 1F, attacker.posX - target.posX, attacker.posZ - target.posZ);
        }
        else if (getMaterial() == ModItems.dragonsteel_ice_tools) {
            if (target instanceof EntityFireDragon) {
                target.attackEntityFrom(DamageSource.DROWN, 3.0F + getMaterial().getAttackDamage() + 13.5F);
            }
            if (!target.world.isRemote) {
                IEntityEffectCapability capability = InFCapabilities.getEntityEffectCapability(target);
                if (capability != null) capability.setFrozen(200);
            }
            target.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100, 2));
            target.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 100, 2));
            target.knockBack(target, 1F, attacker.posX - target.posX, attacker.posZ - target.posZ);
        }
        else if (getMaterial() == ModItems.dragonsteel_lightning_tools) {
            if (target instanceof EntityFireDragon || target instanceof EntityIceDragon) {
                target.attackEntityFrom(DamageSource.LIGHTNING_BOLT, 3.0F + getMaterial().getAttackDamage() + 6.75F);
            }
            ChainLightningUtils.createChainLightningFromTarget(target.world, target, attacker);
            target.knockBack(target, 1F, attacker.posX - target.posX, attacker.posZ - target.posZ);
        }
    }

    /**
     * Apply effects and return modifier amount for mod compat
     */
    default float getHitEffectModifier(EntityLivingBase target, EntityLivingBase attacker) {
        float mod = 0.0F;
        if (getMaterial() == ModItems.dragonsteel_fire_tools) {
            if (target instanceof EntityIceDragon) {
                mod += 13.5F;
            }
            target.setFire(5);
            target.knockBack(target, 1F, attacker.posX - target.posX, attacker.posZ - target.posZ);
        }
        else if (getMaterial() == ModItems.dragonsteel_ice_tools) {
            if (target instanceof EntityFireDragon) {
                mod += 13.5F;
            }
            if (!target.world.isRemote) {
                IEntityEffectCapability capability = InFCapabilities.getEntityEffectCapability(target);
                if (capability != null) capability.setFrozen(200);
            }
            target.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100, 2));
            target.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 100, 2));
            target.knockBack(target, 1F, attacker.posX - target.posX, attacker.posZ - target.posZ);
        }
        else if (getMaterial() == ModItems.dragonsteel_lightning_tools) {
            if (target instanceof EntityFireDragon || target instanceof EntityIceDragon) {
                mod += 6.75F;
            }
            ChainLightningUtils.createChainLightningFromTarget(target.world, target, attacker);
            target.knockBack(target, 1F, attacker.posX - target.posX, attacker.posZ - target.posZ);
        }
        return mod;
    }
}