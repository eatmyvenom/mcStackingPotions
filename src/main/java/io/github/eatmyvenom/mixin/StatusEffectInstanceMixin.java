package io.github.eatmyvenom.mixin;

import net.minecraft.entity.effect.StatusEffectInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StatusEffectInstance.class)
public class StatusEffectInstanceMixin {

    @Shadow private int duration;

    @Inject(method = "upgrade", at = @At("HEAD"), cancellable = true)
    public void upgradeEffect(StatusEffectInstance that, CallbackInfoReturnable<Boolean> cir) {
        this.duration += that.getDuration();
    }
}
