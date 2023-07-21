package net.rayplaytv.rtm.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DiceItem extends Item {
    public DiceItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide && hand == InteractionHand.MAIN_HAND){
            //Output random num (1-6)
            outputRandomNumber(player);
            //Set a Cooldown
            player.getCooldowns().addCooldown(this,20);
        }
        return super.use(level, player, hand);
    }

    private void outputRandomNumber(Player player){
        player.sendSystemMessage(Component.literal("Rolled a " + getRandomNumber()));
    }

    private int getRandomNumber(){
        while (true) {
            return RandomSource.createNewThreadLocalInstance().nextInt(6) + 1;
        }
    }
}
