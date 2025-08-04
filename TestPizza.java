package pizzashop;

import java.util.Scanner;

public class TestPizza {
    public static void main(String[] args) {
        Pizza Mypizza = new Pizza();
        Scanner Myscan = new Scanner(System.in);

        String[] toppingOptions = {
                "แฮม", "ไส้กรอก", "ชีส", "เห็ด", "มะกอกดำ", "หอมใหญ่",
                "สับปะรด", "เบคอน", "กุ้ง", "ปูอัด", "พริกหยวก", "ซาลามี่"
        };

        System.out.println("=-=-=- เมนูเครื่องปรุงพิซซ่า -=-=-=");
        for (int i = 0; i < toppingOptions.length; i++) {
            System.out.println((i + 1) + ". " + toppingOptions[i]);
        }
        System.out.println("กรุณาเลือกเครื่องปรุง ได้สูงสุด 10 อย่าง (พิมพ์หมายเลข, 0 เพื่อหยุด):");

        int count = 0;
        while (count < 10) {
            System.out.print("เลือกเครื่องปรุงเลขที่ " + (count + 1) + ": ");
            int choice = Myscan.nextInt();

            if (choice == 0) break;

            if (choice >= 1 && choice <= toppingOptions.length) {
                Mypizza.addTopping(toppingOptions[choice - 1]);
                count++;
            } else {
                System.out.println("หมายเลขไม่ถูกต้อง กรุณาเลือกใหม่อีกครั้ง");
            }
        }

        System.out.println("\n===== สรุปรายการพิซซ่า =====");
        System.out.println("จำนวนเครื่องปรุง: " + Mypizza.getTotalToppings());
        Mypizza.printAllTopping();
        System.out.println("ราคาทั้งหมด: " + Mypizza.calculatePrice() + " บาท");

        Myscan.close();
    }
}
