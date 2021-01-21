package me.pumpkinbear111.valentinesday.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import java.util.stream.Stream;

public class balloon_string extends Block {

    public balloon_string() {
        super(Block.Properties.create(Material.WOOL)
                .sound(SoundType.CLOTH)
                .setAir()
                .zeroHardnessAndResistance()
                .notSolid());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_N;
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

}
