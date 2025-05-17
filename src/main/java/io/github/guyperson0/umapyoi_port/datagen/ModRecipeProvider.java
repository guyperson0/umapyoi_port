package io.github.guyperson0.umapyoi_port.datagen;

import io.github.guyperson0.umapyoi_port.items.ItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput pRecipeOut) {
        DeferredItem<Item> jewel = net.tracen.umapyoi.item.ItemRegistry.JEWEL;

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.KINDERGARTEN_UNIFORM)
                .pattern("LJL")
                .pattern("LLL")
                .pattern("BBB")
                .define('J', jewel)
                .define('L', Items.LIGHT_BLUE_WOOL)
                .define('B', Items.BLUE_WOOL)
                .unlockedBy("get_jewel", has(jewel))
                .save(pRecipeOut);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.KASAMATSU_TRAINING_UNIFORM)
                .pattern("BJB")
                .pattern("BWB")
                .pattern("BWB")
                .define('J', jewel)
                .define('B', Items.BLUE_WOOL)
                .define('W', Items.WHITE_WOOL)
                .unlockedBy("get_jewel", has(jewel))
                .save(pRecipeOut);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.STARTING_FUTURE_OUTFIT)
                .pattern("WJW")
                .pattern("PRP")
                .pattern("GWG")
                .define('J', jewel)
                .define('P', Items.PURPLE_WOOL)
                .define('R', Items.RED_WOOL)
                .define('W', Items.WHITE_WOOL)
                .define('G', Items.GOLD_NUGGET)
                .unlockedBy("get_jewel", has(jewel))
                .save(pRecipeOut);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.PLAIN_SHIRT)
                .pattern("WJW")
                .pattern("WWW")
                .pattern("WWW")
                .define('J', jewel)
                .define('W', Items.WHITE_WOOL)
                .unlockedBy("get_jewel", has(jewel))
                .save(pRecipeOut);

    }
}
