package io.github.guyperson0.umapyoi_port.client.renderer;

import io.github.guyperson0.umapyoi_port.client.utils.CostumeHelper;
import net.minecraft.resources.ResourceLocation;
import net.tracen.umapyoi.client.renderer.AbstractSuitRenderer;

public class KindergartenOutfitRenderer extends AbstractSuitRenderer {

    @Override
    protected ResourceLocation getModel() {
        return CostumeHelper.getResource("kindergarten_uniform");
    }

    @Override
    protected ResourceLocation getTexture(boolean tanned) {
        return tanned ?
                CostumeHelper.getResource("textures/model/kindergarten_uniform_tanned.png") :
                CostumeHelper.getResource("textures/model/kindergarten_uniform.png");
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
