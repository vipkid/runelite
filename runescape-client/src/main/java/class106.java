import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("Frames")
public class class106 extends class207 {
   @ObfuscatedName("l")
   class91[] field1843;
   @ObfuscatedName("u")
   static class83 field1847;

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1631396750"
   )
   public boolean method2386(int var1) {
      return this.field1843[var1].field1616;
   }

   class106(class170 var1, class170 var2, int var3, boolean var4) {
      class202 var5 = new class202();
      int var6 = var1.method3405(var3);
      this.field1843 = new class91[var6];
      int[] var7 = var1.method3395(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.method3411(var3, var7[var8]);
         class105 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(class105 var12 = (class105)var5.method3980(); var12 != null; var12 = (class105)var5.method3970()) {
            if(var11 == var12.field1838) {
               var10 = var12;
               break;
            }
         }

         if(null == var10) {
            byte[] var13;
            if(var4) {
               var13 = var2.method3401(0, var11);
            } else {
               var13 = var2.method3401(var11, 0);
            }

            var10 = new class105(var11, var13);
            var5.method3963(var10);
         }

         this.field1843[var7[var8]] = new class91(var9, var10);
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "-48"
   )
   static final String method2393(int var0) {
      return var0 < 100000?"<col=ffff00>" + var0 + "</col>":(var0 < 10000000?"<col=ffffff>" + var0 / 1000 + "K" + "</col>":"<col=00ff80>" + var0 / 1000000 + "M" + "</col>");
   }
}
