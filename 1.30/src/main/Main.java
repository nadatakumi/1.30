package main;

class Main {
    public static void main(String[] args) {
        int totalPeople = 1; // 問題10: 人数の合計をカウントする変数
        double weight = 60; // 問題5: Main.javaの引数にweightの60を入れてください

        // Person インスタンスを作成
        Person person1 = new Person("鈴木太郎", 20, 1.7, weight);

        // print メソッドを呼び出して情報を出力
        person1.print();

        // 合計人数を出力
        System.out.println("合計" + totalPeople + "人です");
    }
}
