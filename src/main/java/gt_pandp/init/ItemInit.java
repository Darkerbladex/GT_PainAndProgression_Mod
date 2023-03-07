package gt_pandp.init;

import gt_pandp.objects.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item ANCIENT_SUSPICIOUS_RELIC;

    static {
        ANCIENT_SUSPICIOUS_RELIC = new ItemBase("ancient_suspicious_relic");
    }
}
