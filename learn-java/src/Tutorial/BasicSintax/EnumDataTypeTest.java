package Tutorial.BasicSintax;

class EnumDataType {
    enum ExampleSize { SMALL, MEDIUM, LARGE};
    ExampleSize size;
}

public class EnumDataTypeTest {
    public static void main(String[] args){
        EnumDataType enumType = new EnumDataType();
        enumType.size = EnumDataType.ExampleSize.LARGE;
        System.out.println("Size: " + enumType.size);
    }
}
