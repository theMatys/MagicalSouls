package com.thematys.magicalsouls.block;

import com.thematys.magicalsouls.block.base.MSBlock;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class MSBlockSoulAltar extends MSBlock
{
    public MSBlockSoulAltar(String name)
    {
        super(name);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setHarvestLevel("pickaxe", 0);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return new AxisAlignedBB(0.25, 0.0, 0.25, 1.0 - 0.25, 1.1875, 1.0 - 0.25);
    }
}
