package ru.top.academy;

public class CheckString extends AbstractCheckString {

    @Override
     public String checkResult() {
        return (isCheck()) ? toString("Строка является палиндромом") : toString("Строка не является палиндромом");
    }

    @Override
     boolean isCheck() {
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
        str = str.replaceAll("[^a-zA-Z]+", "").toLowerCase();
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
