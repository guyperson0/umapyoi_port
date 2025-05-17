package io.github.guyperson0.umapyoi_port.client.utils;

import io.github.guyperson0.umapyoi_port.UmapyoiPort;
import net.minecraft.resources.ResourceLocation;

public class CostumeHelper {

    public static ResourceLocation getResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(UmapyoiPort.MODID, path);
    }

}
