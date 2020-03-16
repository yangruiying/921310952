import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用Map
 */
public class map {
    public static void main(String[] args) {
        System.out.println("第二题");
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setGrade(80);
        s1.setClass("1班");

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(19);
        s2.setGrade(100);
        s2.setClass("1班");

        Student s3 = new Student();
        s3.setName("王五");
        s3.setAge(17);
        s3.setGrade(59);
        s3.setClass("1班");
/**
 * 创建Map1
 */
        Map<Integer, Student> m1 = new HashMap<>();
        m1.put(0, s1);
        m1.put(1, s2);
        m1.put(2, s3);
/**
 * 创建student对象
 */
        Student s4 = new Student();
        s4.setName("赵六");
        s4.setAge(18);
        s4.setGrade(85);
        s4.setClass("2班");

        Student s5 = new Student();
        s5.setName("赵六");
        s5.setAge(19);
        s5.setGrade(93);
        s5.setClass("2班");

        Student s6 = new Student();
        s6.setName("孙八");
        s6.setAge(17);
        s6.setGrade(55);
        s6.setClass("2班");
/**
 * 创建Map2
 */
        Map<Integer, Student> m2 = new HashMap<>();
        m2.put(3, s4);
        m2.put(4, s5);
        m2.put(5, s6);
        /**
         * （1）整合两个Map学生信息成一个新的Map
         */
        m1.putAll(m2);

        int MIN;
        Student tmp;
        for (int i = 0; i < m1.size(); i++) {
            MIN = i;
            for (int j = i; j < m1.size(); j++) {
                if (m1.get(j).getGrade() < m1.get(MIN).getGrade()) {
                    MIN = j;
                }

            }
            tmp = m1.get(i);
            m1.put(i, m1.get(MIN));
            m1.put(MIN, tmp);
        }
        int i = m1.size();
        System.out.println("排名：");
        for (Map.Entry<Integer, Student> entry : m1.entrySet()) {
            System.out.println("第" + i + "名:" + entry.getValue().getName() + entry.getValue().getGrade() + "分");
            i--;
        }
        System.out.println("========================================================");
        System.out.println("不及格的人:");
        /**
         * （3）输出不及格的学生信息
         */
        for (Map.Entry<Integer, Student> entry : m1.entrySet()) {
            if (entry.getValue().getGrade() < 60) {
                System.out.println(entry.getValue().getName() + " " + entry.getValue().getCLASS() + " " + entry.getValue().getGrade() + "分");
            }
        }
        System.out.println("========================================================");
        System.out.println("张三信息：");
        /**
         * （4）查找张三的信息
         */
        for (Map.Entry<Integer, Student> entry : m1.entrySet()) {
            if ("张三".equals(entry.getValue().getName())) {
                System.out.println(entry.getValue().getName() + " " + entry.getValue().getCLASS() + " " + entry.getValue().getAge() + "岁 " + entry.getValue().getGrade() + "分");
            }
        }
        System.out.println("========================================================");
        /**
         * （5）从list剔除年龄大于18岁的学生信息
         */
        int size = m1.size();
        for (i = 0; i < size; i++) {
            if (m1.get(i).getAge() > 18) {
                m1.remove(i);
            }

        }
        System.out.println("不大于18岁的学生：");
        for (Map.Entry<Integer, Student> entry : m1.entrySet()) {
            System.out.println(entry.getValue().getName() + ":" + entry.getValue().getAge());
        }
    }


}
