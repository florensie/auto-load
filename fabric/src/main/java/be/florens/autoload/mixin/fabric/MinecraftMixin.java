package be.florens.autoload.mixin.fabric;

import be.florens.autoload.AutoLoad;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class MinecraftMixin {

	@Inject(method = "<init>", at = @At("TAIL"))
	private void autoLoadLevel(CallbackInfo info) {
		AutoLoad.tryLoad();
	}
}
