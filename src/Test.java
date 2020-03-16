public class Test {

    public static void main(String[] args) {
        homework a = new homework();
        a.add();
        a.mul();
        a.singular();
        a.prime();
    }


}

class homework {
    /**
     * 1.	写出计算1+2+3+···+100的和的代码。
     */
    public void add() {
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println("1到100的和为：" + sum);
        System.out.println((11+3*8)/4%3);
    }

    /**
     * 2.	写出在控制台打印九九乘法表的代码。
     */
    public void mul() {
        System.out.println("九九乘法表");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j + " ");

            }
            System.out.println();
        }

    }

    /**
     * 3.	写出打印1-100所有整数中的单数的代码。
     */
    public void singular() {
        System.out.println("1-100所有整数中的单数：");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /**
     * 4.	写出打印101-200只有的所有素数，并求出所素数的和的代码。
     */
    public void prime() {
        System.out.println("101-200所有素数");
        int p = 1;
        int sum = 0;
        for (int i = 0; i <= 200; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    p = 0;
                }
            }
            if (p == 1) {
                System.out.print(i + " ");
                sum += i;
            }
            p = 1;
        }
        System.out.println();
        System.out.println("101-200所有素数之和为" + sum);
    }
}

