package com.scouter.netherdepthsupgrade.entity.entities;

import com.scouter.netherdepthsupgrade.entity.AbstractLavaFish;
import com.scouter.netherdepthsupgrade.items.NDUItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimationTickable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class EyeballfishEntity extends AbstractLavaFish implements IAnimatable, IAnimationTickable {

    private AnimationFactory factory = new AnimationFactory(this);

    public EyeballfishEntity(EntityType<? extends AbstractLavaFish> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier setAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 8.0D)
                //.add(Attributes.MOVEMENT_SPEED, 3.0D)
                .build();
    }
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("eyeball.move", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        AnimationController<EyeballfishEntity> controller = new AnimationController<>(this, "controller",0, this::predicate);
        data.addAnimationController(controller);
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }

    @Override
    public int tickTimer() {
        return tickCount;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.SLIME_SQUISH;
    }

    protected SoundEvent getDeathSound() {
        return null;
    }

    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.SLIME_SQUISH_SMALL;
    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.SLIME_SQUISH;
    }

    @Override
    public ItemStack getBucketItemStack() {
        return new ItemStack(NDUItems.EYEBALL_FISH_BUCKET.get());
    }
}
