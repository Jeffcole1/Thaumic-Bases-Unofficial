package com.rumaruka.tb.init;

import com.rumaruka.tb.utils.RecipeUtils;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.blocks.BlocksTC;
import thaumcraft.api.items.ItemsTC;
import thaumcraft.common.items.curios.ItemCurio;

import java.util.Hashtable;

public class TBRecipe {

    @SuppressWarnings("unused")
    public static void setup(){


        RecipeUtils.addShapelessOreRecipe(new ItemStack(TBBlocks.quicksilverblock), new Object[]{
                "quicksilver","quicksilver","quicksilver",
                "quicksilver", "quicksilver","quicksilver",
                "quicksilver","quicksilver","quicksilver"
        });
        RecipeUtils.addShapelessOreRecipe(new ItemStack(ItemsTC.quicksilver,9,0), new Object[]{"blockQuicksilver"});
        RecipeUtils.addShapelessOreRecipe(new ItemStack(TBBlocks.quicksilverbrick,4,0), new Object[]{
                "blockQuicksilver","blockQuicksilver",
                "blockQuicksilver","blockQuicksilver"
        });

        RecipeUtils.addShapelessOreRecipe(new ItemStack(TBBlocks.goldenplanks,4),new ItemStack(TBBlocks.goldenlogs));
        RecipeUtils.addShapelessOreRecipe(new ItemStack(TBBlocks.netherplanks,4),new ItemStack(TBBlocks.netherlogs));
        RecipeUtils.addShapelessOreRecipe(new ItemStack(TBBlocks.enderplanks,4),new ItemStack(TBBlocks.enderlogs));

        RecipeUtils.addShapelessOreRecipe(new ItemStack(TBItems.thauminite_ingot), new Object[]{
                "nuggetThauminite","nuggetThauminite","nuggetThauminite",
                "nuggetThauminite","nuggetThauminite","nuggetThauminite",
                "nuggetThauminite","nuggetThauminite","nuggetThauminite"

        });

        RecipeUtils.addShapelessOreRecipe(new ItemStack(TBItems.nuggetthauminite,9,0), new Object[]{"ingotThauminite"});

        RecipeUtils.addShapelessOreRecipe(new ItemStack(TBBlocks.blockthauminite), new Object[]{
                "ingotThauminite","ingotThauminite","ingotThauminite",
                "ingotThauminite","ingotThauminite","ingotThauminite",
                "ingotThauminite","ingotThauminite","ingotThauminite"

        });
        RecipeUtils.addShapedOreRecipe(new ItemStack(TBItems.thauminitechest), new Object[]{
                "# #",
                "###",
                "###",

                '#',  "ingotThauminite"

        });
        RecipeUtils.addShapedOreRecipe(new ItemStack(TBItems.thauminitelegs), new Object[]{
                "###",
                "# #",
                "# #",

                '#',  "ingotThauminite"

        });
        RecipeUtils.addShapedOreRecipe(new ItemStack(TBItems.thauminitehelmet), new Object[]{
                "###",
                "# #",
                "   ",

                '#',  "ingotThauminite"

        });
        RecipeUtils.addShapedOreRecipe(new ItemStack(TBItems.thauminiteboots), new Object[]{
                "# #",
                "# #",
                "   ",

                '#',  "ingotThauminite"

        });

        RecipeUtils.addShapedOreRecipe(new ItemStack(TBItems.thauminiteaxe), new Object[]{
                "## ",
                "#S ",
                " S ",

                '#',  "ingotThauminite", 'S', "stickWood"

        })
        ;RecipeUtils.addShapedOreRecipe(new ItemStack(TBItems.thauminitepickaxe), new Object[]{
                "###",
                " S ",
                " S ",

                '#',  "ingotThauminite", 'S', "stickWood"

        });
        RecipeUtils.addShapedOreRecipe(new ItemStack(TBItems.thauminitesword), new Object[]{
                " # ",
                " # ",
                " S ",

                '#',  "ingotThauminite", 'S', "stickWood"
        });
        RecipeUtils.addShapedOreRecipe(new ItemStack(TBItems.thauminitehoe), new Object[]{
                "## ",
                " S ",
                " S ",

                '#',  "ingotThauminite", 'S', "stickWood"

        });
        RecipeUtils.addShapedOreRecipe(new ItemStack(TBItems.thauminiteshovel), new Object[]{
                " # ",
                " S ",
                " S ",

                '#',  "ingotThauminite", 'S', "stickWood"

        });
        RecipeUtils.addShapelessOreRecipe(new ItemStack(TBItems.voidfas), new Object[]{
                "flint",
                "ingotVoid"


        });
        RecipeUtils.addShapedOreRecipe(new ItemStack(TBItems.voidshears), new Object[]{
                " # ",
                "#  ",
                "   ",

                '#',  "ingotVoid"

        });
        RecipeUtils.addShapedOreRecipe(new ItemStack(TBItems.thauminite_plate), new Object[]{
                "   ",
                "###",
                "   ",

                '#',  "ingotThauminite"

        });

        RecipeUtils.addShapelessOreRecipe(new ItemStack(TBBlocks.eldritchark,5,0), new Object[]{
                "nuggetGold","obsidian","nuggetGold",
                "obsidian","obsidian","obsidian",
                "nuggetGold","obsidian","nuggetGold"

        });





        RecipeUtils.addShapelessOreRecipe(new ItemStack(TBBlocks.irongreatwood,5,0), new Object[]{
                "nuggetIron","plankGreatwood","nuggetIron",
                "plankGreatwood","plankGreatwood","plankGreatwood",
                "nuggetIron","plankGreatwood","nuggetIron",


        });


        RecipeUtils.addShapedRecipe(new ItemStack(TBBlocks.crystalblockair,1,0), new Object[]{
                "###",
                "###",
                "###",

                '#',  new ItemStack(TBItems.airingot)


        });
        RecipeUtils.addShapedRecipe(new ItemStack(TBBlocks.crystalblockfire,1,0), new Object[]{
                "###",
                "###",
                "###",

                '#',  new ItemStack(TBItems.fireingot)


        });
        RecipeUtils.addShapedRecipe(new ItemStack(TBBlocks.crystalblockearth,1,0), new Object[]{
                "###",
                "###",
                "###",

                '#',  new ItemStack(TBItems.earthingot)


        });
        RecipeUtils.addShapedRecipe(new ItemStack(TBBlocks.crystalblockorder,1,0), new Object[]{
                "###",
                "###",
                "###",

                '#',  new ItemStack(TBItems.orderingot)


        });
        RecipeUtils.addShapedRecipe(new ItemStack(TBBlocks.crystalblockentropy,1,0), new Object[]{
                "###",
                "###",
                "###",

                '#',  new ItemStack(TBItems.entropyingot)


        });
        RecipeUtils.addShapedRecipe(new ItemStack(TBBlocks.crystalblockmixed,1,0), new Object[]{
                "###",
                "###",
                "###",

                '#',  new ItemStack(TBItems.mixedingot)


        });
        RecipeUtils.addShapedRecipe(new ItemStack(TBBlocks.crystalblocktainted,1,0), new Object[]{
                "###",
                "###",
                "###",

                '#',  new ItemStack(TBItems.taintedingot)


        });
        RecipeUtils.addShapedRecipe(new ItemStack(TBBlocks.crystalblockwater,1,0), new Object[]{
                "###",
                "###",
                "###",

                '#',  new ItemStack(TBItems.wateringot)


        });
        RecipeUtils.addShapelessOreRecipe(new ItemStack(TBItems.tobacco_pile,1), new Object[]{"pestleAndMortar","tobbacoLeaves"});






    }

}
