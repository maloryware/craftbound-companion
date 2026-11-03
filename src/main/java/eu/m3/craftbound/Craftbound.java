package eu.m3.craftbound;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(Craftbound.MODID)
public class Craftbound {
    public static final String MODID = "craftbound";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Craftbound(IEventBus modEventBus, ModContainer modContainer) {

    }
}
