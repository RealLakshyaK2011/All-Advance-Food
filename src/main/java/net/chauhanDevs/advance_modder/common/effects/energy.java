package net.chauhanDevs.advance_modder.common.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class energy extends MobEffect {
    public energy(MobEffectCategory p_19451_, int p_19452_) {
        super(p_19451_, p_19452_);
    }

    @Override
    public void applyEffectTick(LivingEntity livingEntity, int num) {
        super.applyEffectTick(livingEntity, num);
        livingEntity.setSpeed(10f);
        livingEntity.animationSpeed = 10f;
    }

    @Override
    public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
        return true;
    }
}
