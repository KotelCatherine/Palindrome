package ru.top.academy;

public abstract class AbstractCheckString {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String toString(String result) {
        return result;
    }

    abstract String resultIsChecking();

    abstract boolean isCheck();
}
