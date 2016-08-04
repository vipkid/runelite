import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("Item")
public final class class30 extends class88 {
   @ObfuscatedName("hr")
   @ObfuscatedGetter(
      intValue = -759726289
   )
   @Export("menuWidth")
   static int field708;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1117201753
   )
   @Export("quantity")
   int field709;
   @ObfuscatedName("mw")
   static byte field710;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1835703253
   )
   @Export("id")
   int field714;

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Lclass108;",
      garbageValue = "503322838"
   )
   protected final class108 vmethod1990() {
      return class1.method14(this.field714).method1178(this.field709);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lclass125;B)V",
      garbageValue = "1"
   )
   static final void method685(class125 var0) {
      var0.method2899();
      int var1 = client.field417;
      class2 var2 = class3.field65 = client.field302[var1] = new class2();
      var2.field53 = var1;
      int var3 = var0.method2907(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.field886[0] = var5 - class0.field11;
      var2.field875 = (var2.field886[0] << 7) + (var2.method15() << 6);
      var2.field887[0] = var6 - class21.field592;
      var2.field832 = (var2.field887[0] << 7) + (var2.method15() << 6);
      class99.field1701 = var2.field52 = var4;
      if(null != class34.field791[var1]) {
         var2.method29(class34.field791[var1]);
      }

      class34.field783 = 0;
      class34.field784[++class34.field783 - 1] = var1;
      class34.field782[var1] = 0;
      class34.field789 = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if(var1 != var7) {
            int var8 = var0.method2907(18);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            class34.field790[var7] = (var10 << 14) + (var9 << 28) + var11;
            class34.field788[var7] = 0;
            class34.field780[var7] = -1;
            class34.field786[++class34.field789 - 1] = var7;
            class34.field782[var7] = 0;
         }
      }

      var0.method2900();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-4"
   )
   static void method686(int var0) {
      if(var0 == -3) {
         class37.method781("Connection timed out.", "Please try using a different world.", "");
      } else if(var0 == -2) {
         class37.method781("", "Error connecting to server.", "");
      } else if(var0 == -1) {
         class37.method781("No response from server.", "Please try using a different world.", "");
      } else if(var0 == 3) {
         class33.field761 = 3;
      } else if(var0 == 4) {
         class37.method781("Your account has been disabled.", "Please check your message-centre for details.", "");
      } else if(var0 == 5) {
         class37.method781("Your account is already logged in.", "Try again in 60 secs...", "");
      } else if(var0 == 6) {
         class37.method781("RuneScape has been updated!", "Please reload this page.", "");
      } else if(var0 == 7) {
         class37.method781("This world is full.", "Please use a different world.", "");
      } else if(var0 == 8) {
         class37.method781("Unable to connect.", "Login server offline.", "");
      } else if(var0 == 9) {
         class37.method781("Login limit exceeded.", "Too many connections from your address.", "");
      } else if(var0 == 10) {
         class37.method781("Unable to connect.", "Bad session id.", "");
      } else if(var0 == 11) {
         class37.method781("We suspect someone knows your password.", "Press \'change your password\' on front page.", "");
      } else if(var0 == 12) {
         class37.method781("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if(var0 == 13) {
         class37.method781("Could not complete login.", "Please try using a different world.", "");
      } else if(var0 == 14) {
         class37.method781("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 16) {
         class37.method781("Too many login attempts.", "Please wait a few minutes before trying again.", "");
      } else if(var0 == 17) {
         class37.method781("You are standing in a members-only area.", "To play on this world move to a free area first", "");
      } else if(var0 == 18) {
         class37.method781("Account locked as we suspect it has been stolen.", "Press \'recover a locked account\' on front page.", "");
      } else if(var0 == 19) {
         class37.method781("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if(var0 == 20) {
         class37.method781("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if(var0 == 22) {
         class37.method781("Malformed login packet.", "Please try again.", "");
      } else if(var0 == 23) {
         class37.method781("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 24) {
         class37.method781("Error loading your profile.", "Please contact customer support.", "");
      } else if(var0 == 25) {
         class37.method781("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if(var0 == 26) {
         class37.method781("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if(var0 == 27) {
         class37.method781("", "Service unavailable.", "");
      } else if(var0 == 31) {
         class37.method781("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if(var0 == 32) {
         class37.method781("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
      } else if(var0 == 37) {
         class37.method781("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if(var0 == 38) {
         class37.method781("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
      } else if(var0 == 55) {
         class37.method781("Sorry, but your account is not eligible to", "play this version of the game.  Please try", "playing the main game instead!");
      } else {
         if(var0 == 56) {
            class37.method781("Enter the 6-digit code generated by your", "authenticator app.", "");
            class138.method3024(11);
            return;
         }

         if(var0 == 57) {
            class37.method781("The code you entered was incorrect.", "Please try again.", "");
            class138.method3024(11);
            return;
         }

         class37.method781("Unexpected server response", "Please try using a different world.", "");
      }

      class138.method3024(10);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-379101981"
   )
   static int method687(int var0) {
      class29 var1 = (class29)class11.field182.get(Integer.valueOf(var0));
      return null == var1?0:var1.method669();
   }
}
