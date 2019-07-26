package com.stackroute;

public class Member {

    String name;
    int age;
    double salary;


    @Override
    public String toString() {
        return "Member{name='Harry Potter', age=30, salary=2500.3}";
    }
}

    class MemberVariable {
        Member member = new Member();

        public String memberVariable(String name, int age, double salary) {

            member.name = name;
            member.age = age;
            member.salary = salary;

            if (name == null)
                return null;

            return member.toString();

        }
    }



