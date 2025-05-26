package ru.top.academy;

public abstract class AbstractCheckString {
    private String str;
    abstract String resultIsChecking();

    abstract boolean isCheck();



    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    String toString(String result){
        return result;
    }
}
