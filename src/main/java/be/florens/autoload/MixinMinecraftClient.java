package be.florens.autoload;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import net.minecraft.world.level.storage.LevelStorage;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public abstract class MixinMinecraftClient {

	@Shadow @Final private LevelStorage levelStorage;

	@Shadow public abstract void startIntegratedServer(String worldName);

	@Inject(method = "<init>", at = @At("TAIL"))
	private void autoLoadLevel(RunArgs runArgs, CallbackInfo info) {
		if (levelStorage.levelExists("autoload")) startIntegratedServer("autoload");
	}
}
