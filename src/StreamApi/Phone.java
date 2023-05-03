package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Mobile {
    int price;
    String model;
    String brand;

    public Mobile(int price, String model, String brand) {
        this.price = price;
        this.model = model;
        this.brand = brand;
    }
        @Override
        public String toString () {
            return "Mobile{" +
                    "price=" + price +
                    ", model='" + model + '\'' +
                    ", brand'" + brand + '\'' +
                    '}' ;
        }

    }

    public class Phone {
        public static void main(String[] args) {
            List<Mobile> mobileList = new ArrayList<Mobile>();
//        Mobile m1 = new Mobile(5000,"S4","Samsung");
            mobileList.add(new Mobile(5000, "S4", "Samsung"));
            mobileList.add(new Mobile(10000, "S5", "Redmi"));
            mobileList.add(new Mobile(15000, "S6", "MI"));
            mobileList.add(new Mobile(20000, "S7", "Oneplus"));
            mobileList.add(new Mobile(50000, "S8", "Apple"));
            mobileList.add(new Mobile(60000, "S9", "Banana"));

            //first type
            List<Mobile> l1 = mobileList.stream().filter(i-> i.price >= 15000).collect(Collectors.toList());
            List<Mobile> l2 = mobileList.stream().filter(i-> i.brand == "Samsung").collect(Collectors.toList());
            List<Integer> l3 = mobileList.stream().filter(i -> i.brand == "Samsung").map(i -> i.price).collect(Collectors.toList());

            System.out.println(l1);
            System.out.println(l2);
            System.out.println(l3);

            //second type
            for (Mobile m : mobileList) {
                if (m.price >= 15000) {
                    System.out.println(m);
                }
            }

            //Third type
            mobileList.stream().filter(i -> i.brand == "Samsung").forEach(i-> System.out.println(i.price));
            mobileList.stream().filter(i -> i.price >= 10000).forEach(i-> System.out.println(i.brand+ "   "+i.model));
            mobileList.stream().filter(i -> i.price >= 10000).forEach(i-> System.out.println(i.brand+ "   "+i.price));
            mobileList.stream().filter(i -> i.price >= 10000 && i.price < 20000).forEach(i-> System.out.println(i.brand+ "   "+i.price));
            mobileList.stream().filter(i -> i.price >= 10000 && i.brand == "Oneplus").forEach(i-> System.out.println(i.brand+ "   "+i.price));
            mobileList.stream().filter(i -> i.price >= 10000 || i.brand == "Oneplus").forEach(i-> System.out.println(i.brand+ "   "+i.price));

            //Taking user input
            Scanner sc = new Scanner(System.in);
            String userBrand = sc.next();
            mobileList.stream().filter(i -> i.brand.equals(userBrand)).forEach(i-> System.out.println(i.brand+ "   "+i.price));



        }
    }

