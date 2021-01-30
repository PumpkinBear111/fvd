package me.pumpkinbear111.valentinesday.items.food;

import me.pumpkinbear111.valentinesday.ValentinesDay;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class red_card extends Item {

    public red_card() {

        super(new Item.Properties()
                .group(ValentinesDay.TAB)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(4f)
                        .build()
                )

        );

    }

}
