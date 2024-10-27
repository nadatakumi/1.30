package main;

class Main {
    public static void main(String[] args) {
        // person1 インスタンスを作成
        Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
        person1.print();

        // person2 インスタンスを作成
        Person person2 = new Person("山田花子", 22, 1.5, 40);
        person2.print();

        // 人数の合計を出力
        System.out.println("合計" + Person.count + "人です");
    }
}