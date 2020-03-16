public class h2 {
    public static void main(String[] args) {
        test2 q = new test2();
        q.q1();
        q.q2();
        q.q3();
        q.q4();
        q.q5();
        q.q6();
    }
}

class test2 {

    public void q1() {
        System.out.println("1.数组排序：{1,23,6,74,8,19,104} 按 从小到大排序。");
        int[] a = {1, 23, 6, 74, 8, 19, 104};
        int MIN, tmp;
        /**
         * 选择排序
         */
        for (int i = 0; i < a.length; i++) {
            MIN = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[MIN]) {
                    MIN = j;
                }

            }
            tmp = a[i];
            a[i] = a[MIN];
            a[MIN] = tmp;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("==============================================");
    }

    public void q2() {
        System.out.println("2.数组{1,2,3,4,5,5,5,5,5,6,7,8,9}，去掉数组中的5 生成新的数组。");
        int[] a = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9};
        int num=0;
        int f=0;
        for (int i:a)
        {
            /**
             * 查找没有5的个数
             */
            if(i!=5){
                num++;
            }
        }
        /**
         * 将除去5的数组放入新的数组中
         */
        int[] b= new int[num];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 5) {
                b[f]=a[i];
                f++;
            }

        }
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("==============================================");
    }

    public void q3() {
        System.out.println("3.数字 a{1,3,5,7,9}  b{2,4,6,8,10},将两个数组合并，并按照从小到大的顺序排序，生成新数组。");
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int MIN, tmp;
        int sum = a.length + b.length;
        int[] c = new int[sum];
        /**
         * 将数组a放入数组c
         */
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        /**
         * 将数组b放入数组a
         */
        for (int i = a.length; i < a.length + b.length; i++) {
            c[i] = b[i - a.length];
        }
/**
 * 选择排序
 */
        for (int i = 0; i < c.length; i++) {
            MIN = i;
            for (int j = i; j < c.length; j++) {
                if (c[j] < c[MIN]) {
                    MIN = j;
                }

            }
            tmp = c[i];
            c[i] = c[MIN];
            c[MIN] = tmp;
        }

        for (int i : c) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("==============================================");


    }

    public void q4() {
        System.out.println("1.字符串：“Hello World!”，在字符串前面拼接自己的名字。");
        String S1="Hello World!";
        String S2="杨瑞颖";
/**
 * 数组合并
 */
        System.out.println(S2.concat(S1));
        System.out.println("==============================================");
    }

    public void q5() {
        System.out.println("2.字符串“1,2,3,4,5,6,7”，根据“，”分开，将其转化为字符串数组，并在控制台打印。");
        String S = "1,2,3,4,5,6,7";
        String[] S1 = S.split(",");
        for (String S2 : S1) {
            System.out.print(S2+" ");
        }
        System.out.println();
        System.out.println("==============================================");
    }

    public void q6() {
        System.out.println("3.计算Hello World! 中出现了几次l。");
        String S = "Hello World!";
        int count = 0;
        /**
         * 查找"l"出现的次数
         */
        for (int i =0;i<S.length();i++) {
            if (S.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println(count);

    }


}
