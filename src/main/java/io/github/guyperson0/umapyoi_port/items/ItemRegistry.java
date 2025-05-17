package io.github.guyperson0.umapyoi_port.items;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tracen.umapyoi.item.UmaSuitItem;

import static io.github.guyperson0.umapyoi_port.UmapyoiPort.MODID;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> KINDERGARTEN_UNIFORM = ITEMS.register(
            "kindergarten_uniform",
            UmaSuitItem::new);

    public static final DeferredItem<Item> KASAMATSU_TRAINING_UNIFORM = ITEMS.register(
            "kasamatsu_training_uniform",
            UmaSuitItem::new);

    public static final DeferredItem<Item> STARTING_FUTURE_OUTFIT = ITEMS.register(
            "starting_future_outfit",
            UmaSuitItem::new);

    public static final DeferredItem<Item> PLAIN_SHIRT = ITEMS.register(
            "plain_shirt",
            UmaSuitItem::new);



    public static Item.Properties discItemProperties(ResourceKey<JukeboxSong> key) {
        return new Item.Properties().jukeboxPlayable(key).stacksTo(1);
    }
}
