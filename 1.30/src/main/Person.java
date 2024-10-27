package main;

class Person {
    // 問題1: インスタンスフィールドを定義
    String name;    
    int age;       
    double height; 
    double weight; // 問題4: 新しいフィールド weight を追加

    // 問題10: 人数カウント用の静的変数
    static int count = 0;

    // 問題2: コンストラクタを定義（引数: name, age, height, weight）
    Person(String name, int age, double height, double weight) {
        // 問題3: コンストラクタの中で各インスタンスフィールドに値をセット
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight; // weight をセット

        // コンストラクタ内でインクリメントして人数をカウント
        count++;
    }

    // 問題6: インスタンスメソッド bmi を定義
    public double bmi() {
        // 問題7: BMI計算を修正 (小数第一位まで)
        return Math.round(weight / (height * height) * 10) / 10.0;
    }

    // 問題8: インスタンスメソッド print を定義
    public void print() {
        // 問題9: print メソッドの中で this を用いて出力
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + this.bmi() + "です");
    }
}
