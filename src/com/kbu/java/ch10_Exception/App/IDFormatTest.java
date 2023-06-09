package com.kbu.java.ch10_Exception.App;

class IDFormatException extends Exception {
    public IDFormatException(String message){
        super(message);
    }
}

public class IDFormatTest{
    private String userID;

    public String getUserID() throws IDFormatException {
        if (userID == null){
            throw new IDFormatException("id is null!");
        }
        return userID;
    }
    public void setUserID(String userID) throws IDFormatException {
        if (userID == null) {
            throw new IDFormatException("id can not be null");
        } else if (userID.length() < 8 || userID.length() > 20){
            throw new IDFormatException("Please use at least 8 characters and no more than 20 characters for your ID");
        }
        this.userID = userID;
    }

    public static void main(String[] args){
        IDFormatTest idft = new IDFormatTest();

        String userID = null;
        try {
            idft.setUserID(userID);
        } catch (IDFormatException e){
            System.out.println(e);
            e.printStackTrace();
        }
        try{
            System.out.println(idft.getUserID());
        } catch (Exception e){
            e.printStackTrace();
        }

        userID = "1234e";

        try {
            idft.setUserID(userID);
        } catch (IDFormatException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
