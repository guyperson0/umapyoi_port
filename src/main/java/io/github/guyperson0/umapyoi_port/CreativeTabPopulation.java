package io.github.guyperson0.umapyoi_port;

import io.github.guyperson0.umapyoi_port.items.ItemRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.tracen.umapyoi.UmapyoiCreativeGroup;

public class CreativeTabPopulation {

    public static void register(IEventBus eventBus) {
        eventBus.addListener(CreativeTabPopulation::populateUmapyoiTab);
    }

    private static void populateUmapyoiTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == UmapyoiCreativeGroup.UMAPYOI_ITEMS.getKey()) {
            event.accept(ItemRegistry.KINDERGARTEN_UNIFORM);
            event.accept(ItemRegistry.KASAMATSU_TRAINING_UNIFORM);
            event.accept(ItemRegistry.STARTING_FUTURE_OUTFIT);
            event.accept(ItemRegistry.PLAIN_SHIRT);
        }
    }
}
