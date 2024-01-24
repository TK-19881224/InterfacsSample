package chapter03.use;

import chapter03.used.AddCalc;
import chapter03.used.Calculator;

/*
 * インターフェース依存を確認する
 */

public class Call {

	public static void main(String[] args) {
		Calculator calculator = new AddCalc();
        Integer result = calculator.calc(10,5);
        System.out.println("計算結果は「"+ result +"」です。");
	}
}
