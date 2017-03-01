import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public abstract class class182 {
   @ObfuscatedName("v")
   class122 field2708;
   @ObfuscatedName("g")
   int[] field2710;
   @ObfuscatedName("p")
   int[] field2711;
   @ObfuscatedName("y")
   int[] field2712;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -2116949745
   )
   int field2713;
   @ObfuscatedName("j")
   int[] field2714;
   @ObfuscatedName("m")
   int[][] field2715;
   @ObfuscatedName("a")
   int[][] field2716;
   @ObfuscatedName("i")
   class122[] field2717;
   @ObfuscatedName("k")
   Object[][] field2719;
   @ObfuscatedName("f")
   static class146 field2720 = new class146();
   @ObfuscatedName("n")
   int[] field2721;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -5799243
   )
   public int field2722;
   @ObfuscatedName("c")
   boolean field2723;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 211877925
   )
   static int field2724 = 0;
   @ObfuscatedName("q")
   boolean field2725;
   @ObfuscatedName("s")
   Object[] field2726;

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1112234377"
   )
   public int method3352(int var1) {
      return this.field2719[var1].length;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "0"
   )
   void vmethod3445(int var1) {
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIB)[B",
      garbageValue = "-47"
   )
   @Export("getConfigData")
   public byte[] getConfigData(int var1, int var2) {
      return this.getConfigData(var1, var2, (int[])null);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1941324296"
   )
   public boolean method3356(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field2719.length && null != this.field2719[var1] && var2 >= 0 && var2 < this.field2719[var1].length) {
         if(this.field2719[var1][var2] != null) {
            return true;
         } else if(null != this.field2726[var1]) {
            return true;
         } else {
            this.vmethod3443(var1);
            return null != this.field2726[var1];
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1031254889"
   )
   public boolean method3358(int var1) {
      if(this.field2726[var1] != null) {
         return true;
      } else {
         this.vmethod3443(var1);
         return null != this.field2726[var1];
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-80"
   )
   public void method3359(int var1) {
      for(int var2 = 0; var2 < this.field2719[var1].length; ++var2) {
         this.field2719[var1][var2] = null;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "-1938196927"
   )
   public byte[] method3360(int var1) {
      if(this.field2719.length == 1) {
         return this.getConfigData(0, var1);
      } else if(this.field2719[var1].length == 1) {
         return this.getConfigData(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(III)[B",
      garbageValue = "-806140861"
   )
   public byte[] method3361(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field2719.length && this.field2719[var1] != null && var2 >= 0 && var2 < this.field2719[var1].length) {
         if(null == this.field2719[var1][var2]) {
            boolean var3 = this.method3368(var1, (int[])null);
            if(!var3) {
               this.vmethod3443(var1);
               var3 = this.method3368(var1, (int[])null);
               if(!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = class63.method1236(this.field2719[var1][var2], false);
         return var4;
      } else {
         return null;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IB)[B",
      garbageValue = "-74"
   )
   public byte[] method3362(int var1) {
      if(this.field2719.length == 1) {
         return this.method3361(0, var1);
      } else if(this.field2719[var1].length == 1) {
         return this.method3361(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "-82218853"
   )
   public int[] method3364(int var1) {
      return this.field2715[var1];
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1516832855"
   )
   public boolean method3365() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.field2721.length; ++var2) {
         int var3 = this.field2721[var2];
         if(this.field2726[var3] == null) {
            this.vmethod3443(var3);
            if(this.field2726[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1247118088"
   )
   public int method3366() {
      return this.field2719.length;
   }

   class182(boolean var1, boolean var2) {
      this.field2725 = var1;
      this.field2723 = var2;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1135054273"
   )
   public void method3367() {
      for(int var1 = 0; var1 < this.field2719.length; ++var1) {
         if(this.field2719[var1] != null) {
            for(int var2 = 0; var2 < this.field2719[var1].length; ++var2) {
               this.field2719[var1][var2] = null;
            }
         }
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I[IB)Z",
      garbageValue = "4"
   )
   boolean method3368(int var1, int[] var2) {
      if(null == this.field2726[var1]) {
         return false;
      } else {
         int var3 = this.field2714[var1];
         int[] var4 = this.field2715[var1];
         Object[] var5 = this.field2719[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if(var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if(var6) {
            return true;
         } else {
            byte[] var18;
            if(var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
               var18 = class63.method1236(this.field2726[var1], false);
            } else {
               var18 = class63.method1236(this.field2726[var1], true);
               Buffer var8 = new Buffer(var18);
               var8.method2906(var2, 5, var8.payload.length);
            }

            byte[] var20 = ScriptState.method165(var18);
            if(this.field2725) {
               this.field2726[var1] = null;
            }

            if(var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var10 * var3 * 4;
               Buffer var11 = new Buffer(var20);
               int[] var12 = new int[var3];
               var11.offset = var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.readInt();
                     var12[var15] += var14;
                  }
               }

               byte[][] var19 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var19[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.offset = var9;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.readInt();
                     System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if(!this.field2723) {
                     var5[var4[var15]] = class112.method2183(var19[var15], false);
                  } else {
                     var5[var4[var15]] = var19[var15];
                  }
               }
            } else if(!this.field2723) {
               var5[var4[0]] = class112.method2183(var20, false);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)I",
      garbageValue = "-1818502882"
   )
   public int method3370(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field2717[var1].method2417(WidgetNode.method198(var2));
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)[B",
      garbageValue = "743986040"
   )
   public byte[] method3371(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field2708.method2417(WidgetNode.method198(var1));
      int var4 = this.field2717[var3].method2417(WidgetNode.method198(var2));
      return this.getConfigData(var3, var4);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;B)Z",
      garbageValue = "24"
   )
   public boolean method3372(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field2708.method2417(WidgetNode.method198(var1));
      int var4 = this.field2717[var3].method2417(WidgetNode.method198(var2));
      return this.method3356(var3, var4);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)Z",
      garbageValue = "-6024"
   )
   public boolean method3373(String var1) {
      int var2 = this.method3426("");
      return var2 != -1?this.method3372("", var1):this.method3372(var1, "");
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1880348941"
   )
   public void method3374(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field2708.method2417(WidgetNode.method198(var1));
      if(var2 >= 0) {
         this.vmethod3445(var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "([BB)V",
      garbageValue = "-21"
   )
   void method3383(byte[] var1) {
      int var3 = var1.length;
      int var2 = class110.method2164(var1, 0, var3);
      this.field2722 = var2;
      Buffer var4 = new Buffer(ScriptState.method165(var1));
      int var5 = var4.readUnsignedByte();
      if(var5 >= 5 && var5 <= 7) {
         if(var5 >= 6) {
            var4.readInt();
         }

         int var6 = var4.readUnsignedByte();
         if(var5 >= 7) {
            this.field2713 = var4.method2900();
         } else {
            this.field2713 = var4.readUnsignedShort();
         }

         int var7 = 0;
         int var8 = -1;
         this.field2721 = new int[this.field2713];
         int var9;
         if(var5 >= 7) {
            for(var9 = 0; var9 < this.field2713; ++var9) {
               this.field2721[var9] = var7 += var4.method2900();
               if(this.field2721[var9] > var8) {
                  var8 = this.field2721[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < this.field2713; ++var9) {
               this.field2721[var9] = var7 += var4.readUnsignedShort();
               if(this.field2721[var9] > var8) {
                  var8 = this.field2721[var9];
               }
            }
         }

         this.field2712 = new int[1 + var8];
         this.field2711 = new int[1 + var8];
         this.field2714 = new int[1 + var8];
         this.field2715 = new int[var8 + 1][];
         this.field2726 = new Object[1 + var8];
         this.field2719 = new Object[var8 + 1][];
         if(var6 != 0) {
            this.field2710 = new int[var8 + 1];

            for(var9 = 0; var9 < this.field2713; ++var9) {
               this.field2710[this.field2721[var9]] = var4.readInt();
            }

            this.field2708 = new class122(this.field2710);
         }

         for(var9 = 0; var9 < this.field2713; ++var9) {
            this.field2712[this.field2721[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < this.field2713; ++var9) {
            this.field2711[this.field2721[var9]] = var4.readInt();
         }

         for(var9 = 0; var9 < this.field2713; ++var9) {
            this.field2714[this.field2721[var9]] = var4.readUnsignedShort();
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if(var5 >= 7) {
            for(var9 = 0; var9 < this.field2713; ++var9) {
               var10 = this.field2721[var9];
               var11 = this.field2714[var10];
               var7 = 0;
               var12 = -1;
               this.field2715[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field2715[var10][var13] = var7 += var4.method2900();
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field2719[var10] = new Object[var12 + 1];
            }
         } else {
            for(var9 = 0; var9 < this.field2713; ++var9) {
               var10 = this.field2721[var9];
               var11 = this.field2714[var10];
               var7 = 0;
               var12 = -1;
               this.field2715[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field2715[var10][var13] = var7 += var4.readUnsignedShort();
                  if(var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field2719[var10] = new Object[var12 + 1];
            }
         }

         if(var6 != 0) {
            this.field2716 = new int[1 + var8][];
            this.field2717 = new class122[var8 + 1];

            for(var9 = 0; var9 < this.field2713; ++var9) {
               var10 = this.field2721[var9];
               var11 = this.field2714[var10];
               this.field2716[var10] = new int[this.field2719[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.field2716[var10][this.field2715[var10][var12]] = var4.readInt();
               }

               this.field2717[var10] = new class122(this.field2716[var10]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "3"
   )
   void vmethod3443(int var1) {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(II[IS)[B",
      garbageValue = "26281"
   )
   @Export("getConfigData")
   public byte[] getConfigData(int var1, int var2, int[] var3) {
      if(var1 >= 0 && var1 < this.field2719.length && null != this.field2719[var1] && var2 >= 0 && var2 < this.field2719[var1].length) {
         if(this.field2719[var1][var2] == null) {
            boolean var4 = this.method3368(var1, var3);
            if(!var4) {
               this.vmethod3443(var1);
               var4 = this.method3368(var1, var3);
               if(!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class63.method1236(this.field2719[var1][var2], false);
         if(this.field2723) {
            this.field2719[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)I",
      garbageValue = "-92"
   )
   public int method3426(String var1) {
      var1 = var1.toLowerCase();
      return this.field2708.method2417(WidgetNode.method198(var1));
   }
}
