package gt_painandprogression_code.net.darkerbladex.gt_painandprogression;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomRelic extends ItemSword {
    public CustomRelic() {
        super(gt_painandprogression.ancient_suspicious_relic_material);
        this.setRegistryName("ancient_suspicious_relic");
        this.setUnlocalizedName("ancient_suspicious_relic");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
