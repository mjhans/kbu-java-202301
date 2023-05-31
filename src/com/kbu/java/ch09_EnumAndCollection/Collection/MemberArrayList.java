package com.kbu.java.ch09_EnumAndCollection.Collection;

import java.util.*;

public class MemberArrayList {
    protected ArrayList<Member> memberList;
    
    public MemberArrayList(){
        memberList = new ArrayList<Member>();
    }

    public void addMember(Member member){
        memberList.add(member);
    }
    public boolean removeMember(int memberId){
        for (int i = 0 ; i < memberList.size() ; i++){
            Member member = memberList.get(i);
            if(member.getMemberId() == memberId){
                memberList.remove(i);
                return true;
            }
        }
        return false;
    }
    public void showAllMember(){
        System.out.println("------------------------------------------------------");
        for (int i = 0 ; i < memberList.size() ; i++){
            System.out.println(i + ", " + memberList.get(i).toString());
        }
        // for(Member member : this.memberList) {
        //     System.out.println(member.toString());
        // }
        System.out.println("------------------------------------------------------");
    }
}
