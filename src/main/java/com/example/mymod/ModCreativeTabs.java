package com.example.mymod;

import java.util.function.Supplier;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyMod.MODID);

    public static final Supplier<CreativeModeTab> MAIN = TABS.register("main", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mymod"))
                    .icon(() -> ModItems.RUBY.get().getDefaultInstance())
                    .displayItems((params, output) -> {
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.RUBY_BLOCK_ITEM.get());
                    })
                    .build());
}
