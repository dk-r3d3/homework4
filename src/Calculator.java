import java.util.Arrays;
import java.util.List;

public class Calculator {
    public double sum(List<? extends Number> list) {
        double result = 0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        return result;
    }

    public double mult(List<? extends Number> list) {
        double result = 1;
        for (Number number : list) {
            result *= number.doubleValue();
        }
        return result;
    }

    public double div(List<? extends Number> list) {
        double result = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            result /= list.get(i).doubleValue();
        }
        return result;
    }

    public void binary(List<? extends Number> list) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (Number number : list) {
            if (number.doubleValue() % number.intValue() == 0) {
                parseInt(number, stringBuilder1);
                System.out.println("В бинарном виде: "+ stringBuilder1);
                stringBuilder1.delete(0, stringBuilder1.length());
            } else {
                int number1 = number.intValue();
                double number2 = number.doubleValue() - number1;
                parseInt(number1, stringBuilder1);
                parseDouble(number2, stringBuilder2);
                System.out.println("В бинарном виде: " + stringBuilder1 + "." + stringBuilder2);
            }
        }
    }

    public void parseInt(Number number, StringBuilder stringBuilder) {
        String binaryRes = "";
        int numb = number.intValue();
        while (numb != 0) {
            binaryRes += numb % 2;
            numb = numb / 2;
        }
        stringBuilder.append(binaryRes).append("");
    }

    public void parseDouble(Number number, StringBuilder stringBuilder) {
        String binaryRes = "";
        double numb = number.doubleValue();
        while (numb < 1) {
//            System.out.println(numb);
            binaryRes += "1";
            numb = numb * 2;
        }
        binaryRes += "0";
        stringBuilder.append(binaryRes).append("");
    }
}
