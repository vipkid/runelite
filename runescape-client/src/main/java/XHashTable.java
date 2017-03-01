import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dz")
@Implements("XHashTable")
public final class XHashTable {
   @ObfuscatedName("x")
   @Export("size")
   int size;
   @ObfuscatedName("n")
   @Export("buckets")
   Node[] buckets;
   @ObfuscatedName("v")
   Node field1878;
   @ObfuscatedName("g")
   Node field1879;
   @ObfuscatedName("y")
   int field1880 = 0;

   @ObfuscatedName("x")
   public Node method2437(long var1) {
      Node var3 = this.buckets[(int)(var1 & (long)(this.size - 1))];

      for(this.field1879 = var3.next; this.field1879 != var3; this.field1879 = this.field1879.next) {
         if(this.field1879.hash == var1) {
            Node var4 = this.field1879;
            this.field1879 = this.field1879.next;
            return var4;
         }
      }

      this.field1879 = null;
      return null;
   }

   @ObfuscatedName("n")
   public void method2438(Node var1, long var2) {
      if(var1.previous != null) {
         var1.unlink();
      }

      Node var4 = this.buckets[(int)(var2 & (long)(this.size - 1))];
      var1.previous = var4.previous;
      var1.next = var4;
      var1.previous.next = var1;
      var1.next.previous = var1;
      var1.hash = var2;
   }

   @ObfuscatedName("g")
   void method2439() {
      for(int var1 = 0; var1 < this.size; ++var1) {
         Node var2 = this.buckets[var1];

         while(true) {
            Node var3 = var2.next;
            if(var3 == var2) {
               break;
            }

            var3.unlink();
         }
      }

      this.field1879 = null;
      this.field1878 = null;
   }

   @ObfuscatedName("v")
   public Node method2440() {
      this.field1880 = 0;
      return this.method2441();
   }

   @ObfuscatedName("y")
   public Node method2441() {
      Node var1;
      if(this.field1880 > 0 && this.field1878 != this.buckets[this.field1880 - 1]) {
         var1 = this.field1878;
         this.field1878 = var1.next;
         return var1;
      } else {
         do {
            if(this.field1880 >= this.size) {
               return null;
            }

            var1 = this.buckets[this.field1880++].next;
         } while(var1 == this.buckets[this.field1880 - 1]);

         this.field1878 = var1.next;
         return var1;
      }
   }

   public XHashTable(int var1) {
      this.size = var1;
      this.buckets = new Node[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         Node var3 = this.buckets[var2] = new Node();
         var3.next = var3;
         var3.previous = var3;
      }

   }
}
