import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hd")
@Implements("ModIcon")
public final class ModIcon extends Rasterizer2D {
   @ObfuscatedName("c")
   @Export("palette")
   public int[] palette;
   @ObfuscatedName("d")
   @Export("pixels")
   public byte[] pixels;
   @ObfuscatedName("z")
   @Export("originalHeight")
   public int originalHeight;
   @ObfuscatedName("q")
   @Export("height")
   public int height;
   @ObfuscatedName("t")
   @Export("offsetX")
   public int offsetX;
   @ObfuscatedName("p")
   @Export("offsetY")
   public int offsetY;
   @ObfuscatedName("n")
   @Export("originalWidth")
   public int originalWidth;
   @ObfuscatedName("u")
   @Export("width")
   public int width;

   @ObfuscatedName("d")
   public void method4167() {
      if(this.originalWidth != this.width || this.height != this.originalHeight) {
         byte[] var1 = new byte[this.width * this.originalHeight];
         int var2 = 0;

         for(int var3 = 0; var3 < this.height; ++var3) {
            for(int var4 = 0; var4 < this.originalWidth; ++var4) {
               var1[var4 + this.offsetX + (var3 + this.offsetY) * this.width] = this.pixels[var2++];
            }
         }

         this.pixels = var1;
         this.originalWidth = this.width;
         this.height = this.originalHeight;
         this.offsetX = 0;
         this.offsetY = 0;
      }
   }

   @ObfuscatedName("q")
   static void method4168(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if(var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("c")
   public void method4169(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.palette.length; ++var4) {
         int var5 = this.palette[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.palette[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.palette[var4] & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.palette[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   @ObfuscatedName("n")
   public void method4170(int var1, int var2) {
      var1 += this.offsetX;
      var2 += this.offsetY;
      int var3 = var1 + var2 * Rasterizer2D.graphicsPixelsWidth;
      int var4 = 0;
      int var5 = this.height;
      int var6 = this.originalWidth;
      int var7 = Rasterizer2D.graphicsPixelsWidth - var6;
      int var8 = 0;
      int var9;
      if(var2 < Rasterizer2D.field3211) {
         var9 = Rasterizer2D.field3211 - var2;
         var5 -= var9;
         var2 = Rasterizer2D.field3211;
         var4 += var9 * var6;
         var3 += var9 * Rasterizer2D.graphicsPixelsWidth;
      }

      if(var2 + var5 > Rasterizer2D.field3213) {
         var5 -= var2 + var5 - Rasterizer2D.field3213;
      }

      if(var1 < Rasterizer2D.field3208) {
         var9 = Rasterizer2D.field3208 - var1;
         var6 -= var9;
         var1 = Rasterizer2D.field3208;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if(var1 + var6 > Rasterizer2D.field3214) {
         var9 = var1 + var6 - Rasterizer2D.field3214;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if(var6 > 0 && var5 > 0) {
         method4168(Rasterizer2D.graphicsPixels, this.pixels, this.palette, var4, var3, var6, var5, var7, var8);
      }
   }
}
