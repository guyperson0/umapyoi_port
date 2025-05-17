package io.github.guyperson0.umapyoi_port.events.handler;

import io.github.guyperson0.umapyoi_port.client.renderer.KasamatsuTrainingUniformRenderer;
import io.github.guyperson0.umapyoi_port.client.renderer.PlainShirtCostumeRenderer;
import io.github.guyperson0.umapyoi_port.client.renderer.StartingFutureOutfitRenderer;
import io.github.guyperson0.umapyoi_port.items.ItemRegistry;
import io.github.guyperson0.umapyoi_port.client.renderer.KindergartenOutfitRenderer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

@EventBusSubscriber(value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ClientSetupEvents {

    @SubscribeEvent
    public static void setupClient(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            CuriosRendererRegistry.register(
                    ItemRegistry.KINDERGARTEN_UNIFORM.get(),
                    KindergartenOutfitRenderer::new);

            CuriosRendererRegistry.register(
                    ItemRegistry.KASAMATSU_TRAINING_UNIFORM.get(),
                    KasamatsuTrainingUniformRenderer::new);

            CuriosRendererRegistry.register(
                    ItemRegistry.STARTING_FUTURE_OUTFIT.get(),
                    StartingFutureOutfitRenderer::new);

            CuriosRendererRegistry.register(
                    ItemRegistry.PLAIN_SHIRT.get(),
                    PlainShirtCostumeRenderer::new);
        });
    }
}