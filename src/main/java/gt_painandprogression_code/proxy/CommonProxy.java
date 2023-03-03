package gt_painandprogression_code.proxy;

import gt_painandprogression_code.net.darkerbladex.gt_painandprogression.gt_painandprogression;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(gt_painandprogression.ancient_suspicious_relic);
    }
}
