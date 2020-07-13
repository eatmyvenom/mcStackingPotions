package io.github.eatmyvenom.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PotionItem.class)
public class ExampleMixin {
	/**
	 * @author me
	 * @reason because
	 */
	@Overwrite
	public int getMaxUseTime(ItemStack stack) {
		return 2;
	}
}
