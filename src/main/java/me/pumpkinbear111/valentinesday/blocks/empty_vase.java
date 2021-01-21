package me.pumpkinbear111.valentinesday.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class empty_vase extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public empty_vase() {
        super(Block.Properties.create(Material.GLASS)
                .hardnessAndResistance(.8f, .8f)
                .sound(SoundType.GLASS)
                .notSolid());

    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_N;
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(5, 4, 7, 6, 8, 9),
            Block.makeCuboidShape(7, 4, 10, 9, 8, 11),
            Block.makeCuboidShape(7, 4, 5, 9, 8, 6),
            Block.makeCuboidShape(10, 4, 7, 11, 8, 9),
            Block.makeCuboidShape(9, 3, 9, 10, 8, 10),
            Block.makeCuboidShape(9, 3, 6, 10, 8, 7),
            Block.makeCuboidShape(6, 3, 6, 7, 8, 7),
            Block.makeCuboidShape(6, 3, 9, 7, 8, 10),
            Block.makeCuboidShape(7, 1, 6, 9, 4, 7),
            Block.makeCuboidShape(7, 1, 9, 9, 4, 10),
            Block.makeCuboidShape(9, 1, 7, 10, 4, 9),
            Block.makeCuboidShape(6, 1, 7, 7, 4, 9),
            Block.makeCuboidShape(7, 0, 7, 9, 1, 9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

}
