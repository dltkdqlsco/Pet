package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog koreaDog = new Dog();
        koreaDog.setName("하루");
        koreaDog.setAge(3);
        koreaDog.setKind("진돗개");
        koreaDog.setVac(true);

        Scanner scanner = new Scanner(System.in);
        System.out.print("개의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("개의 나이를 입력하세요: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("개의 품종을 입력하세요: ");
        String kind = scanner.nextLine();

        System.out.print("예방주사를 맞았나요(예 혹은 아니오)? :");
        String check = scanner.nextLine();

        Dog pungsanDog = new Dog(name, age, kind);

        if(check.equals("예")){
            pungsanDog.setVac(true);
        }else{
            pungsanDog.setVac(false);
        }

        System.out.println(koreaDog.toString());
        System.out.println(pungsanDog.toString());

        List<Dog> list = new ArrayList<>();
        list.add(koreaDog);
        list.add(pungsanDog);
        System.out.println();

        for(int i = 0; i < list.size(); i++){
            if(!list.get(i).isVac()){
                if(list.get(i).getAge() > 2){
                    System.out.println("다음 개들은 두 살이 넘었으나 예방주사를 맞지 않았다: ");
                    System.out.println("이름: " + list.get(i).getName() + " 나이: " + list.get(i).getAge());
                }
            }
        }
    }
}