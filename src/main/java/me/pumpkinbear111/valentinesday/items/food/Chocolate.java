package me.pumpkinbear111.valentinesday.items.food;

import me.pumpkinbear111.valentinesday.ValentinesDay;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Chocolate extends Item {

    public Chocolate() {

        super(new Item.Properties()

                .group(ValentinesDay.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(2.4f)
                        .build()
                )

        );

    }

}
