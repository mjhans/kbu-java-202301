package com.kbu.java.ch09_EnumAndCollection.Collection.App;

import com.kbu.java.ch09_EnumAndCollection.Collection.*;

public class MemberHashDemo {
    public static void main(String[] args){
        MemberHashMap memberHashmap = new MemberHashMap();
        Member m1 = new Member(1001, "이지원");
        Member m2 = new Member(1002, "손민국");
        Member m3 = new Member(1003, "박서원");

        memberHashmap.addMember(m1.getMemberId(), m1);
        memberHashmap.addMember(m2.getMemberId(), m2);
        memberHashmap.addMember(m3.getMemberId(), m3);

        memberHashmap.showAllMember();

        memberHashmap.removeMember(m2.getMemberId());

        System.out.println();
        memberHashmap.showAllMember();

        
    }
}
