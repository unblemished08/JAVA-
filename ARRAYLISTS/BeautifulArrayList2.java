import java.util.ArrayList;

public class BeautifulArrayList2 { //DIVIDE AND CONQUER APPROACH

  public static ArrayList<Integer> beautifulArray(int n) {
    ArrayList<Integer> res = new ArrayList<>();
    divideConque(1, 1, res, n);
    return res;
  }

  private static void divideConque(int start,int increment,ArrayList<Integer> res,int n)
 {
    if (start + increment > n) {
      res.add(start);
      return;
    }
    divideConque(start, 2 * increment, res, n);
    divideConque(start + increment, 2 * increment, res, n);
  }

  public static void main(String[] args) {
    System.out.println(beautifulArray(5));
  }
}
