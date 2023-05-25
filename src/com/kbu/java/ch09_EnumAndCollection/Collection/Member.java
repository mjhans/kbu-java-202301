package com.kbu.java.ch09_EnumAndCollection.Collection;

public class Member {
    protected int memberId;
    protected String memberName;

    public Member(int memberId, String memberName){
        this.setMemberId(memberId);
        this.setMemberName(memberName);
    }

    public void setMemberId(int memberId){
        this.memberId = memberId;
    }

    public int getMemberId(){
        return this.memberId;
    }

    public void setMemberName(String memberName){
        this.memberName = memberName;
    }

    public String getMemberName(){
        return this.memberName;
    }

    @Override
    public String toString(){
        return String.format("member id : %s, member name: %s", this.getMemberId(), this.getMemberName());
    }

        
}
