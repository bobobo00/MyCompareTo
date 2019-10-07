package TestCompare;

import java.util.Comparator;

/**
 * @ClassName MyCompareTo
 * @Description TODO
 * @Auther danni
 * @Date 2019/9/28 14:44]
 * @Version 1.0
 **/

public class MyCompareTo {

    public static void main(String[] args) {
       Person person=new Person(18,"aaa",165,800);
        Person person1=new Person(18,"aaa",175,800);
        Person person2=new Person(18,"aaa",175,600);
        /*Comparator comparator=new PersonNameCompara();
        Comparator comparator1=new PersonHeightCompara();
        int r=comparator.compare(person1,person2);
        System.out.println(r);
        int s=comparator1.compare(person1,person2);
        System.out.println(s);*/
        Comparator comparator=new PersonCompara();
        int m=comparator.compare(person1,person2);
        System.out.println(m);
    }
}
class PersonCompara implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        if((o1.height-o2.height)!=0){
            return o1.height-o2.height;
        }else if((o1.age-o2.age!=0)){
            return o1.age-o2.age;
        }else if((o1.name.compareTo(o2.name))!=0){
            return o1.name.compareTo(o2.name);
        }else{
            return o1.salay-o2.salay;
        }
    }
}
class PersonNameCompara implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}
class PersonHeightCompara implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.height-o2.height;

    }
}
class Person implements Comparable<Person>{
    int age;
    String name;
    int height;
    int salay;

    public Person(int age, String name, int height, int salay) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.salay = salay;
    }

    @Override
    public int compareTo(Person o) {
        if(this.age<o.age){
            return -1;
        }else if(this.age>o.age){
            return 1;
        }else{
            if(this.salay<o.salay){
                return -1;
            }
            else if(this.salay>o.salay){
                return 1;
            }else{
                return 0;
            }
        }
    }
}
