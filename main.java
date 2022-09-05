public class NasiboxMalang {
     public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String makanan;
       int harga = 0, uang;
       
         System.out.println("Pilihan Menu :");
         System.out.println("1.Nasibox Teriyaki");
         System.out.println("2.Nasibox Asam Manis");
         System.out.println("3.Nasi Mentai egg");
         System.out.println("4.Nasi Goreng");
         System.out.println("5.Snack box");
         System.out.println("6.Kentang Noriyaki");
         System.out.println("-------------");
         makanan=in.next();
         
         System.out.println("Total harga makanan yang kamu pilih :");
         switch(makanan){
             case "1":
                 System.out.println("Rp.18000");harga=18000;break;
             case "2":
                 System.out.println("Rp.18000");harga=18000;break;
             case "3":
                 System.out.println("Rp.15000");harga=15000;break;
             case "4":
                 System.out.println("Rp.15000");harga=15000;break;
             case "5":
                 System.out.println("Rp.14000");harga=14000;break;
             case "6":
                 System.out.println("Rp.11000");harga=11000;break;
             default :
                 System.out.println("Maaf tidak ada makanan yang anda ingin");
                  
         }
         System.out.println("Masukkan uang anda");
         uang=in.nextInt();
         if(uang>=harga){
             System.out.println("Kembalian anda= "+(uang-harga));
         }else{
             System.out.println("Uang anda kurang ambillah di bank dulu");
              }
         System.out.println("");
         System.out.println("TERIMAKASIH SELAMAT MENIKMATI MAKANAN ANDA");
    }
    
}
