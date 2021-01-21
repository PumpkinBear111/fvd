package me.pumpkinbear111.valentinesday.items.food;

import me.pumpkinbear111.valentinesday.ValentinesDay;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class chocobox extends Item {

    public chocobox() {

        super(new Item.Properties()

                .group(ValentinesDay.TAB)
                .food(new Food.Builder()
                        .hunger(14)
                        .saturation(20.8f)
                        .build()
                )

        );

    }

}
