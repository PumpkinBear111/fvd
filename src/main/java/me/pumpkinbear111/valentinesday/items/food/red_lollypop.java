package me.pumpkinbear111.valentinesday.items.food;

import me.pumpkinbear111.valentinesday.ValentinesDay;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class red_lollypop extends Item {

    public red_lollypop() {

        super(new Item.Properties()
                .group(ValentinesDay.TAB)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(2.6f)
                        .build()
                )

        );

    }

}
