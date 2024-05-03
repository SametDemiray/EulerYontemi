package org.example;

// Bilinmeyen fonksiyonu ve türevlerini içeren eşitlikler "diferansiyel denklem" olarak adlandırılmaktadır. Bir çok olay ve sistemler;
// değişim içerdiğinden , bunların matematiksel olarak modellenmesi de diferansiyel denklemlerle yapılmaktadır. Adi diferansiyel
// denklemlerin sayısal çözümleri için en temel/basit yöntemlerinden bir tanesi "Euler Yöntemi"dir"

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,n;
        float x,y,x0,y0,h;
        Scanner scanner = new Scanner(System.in);
        System.out.print("x(0) : ");
        x0 = scanner.nextFloat();
        System.out.print("y(0) : ");
        y0 = scanner.nextFloat();
        System.out.print("Adım Değeri : ");
        h = scanner.nextFloat();
        System.out.print("Değer Sayısı : ");
        n = scanner.nextInt();

        x=x0;
        y=y0;

        System.out.print("\nSonuçlar (x,y)\n");
        System.out.printf("%f\t%f\n",x,y);
        for(i=1; i<=n; i++){
            y+=h*(-y/(2+x));
            x+=h;
            System.out.printf("%f\t%f\n",x,y);
        }
    }
}