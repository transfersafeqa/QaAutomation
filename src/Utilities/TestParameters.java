package Utilities;

import bsh.Variable;

/**
 * Created by rsangroula on 12/17/2015.
 */
public class TestParameters {

            private int PurchasePrice;
            private int DownPayment;

        public  void testdata() {
         this.PurchasePrice = 300000;
         this.DownPayment = 100000;

            }
   public int getPurchasePrice(){
      return this.PurchasePrice;
   }
   public int getDownPayment(){
      return this.DownPayment;
   }


             }

