package io.github.guyperson0.umapyoi_port.client.renderer;

import io.github.guyperson0.umapyoi_port.client.utils.CostumeHelper;
import net.minecraft.resources.ResourceLocation;
import net.tracen.umapyoi.client.renderer.AbstractSuitRenderer;

public class StartingFutureOutfitRenderer extends AbstractSuitRenderer {
    @Override
    protected ResourceLocation getModel() {
        return CostumeHelper.getResource("starting_future_outfit");
    }

    @Override
    protected ResourceLocation getTexture(boolean tanned) {
        return tanned ?
                CostumeHelper.getResource("textures/model/starting_future_outfit_tanned.png") :
                CostumeHelper.getResource("textures/model/starting_future_outfit.png");
    }

    @Override
    protected ResourceLocation getFlatModel() {
        return CostumeHelper.getResource("starting_future_outfit_flat");
    }

    @Override
    protected ResourceLocation getFlatTexture(boolean tanned) {
        return tanned ?
                CostumeHelper.getResource("textures/model/starting_future_outfit_flat_tanned.png") :
                CostumeHelper.getResource("textures/model/starting_future_outfit_flat.png");
    }
}
