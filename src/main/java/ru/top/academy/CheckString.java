package ru.top.academy;

public class CheckString extends AbstractCheckString {

    @Override
    public String resultIsChecking() {
        return (isCheck()) ? toString("Строка является палиндромом") : toString("Строка не является палиндромом");
    }

    @Override
    public boolean isCheck() {
        String str = getStr();
        char[] array = str.toCharArray();

        int last = array.length - 1;
        int first = 0;

        while (last > first) {
            char firstChar = array[first++];
            char lastChar = array[last--];
            if (firstChar != lastChar) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setStr(String str) {
        super.setStr(str);
    }

    @Override
    public String getStr() {
        return super.getStr();
    }

    @Override
    public String toString(String result) {
        return super.toString(result);
    }
}
