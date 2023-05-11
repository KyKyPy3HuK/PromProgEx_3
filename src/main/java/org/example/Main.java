package org.example;
import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        boolean isNotExit = true;
        CurrencyV dollars = new CurrencyV(60.0d);
        CurrencyV roubles = new CurrencyV(1.0d);
        SuperDeposit [] deposits = new SuperDeposit[0];

        while(isNotExit){
            System.out.println("1 - добавить вклад");
            System.out.println("2 - вывести список вкладов");
            System.out.println("3 - изменить валюту вклада");
            System.out.println("4 - рассчитать проценты по вкладу");
            System.out.println("5 - выход");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:{
                    System.out.println("1 - Добавить сберегательный вклад");
                    System.out.println("2 - Добавить накопительный вклад");
                    SuperDeposit tempDeposit;
                    System.out.println("Введите сумму вклада ");
                    int subMenu = scanner.nextInt();
                    System.out.println("Введите срок вклада ");
                    if (subMenu == 1){
                        double sum = scanner.nextDouble();
                        int term = scanner.nextInt();
                        tempDeposit = new SavingDeposit(sum, 5, term, dollars);
                    } else if (subMenu == 2) {
                        double sum = scanner.nextDouble();
                        int term = scanner.nextInt();
                        tempDeposit = new CumulativeDeposit(sum, 3, term, roubles);
                    }
                    else {
                        System.out.println("Введено не верное значение! Повторите ввод!");
                        break;
                    }
                    SuperDeposit[] temp = new SuperDeposit[deposits.length + 1];
                    for (int i=0; i < deposits.length; i++){
                        temp[i] = deposits[i];
                    }
                    temp[deposits.length] = tempDeposit;
                    deposits = temp;
                    break;
                }
                case 2:{
                    if (deposits.length > 0){
                        for (SuperDeposit item:deposits){
                            System.out.println(item);
                        }
                    }
                    else{
                        System.out.println("Список пуст! Добавьте новый вклад!");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Введите номер депозита");
                    int depNum = scanner.nextInt();;
                    System.out.println("Введите валюту: 1 - доллары, 2 - рубли");
                    int curNum = scanner.nextInt();
                    if (curNum == 1){
                        deposits[depNum].changeCurrency(dollars);
                    } else if (curNum == 2) {
                        deposits[depNum].changeCurrency(roubles);
                    }
                    break;
                }
                case 4:{
                    System.out.println("Введите номер депозита");
                    int depNum = scanner.nextInt();;
                    System.out.println("Начисления " + deposits[depNum].calculateAccruals());
                    break;
                }
                case 5:{
                    isNotExit =false;
                    break;
                }
                default:{
                    System.out.println("Введено неверное значение, повторите ввод!");
                    break;
                }
            }

        }
    }
}