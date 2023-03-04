package gt_painandprogression_code.proxy;

import gt_painandprogression_code.net.darkerbladex.gt_painandprogression.gt_painandprogression;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber
public abstract class CommonProxy {

    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(gt_painandprogression.ancient_suspicious_relic);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.@NotNull Register<Item> event) {
        event.getRegistry().registerAll(gt_painandprogression.ancient_suspicious_relic);
    }

    public abstract void registerItemRenderer(Item item, int meta, String id);
}
