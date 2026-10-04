package org.example;

public class Main {

    public static double doub = 22.333;
    static int myInteger = 33000;
    static boolean bool = false;

    static byte globalByte = 5;
    static int globalInt = 42;
    static double globalDouble = 3.14;
    static char globalChar = 'A';
    static boolean globalBoolean = true;
    static Integer globalInteger = 500;
    static Double globalDoubleWrapper = 2.718;
    static Character globalCharacter = 'Z';

    public static void main(String[] args) {
        long myLong = 100000000000000000L;
        char myChar = 'D';
        Double myDouble = 3.14159265358979323846;
        Boolean myBoolean = true;

        byte localByte = 7;
        short localShort = 100;
        int localInt = 1000;
        long localLong = 100_000L;
        float localFloat = 1.5f;
        double localDouble = 9.99;
        char localChar = 'X';
        boolean localBoolean = false;
        Integer localInteger = 123;
        Double localDoubleWrapper = 4.56;
        Boolean localBooleanWrapper = true;

        DataHolder holder = new DataHolder();

        //используем сеттеры
        holder.setByte1((byte) 12);
        holder.setShort1((short) 320);
        holder.setInt1(2024);
        holder.setLong1(9_999_999L);
        holder.setFloat1(2.5f);
        holder.setDouble1(123.456);
        holder.setChar1('J');
        holder.setBoolean1(true);

        holder.setByte2((byte) 3);
        holder.setShort2((short) 44);
        holder.setInteger2(777);
        holder.setLong2(888L);
        holder.setFloat2(6.6f);
        holder.setDouble2(9.9);
        holder.setCharacter2('Q');
        holder.setBoolean2(false);


        //используем геттеры

        byte fromHolderByte1 = holder.getByte1();
        short fromHolderShort1 = holder.getShort1();
        int fromHolderInt1 = holder.getInt1();
        long fromHolderLong1 = holder.getLong1();
        float fromHolderFloat1 = holder.getFloat1();
        double fromHolderDouble1 = holder.getDouble1();
        char fromHolderChar1 = holder.getChar();
        boolean fromHolderBoolean1 = holder.getBoolean1();

        Byte fromHolderByte2 = holder.getByte2();
        Short fromHolderShort2 = holder.getShort2();
        Integer fromHolderInteger2 = holder.getInteger2();
        Long fromHolderLong2 = holder.getLong2();
        Float fromHolderFloat2 = holder.getFloat2();
        Double fromHolderDouble2 = holder.getDouble2();
        Character fromHolderCharacter2 = holder.getCharacter2();
        Boolean fromHolderBoolean2 = holder.getBoolean2();

        byte b = 10;
        int i = b;
        long l = i;
        double d = l;

        double dd = 9.99;
        int ii = (int) dd;
        System.out.println(ii);

        long big = 300L;
        byte small = (byte) big;
        System.out.println(small);

        Integer boxed = 100; //autoboxing: int → Integer

        int unboxed = boxed; //unboxing:  Integer → int

        System.out.println(boxed);
        System.out.println(unboxed);

        Integer nullable = null;
        // int x = nullable;   // ошибка: NullPointerException во время выполнения

        Integer a = 1000;
        Integer b2 = 1000;
        System.out.println(a == b2);
        System.out.println(a.equals(b2));

        System.out.println(globalByte);
        System.out.println(globalInt);
        System.out.println(globalDouble);
        System.out.println(globalChar);
        System.out.println(globalBoolean);
        System.out.println(globalInteger);
        System.out.println(globalDoubleWrapper);
        System.out.println(globalCharacter);

        System.out.println(localByte);
        System.out.println(localShort);
        System.out.println(localInt);
        System.out.println(localLong);
        System.out.println(localFloat);
        System.out.println(localDouble);
        System.out.println(localChar);
        System.out.println(localBoolean);
        System.out.println(localInteger);
        System.out.println(localDoubleWrapper);
        System.out.println(localBooleanWrapper);

        System.out.println(holder.getByte1());
        System.out.println(holder.getShort1());
        System.out.println(holder.getInt1());
        System.out.println(holder.getLong1());
        System.out.println(holder.getFloat1());
        System.out.println(holder.getDouble1());
        System.out.println(holder.getChar());
        System.out.println(holder.getBoolean1());

        System.out.println(holder.getByte2());
        System.out.println(holder.getShort2());
        System.out.println(holder.getInteger2());
        System.out.println(holder.getLong2());
        System.out.println(holder.getFloat2());
        System.out.println(holder.getDouble2());
        System.out.println(holder.getCharacter2());
        System.out.println(holder.getBoolean2());

        System.out.println(fromHolderByte1);
        System.out.println(fromHolderShort1);
        System.out.println(fromHolderInt1);
        System.out.println(fromHolderLong1);
        System.out.println(fromHolderFloat1);
        System.out.println(fromHolderDouble1);
        System.out.println(fromHolderChar1);
        System.out.println(fromHolderBoolean1);
        System.out.println(fromHolderByte2);
        System.out.println(fromHolderShort2);
        System.out.println(fromHolderInteger2);
        System.out.println(fromHolderLong2);
        System.out.println(fromHolderFloat2);
        System.out.println(fromHolderDouble2);
        System.out.println(fromHolderCharacter2);
        System.out.println(fromHolderBoolean2);
    }
}