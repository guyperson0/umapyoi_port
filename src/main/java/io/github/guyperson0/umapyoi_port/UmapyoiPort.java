package io.github.guyperson0.umapyoi_port;

import io.github.guyperson0.umapyoi_port.items.ItemRegistry;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(UmapyoiPort.MODID)
public class UmapyoiPort
{
    public static final String MODID = "umapyoi_port";
    private static final Logger LOGGER = LogUtils.getLogger();

    public UmapyoiPort(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);

        ItemRegistry.ITEMS.register(modEventBus);
        CreativeTabPopulation.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("I'M HORSING AROUND");
    }
}
