package me.pumpkinbear111.valentinesday.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.HashMap;
import java.util.Map;

public class balloon extends BaseHorizontalBlock {

    public static final VoxelShape BALLOON_SHAPE = Block.makeCuboidShape(1, 0, 4, 15, 14, 12);

    public balloon() {
        super(Block.Properties.create(Material.WOOL)
                .hardnessAndResistance(.8f, .8f)
                .sound(SoundType.CLOTH)
                .notSolid());
        runCalculation(BALLOON_SHAPE);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.get(HORIZONTAL_FACING));
    }

}
