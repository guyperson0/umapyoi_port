package io.github.guyperson0.umapyoi_port.client.renderer;

import io.github.guyperson0.umapyoi_port.client.utils.CostumeHelper;
import net.minecraft.resources.ResourceLocation;
import net.tracen.umapyoi.client.renderer.AbstractSuitRenderer;

public class PlainShirtCostumeRenderer extends AbstractSuitRenderer {

    @Override
    protected ResourceLocation getModel() {
        return CostumeHelper.getResource("plain_shirt");
    }

    @Override
    protected ResourceLocation getTexture(boolean tanned) {
        return tanned ?
                CostumeHelper.getResource("textures/model/plain_shirt_tanned.png") :
                CostumeHelper.getResource("textures/model/plain_shirt.png");
    }

    @Override
    protected ResourceLocation getFlatModel() {
        return this.getModel();
    }

    @Override
    protected ResourceLocation getFlatTexture(boolean tanned) {
        return this.getTexture(tanned);
    }
}
