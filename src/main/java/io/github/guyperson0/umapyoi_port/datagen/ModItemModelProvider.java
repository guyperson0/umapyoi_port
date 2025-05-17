package io.github.guyperson0.umapyoi_port.datagen;

import io.github.guyperson0.umapyoi_port.UmapyoiPort;
import io.github.guyperson0.umapyoi_port.items.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput out, ExistingFileHelper fileHelper) {
        super(out, UmapyoiPort.MODID, fileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ItemRegistry.KINDERGARTEN_UNIFORM.get());
        basicItem(ItemRegistry.KASAMATSU_TRAINING_UNIFORM.get());
        basicItem(ItemRegistry.STARTING_FUTURE_OUTFIT.get());
        basicItem(ItemRegistry.PLAIN_SHIRT.get());
    }
}
