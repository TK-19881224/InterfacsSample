package chapter03.used;
 /**
  * Calulator実装クラス<br>
  * 加算を行う
  */

public class SubCalc implements Calculator {
  @Override
  public Integer calc(Integer x, Integer y) {
    return x - y;
  }
}
