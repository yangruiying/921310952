import java.util.ArrayList;
import java.util.List;

/**
 * 使用list
 */
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 成绩
     */
    private double grade;
    /**
     * 班级
     */
    private String CLASS;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setClass(String aClass) {
        CLASS = aClass;
    }

}

class H3 {
    public static void main(String[] args) {
        System.out.println("第一题");
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
 * 创建list1
 */
        List<Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
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
 * 创建list2
 */
        List<Student> list2 = new ArrayList<>();
        list2.add(s4);
        list2.add(s5);
        list2.add(s6);
        /**
         * （1）整合两个list学生信息成一个新的list
         */
        list1.addAll(list2);
        int MIN;
        Student tmp;
        /**
         * （2）按照分数给出学生信息排名
         */
        for (int i = 0; i < list1.size(); i++) {
            MIN = i;
            for (int j = i; j < list1.size(); j++) {
                if (list1.get(j).getGrade() < list1.get(MIN).getGrade()) {
                    MIN = j;
                }

            }
            tmp = list1.get(i);
            list1.set(i, list1.get(MIN));
            list1.set(MIN, tmp);
        }

        int i = list1.size();
        System.out.println("排名：");
        for (Student s : list1) {
            System.out.println("第" + i + "名:" + s.getName() + s.getGrade() + "分");
            i--;
        }
        System.out.println("========================================================");
        System.out.println("不及格的人:");
        /**
         * （3）输出不及格的学生信息
         */
        for (Student s : list1) {
            if (s.getGrade() < 60) {
                System.out.println(s.getName() + " " + s.getCLASS() + " " + s.getGrade() + "分");
            }
        }
        System.out.println("========================================================");
        System.out.println("张三信息：");
        /**
         * （4）查找张三的信息
         */
        for (Student s : list1) {
            if ("张三".equals(s.getName())) {
                System.out.println(s.getName() + " " + s.getCLASS() + " " + s.getAge() + "岁 " + s.getGrade() + "分");
            }
        }
        System.out.println("========================================================");

/**
 * （5）从list剔除年龄大于18岁的学生信息
 */

        for (i = 0; i < list1.size(); i++) {
            if (list1.get(i).getAge() > 18) {
                list1.remove(i);
                i--;
            }

        }
        System.out.println("不大于18岁的学生：");
        for (Student s : list1) {
            System.out.println(s.getName() + ": " + s.getAge());
        }
    }


}
