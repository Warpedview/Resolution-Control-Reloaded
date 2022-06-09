package io.github.saco.resolutioncontrol.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.saco.resolutioncontrol.ResolutionControlMod;

@Mixin(MinecraftClient.class)
public abstract class MinecraftClientMixin {
	@Inject(method = "<init>", at = @At(value = "NEW", target = "net/minecraft/client/gl/WindowFramebuffer"))
	private void onInitFramebuffer(CallbackInfo ci) {
		ResolutionControlMod mod = ResolutionControlMod.getInstance();
		//if (mod.isScreenshotFramebufferAlwaysAllocated()) {
			//mod.initScreenshotFramebuffer();
		//}
	}
}
