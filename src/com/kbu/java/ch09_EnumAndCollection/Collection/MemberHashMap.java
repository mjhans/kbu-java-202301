package com.kbu.java.ch09_EnumAndCollection.Collection;

import java.util.HashMap;

public class MemberHashMap {
    protected HashMap<Integer, Member> memberMap = null;
    public MemberHashMap(){
        memberMap = new HashMap<Integer, Member>();
    }

    public void addMember(int key, Member value){
        if (!memberMap.containsKey(key)){
            memberMap.put(key, value);
        }
    }

    public boolean removeMember(int key){
        if (memberMap.containsKey(key)){
            memberMap.remove(key);
            return true;
        }
        return false;
    }
    public void showAllMember(){
        for(Member memeber : memberMap.values()){
            System.out.println(memeber.toString());
        }
    }

}
