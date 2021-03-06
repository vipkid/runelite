import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class8 {
   @ObfuscatedName("nc")
   static class57 field70;
   @ObfuscatedName("bu")
   static IndexData field78;
   @ObfuscatedName("fc")
   @ObfuscatedGetter(
      intValue = 1630054905
   )
   static int field79;

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1304929709"
   )
   static void method103(int var0) {
      if(var0 == -3) {
         class45.method854("Connection timed out.", "Please try using a different world.", "");
      } else if(var0 == -2) {
         class45.method854("", "Error connecting to server.", "");
      } else if(var0 == -1) {
         class45.method854("No response from server.", "Please try using a different world.", "");
      } else if(var0 == 3) {
         class41.loginIndex = 3;
      } else if(var0 == 4) {
         class45.method854("Your account has been disabled.", "Please check your message-centre for details.", "");
      } else if(var0 == 5) {
         class45.method854("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
      } else if(var0 == 6) {
         class45.method854("RuneScape has been updated!", "Please reload this page.", "");
      } else if(var0 == 7) {
         class45.method854("This world is full.", "Please use a different world.", "");
      } else if(var0 == 8) {
         class45.method854("Unable to connect.", "Login server offline.", "");
      } else if(var0 == 9) {
         class45.method854("Login limit exceeded.", "Too many connections from your address.", "");
      } else if(var0 == 10) {
         class45.method854("Unable to connect.", "Bad session id.", "");
      } else if(var0 == 11) {
         class45.method854("We suspect someone knows your password.", "Press \'change your password\' on front page.", "");
      } else if(var0 == 12) {
         class45.method854("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if(var0 == 13) {
         class45.method854("Could not complete login.", "Please try using a different world.", "");
      } else if(var0 == 14) {
         class45.method854("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 16) {
         class45.method854("Too many login attempts.", "Please wait a few minutes before trying again.", "");
      } else if(var0 == 17) {
         class45.method854("You are standing in a members-only area.", "To play on this world move to a free area first", "");
      } else if(var0 == 18) {
         class45.method854("Account locked as we suspect it has been stolen.", "Press \'recover a locked account\' on front page.", "");
      } else if(var0 == 19) {
         class45.method854("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if(var0 == 20) {
         class45.method854("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if(var0 == 22) {
         class45.method854("Malformed login packet.", "Please try again.", "");
      } else if(var0 == 23) {
         class45.method854("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 24) {
         class45.method854("Error loading your profile.", "Please contact customer support.", "");
      } else if(var0 == 25) {
         class45.method854("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if(var0 == 26) {
         class45.method854("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if(var0 == 27) {
         class45.method854("", "Service unavailable.", "");
      } else if(var0 == 31) {
         class45.method854("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if(var0 == 32) {
         class45.method854("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
      } else if(var0 == 37) {
         class45.method854("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if(var0 == 38) {
         class45.method854("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
      } else if(var0 == 55) {
         class45.method854("Sorry, but your account is not eligible to", "play this version of the game.  Please try", "playing the main game instead!");
      } else {
         if(var0 == 56) {
            class45.method854("Enter the 6-digit code generated by your", "authenticator app.", "");
            class9.setGameState(11);
            return;
         }

         if(var0 == 57) {
            class45.method854("The code you entered was incorrect.", "Please try again.", "");
            class9.setGameState(11);
            return;
         }

         class45.method854("Unexpected server response", "Please try using a different world.", "");
      }

      class9.setGameState(10);
   }

   class8() throws Throwable {
      throw new Error();
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-79"
   )
   public static void method104() {
      class105 var0 = class105.keyboard;
      synchronized(class105.keyboard) {
         ++class105.keyboardIdleTicks;
         class105.field1703 = class105.field1694;
         class105.field1707 = 0;
         int var1;
         if(class105.field1711 < 0) {
            for(var1 = 0; var1 < 112; ++var1) {
               class105.field1695[var1] = false;
            }

            class105.field1711 = class105.field1697;
         } else {
            while(class105.field1711 != class105.field1697) {
               var1 = class105.field1696[class105.field1697];
               class105.field1697 = class105.field1697 + 1 & 127;
               if(var1 < 0) {
                  class105.field1695[~var1] = false;
               } else {
                  if(!class105.field1695[var1] && class105.field1707 < class105.field1700.length - 1) {
                     class105.field1700[++class105.field1707 - 1] = var1;
                  }

                  class105.field1695[var1] = true;
               }
            }
         }

         if(class105.field1707 > 0) {
            class105.keyboardIdleTicks = 0;
         }

         class105.field1694 = class105.field1704;
      }
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "(LActor;IIIIIB)V",
      garbageValue = "47"
   )
   static final void method105(Actor var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 != null && var0.vmethod737()) {
         if(var0 instanceof NPC) {
            NPCComposition var6 = ((NPC)var0).composition;
            if(var6.configs != null) {
               var6 = var6.method3804();
            }

            if(var6 == null) {
               return;
            }
         }

         int var74 = class45.field891;
         int[] var7 = class45.field894;
         int var8 = 3;
         int var14;
         int var21;
         int var22;
         if(!var0.combatInfoList.method2793()) {
            class99.method1947(var0, var0.field607 + 15);

            for(CombatInfoListHolder var75 = (CombatInfoListHolder)var0.combatInfoList.method2790(); var75 != null; var75 = (CombatInfoListHolder)var0.combatInfoList.method2791()) {
               CombatInfo1 var10 = var75.method723(Client.gameCycle);
               if(var10 == null) {
                  if(var75.method721()) {
                     var75.unlink();
                  }
               } else {
                  CombatInfo2 var11 = var75.combatInfo2;
                  SpritePixels var12 = var11.method3552();
                  SpritePixels var13 = var11.method3542();
                  int var15 = 0;
                  if(var12 != null && var13 != null) {
                     if(var11.field2859 * 2 < var13.width) {
                        var15 = var11.field2859;
                     }

                     var14 = var13.width - var15 * 2;
                  } else {
                     var14 = var11.healthScale;
                  }

                  int var16 = 255;
                  boolean var17 = true;
                  int var76 = Client.gameCycle - var10.field666;
                  int var19 = var10.health * var14 / var11.healthScale;
                  int var20;
                  int var86;
                  if(var10.field665 > var76) {
                     var20 = var11.field2854 == 0?0:var76 / var11.field2854 * var11.field2854;
                     var21 = var14 * var10.healthRatio / var11.healthScale;
                     var86 = var21 + (var19 - var21) * var20 / var10.field665;
                  } else {
                     var86 = var19;
                     var20 = var11.field2850 + var10.field665 - var76;
                     if(var11.field2849 >= 0) {
                        var16 = (var20 << 8) / (var11.field2850 - var11.field2849);
                     }
                  }

                  if(var10.health > 0 && var86 < 1) {
                     var86 = 1;
                  }

                  var20 = var2 + Client.field388 - (var14 >> 1);
                  var21 = var3 + Client.field389 - var8;
                  if(var12 != null && var13 != null) {
                     var20 -= var15;
                     if(var86 == var14) {
                        var86 += var15 * 2;
                     } else {
                        var86 += var15;
                     }

                     var22 = var12.height;
                     var8 += var22;
                     if(var16 >= 0 && var16 < 255) {
                        var12.method4236(var20, var21, var16);
                        Rasterizer2D.method4084(var20, var21, var86 + var20, var22 + var21);
                        var13.method4236(var20, var21, var16);
                     } else {
                        var12.method4230(var20, var21);
                        Rasterizer2D.method4084(var20, var21, var86 + var20, var22 + var21);
                        var13.method4230(var20, var21);
                     }

                     Rasterizer2D.method4083(var2, var3, var4 + var2, var3 + var5);
                     var8 += 2;
                  } else {
                     if(Client.field388 > -1) {
                        Rasterizer2D.method4089(var20, var21, var86, 5, '\uff00');
                        Rasterizer2D.method4089(var20 + var86, var21, var14 - var86, 5, 16711680);
                     }

                     var8 += 7;
                  }
               }
            }
         }

         if(var8 < 30) {
            var8 = 30;
         }

         if(var1 < var74) {
            Player var88 = (Player)var0;
            if(var88.field263) {
               return;
            }

            if(var88.skullIcon != -1 || var88.overheadIcon != -1) {
               class99.method1947(var0, var0.field607 + 15);
               if(Client.field388 > -1) {
                  if(var88.skullIcon != -1) {
                     Script.field938[var88.skullIcon].method4230(var2 + Client.field388 - 12, var3 + Client.field389 - var8);
                     var8 += 25;
                  }

                  if(var88.overheadIcon != -1) {
                     VertexNormal.field1414[var88.overheadIcon].method4230(var2 + Client.field388 - 12, Client.field389 + var3 - var8);
                     var8 += 25;
                  }
               }
            }

            if(var1 >= 0 && Client.field298 == 10 && Client.field300 == var7[var1]) {
               class99.method1947(var0, var0.field607 + 15);
               if(Client.field388 > -1) {
                  class108.field1726[1].method4230(var2 + Client.field388 - 12, var3 + Client.field389 - var8);
               }
            }
         } else {
            NPCComposition var89 = ((NPC)var0).composition;
            if(var89.configs != null) {
               var89 = var89.method3804();
            }

            if(var89.field3045 >= 0 && var89.field3045 < VertexNormal.field1414.length) {
               class99.method1947(var0, var0.field607 + 15);
               if(Client.field388 > -1) {
                  VertexNormal.field1414[var89.field3045].method4230(Client.field388 + var2 - 12, var3 + Client.field389 - 30);
               }
            }

            if(Client.field298 == 1 && Client.field350[var1 - var74] == Client.field299 && Client.gameCycle % 20 < 10) {
               class99.method1947(var0, var0.field607 + 15);
               if(Client.field388 > -1) {
                  class108.field1726[0].method4230(Client.field388 + var2 - 12, Client.field389 + var3 - 28);
               }
            }
         }

         if(var0.overhead != null && (var1 >= var74 || !var0.inSequence && (Client.field323 == 4 || !var0.field613 && (Client.field323 == 0 || Client.field323 == 3 || Client.field323 == 1 && WidgetNode.method199(((Player)var0).name, false))))) {
            class99.method1947(var0, var0.field607);
            if(Client.field388 > -1 && Client.field428 < Client.field377) {
               Client.field381[Client.field428] = TextureProvider.field1192.method3904(var0.overhead) / 2;
               Client.field473[Client.field428] = TextureProvider.field1192.field3111;
               Client.field378[Client.field428] = Client.field388;
               Client.field379[Client.field428] = Client.field389;
               Client.field507[Client.field428] = var0.field616;
               Client.field503[Client.field428] = var0.field617;
               Client.field384[Client.field428] = var0.field615;
               Client.field335[Client.field428] = var0.overhead;
               ++Client.field428;
            }
         }

         for(int var9 = 0; var9 < 4; ++var9) {
            int var84 = var0.field621[var9];
            int var79 = var0.field630[var9];
            class201 var85 = null;
            int var80 = 0;
            if(var79 >= 0) {
               if(var84 <= Client.gameCycle) {
                  continue;
               }

               var85 = IndexData.method3381(var0.field630[var9]);
               var80 = var85.field2906;
               if(var85 != null && var85.field2917 != null) {
                  var85 = var85.method3673();
                  if(var85 == null) {
                     var0.field621[var9] = -1;
                     continue;
                  }
               }
            } else if(var84 < 0) {
               continue;
            }

            var14 = var0.field645[var9];
            class201 var77 = null;
            if(var14 >= 0) {
               var77 = IndexData.method3381(var14);
               if(var77 != null && var77.field2917 != null) {
                  var77 = var77.method3673();
               }
            }

            if(var84 - var80 <= Client.gameCycle) {
               if(var85 == null) {
                  var0.field621[var9] = -1;
               } else {
                  class99.method1947(var0, var0.field607 / 2);
                  if(Client.field388 > -1) {
                     if(var9 == 1) {
                        Client.field389 -= 20;
                     }

                     if(var9 == 2) {
                        Client.field388 -= 15;
                        Client.field389 -= 10;
                     }

                     if(var9 == 3) {
                        Client.field388 += 15;
                        Client.field389 -= 10;
                     }

                     SpritePixels var83 = null;
                     SpritePixels var18 = null;
                     SpritePixels var81 = null;
                     SpritePixels var78 = null;
                     var21 = 0;
                     var22 = 0;
                     int var23 = 0;
                     int var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     SpritePixels var29 = null;
                     SpritePixels var30 = null;
                     SpritePixels var31 = null;
                     SpritePixels var32 = null;
                     int var33 = 0;
                     int var34 = 0;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     var83 = var85.method3672();
                     int var42;
                     if(var83 != null) {
                        var21 = var83.width;
                        var42 = var83.height;
                        if(var42 > var41) {
                           var41 = var42;
                        }

                        var25 = var83.offsetX;
                     }

                     var18 = var85.method3647();
                     if(var18 != null) {
                        var22 = var18.width;
                        var42 = var18.height;
                        if(var42 > var41) {
                           var41 = var42;
                        }

                        var26 = var18.offsetX;
                     }

                     var81 = var85.method3668();
                     if(var81 != null) {
                        var23 = var81.width;
                        var42 = var81.height;
                        if(var42 > var41) {
                           var41 = var42;
                        }

                        var27 = var81.offsetX;
                     }

                     var78 = var85.method3657();
                     if(var78 != null) {
                        var24 = var78.width;
                        var42 = var78.height;
                        if(var42 > var41) {
                           var41 = var42;
                        }

                        var28 = var78.offsetX;
                     }

                     if(var77 != null) {
                        var29 = var77.method3672();
                        if(var29 != null) {
                           var33 = var29.width;
                           var42 = var29.height;
                           if(var42 > var41) {
                              var41 = var42;
                           }

                           var37 = var29.offsetX;
                        }

                        var30 = var77.method3647();
                        if(var30 != null) {
                           var34 = var30.width;
                           var42 = var30.height;
                           if(var42 > var41) {
                              var41 = var42;
                           }

                           var38 = var30.offsetX;
                        }

                        var31 = var77.method3668();
                        if(var31 != null) {
                           var35 = var31.width;
                           var42 = var31.height;
                           if(var42 > var41) {
                              var41 = var42;
                           }

                           var39 = var31.offsetX;
                        }

                        var32 = var77.method3657();
                        if(var32 != null) {
                           var36 = var32.width;
                           var42 = var32.height;
                           if(var42 > var41) {
                              var41 = var42;
                           }

                           var40 = var32.offsetX;
                        }
                     }

                     Font var82 = var85.method3650();
                     if(var82 == null) {
                        var82 = class36.field766;
                     }

                     Font var43;
                     if(var77 != null) {
                        var43 = var77.method3650();
                        if(var43 == null) {
                           var43 = class36.field766;
                        }
                     } else {
                        var43 = class36.field766;
                     }

                     String var44 = null;
                     String var45 = null;
                     boolean var46 = false;
                     int var47 = 0;
                     var44 = var85.method3653(var0.field629[var9]);
                     int var87 = var82.method3904(var44);
                     if(var77 != null) {
                        var45 = var77.method3653(var0.field623[var9]);
                        var47 = var43.method3904(var45);
                     }

                     int var48 = 0;
                     int var49 = 0;
                     if(var22 > 0) {
                        if(var81 == null && var78 == null) {
                           var48 = 1;
                        } else {
                           var48 = var87 / var22 + 1;
                        }
                     }

                     if(var77 != null && var34 > 0) {
                        if(var31 == null && var32 == null) {
                           var49 = 1;
                        } else {
                           var49 = var47 / var34 + 1;
                        }
                     }

                     int var50 = 0;
                     int var51 = var50;
                     if(var21 > 0) {
                        var50 += var21;
                     }

                     var50 += 2;
                     int var52 = var50;
                     if(var23 > 0) {
                        var50 += var23;
                     }

                     int var53 = var50;
                     int var54 = var50;
                     int var55;
                     if(var22 > 0) {
                        var55 = var22 * var48;
                        var50 += var55;
                        var54 += (var55 - var87) / 2;
                     } else {
                        var50 += var87;
                     }

                     var55 = var50;
                     if(var24 > 0) {
                        var50 += var24;
                     }

                     int var56 = 0;
                     int var57 = 0;
                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61;
                     if(var77 != null) {
                        var50 += 2;
                        var56 = var50;
                        if(var33 > 0) {
                           var50 += var33;
                        }

                        var50 += 2;
                        var57 = var50;
                        if(var35 > 0) {
                           var50 += var35;
                        }

                        var58 = var50;
                        var60 = var50;
                        if(var34 > 0) {
                           var61 = var49 * var34;
                           var50 += var61;
                           var60 += (var61 - var47) / 2;
                        } else {
                           var50 += var47;
                        }

                        var59 = var50;
                        if(var36 > 0) {
                           var50 += var36;
                        }
                     }

                     var61 = var0.field621[var9] - Client.gameCycle;
                     int var62 = var85.field2911 - var61 * var85.field2911 / var85.field2906;
                     int var63 = var85.field2912 * var61 / var85.field2906 + -var85.field2912;
                     int var64 = Client.field388 + var2 - (var50 >> 1) + var62;
                     int var65 = var3 + Client.field389 - 12 + var63;
                     int var66 = var65;
                     int var67 = var65 + var41;
                     int var68 = var65 + 15 + var85.field2899;
                     int var69 = var68 - var82.field3122;
                     int var70 = var82.field3113 + var68;
                     if(var69 < var65) {
                        var66 = var69;
                     }

                     if(var70 > var67) {
                        var67 = var70;
                     }

                     int var71 = 0;
                     int var72;
                     int var73;
                     if(var77 != null) {
                        var71 = var77.field2899 + var65 + 15;
                        var72 = var71 - var43.field3122;
                        var73 = var71 + var43.field3113;
                        if(var72 < var66) {
                           ;
                        }

                        if(var73 > var67) {
                           ;
                        }
                     }

                     var72 = 255;
                     if(var85.field2913 >= 0) {
                        var72 = (var61 << 8) / (var85.field2906 - var85.field2913);
                     }

                     if(var72 >= 0 && var72 < 255) {
                        if(var83 != null) {
                           var83.method4236(var51 + var64 - var25, var65, var72);
                        }

                        if(var81 != null) {
                           var81.method4236(var64 + var52 - var27, var65, var72);
                        }

                        if(var18 != null) {
                           for(var73 = 0; var73 < var48; ++var73) {
                              var18.method4236(var73 * var22 + (var64 + var53 - var26), var65, var72);
                           }
                        }

                        if(var78 != null) {
                           var78.method4236(var64 + var55 - var28, var65, var72);
                        }

                        var82.method3915(var44, var54 + var64, var68, var85.field2905, 0, var72);
                        if(var77 != null) {
                           if(var29 != null) {
                              var29.method4236(var56 + var64 - var37, var65, var72);
                           }

                           if(var31 != null) {
                              var31.method4236(var64 + var57 - var39, var65, var72);
                           }

                           if(var30 != null) {
                              for(var73 = 0; var73 < var49; ++var73) {
                                 var30.method4236(var58 + var64 - var38 + var73 * var34, var65, var72);
                              }
                           }

                           if(var32 != null) {
                              var32.method4236(var59 + var64 - var40, var65, var72);
                           }

                           var43.method3915(var45, var64 + var60, var71, var77.field2905, 0, var72);
                        }
                     } else {
                        if(var83 != null) {
                           var83.method4230(var64 + var51 - var25, var65);
                        }

                        if(var81 != null) {
                           var81.method4230(var64 + var52 - var27, var65);
                        }

                        if(var18 != null) {
                           for(var73 = 0; var73 < var48; ++var73) {
                              var18.method4230(var73 * var22 + (var64 + var53 - var26), var65);
                           }
                        }

                        if(var78 != null) {
                           var78.method4230(var55 + var64 - var28, var65);
                        }

                        var82.method3914(var44, var64 + var54, var68, var85.field2905 | -16777216, 0);
                        if(var77 != null) {
                           if(var29 != null) {
                              var29.method4230(var56 + var64 - var37, var65);
                           }

                           if(var31 != null) {
                              var31.method4230(var64 + var57 - var39, var65);
                           }

                           if(var30 != null) {
                              for(var73 = 0; var73 < var49; ++var73) {
                                 var30.method4230(var34 * var73 + (var58 + var64 - var38), var65);
                              }
                           }

                           if(var32 != null) {
                              var32.method4230(var59 + var64 - var40, var65);
                           }

                           var43.method3914(var45, var64 + var60, var71, var77.field2905 | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
