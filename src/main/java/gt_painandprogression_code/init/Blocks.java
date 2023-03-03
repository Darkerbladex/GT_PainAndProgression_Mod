package gt_painandprogression_code.init;

import gt_painandprogression_code.init.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class Blocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
}
