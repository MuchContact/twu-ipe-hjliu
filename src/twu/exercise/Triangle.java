package twu.exercise;

/**
 * Created by dan on 15-7-30.
 */
public class Triangle {
    public String drawAsterisk() {
        return "*";
    }

    public String drawHorizontalLine(int columns) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0; i<columns; i++){
            stringBuffer.append("*");
        }
        return stringBuffer.toString();
    }

    public String drawVerticalLine(int rows) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0; i<rows; i++){
            stringBuffer.append("*/n");
        }
        return stringBuffer.toString();
    }

    public String drawRightTriangle(int rows) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0; i<rows; i++){
            for (int j = 1; j <=i+1; j++) {
                stringBuffer.append("*");
            }
            stringBuffer.append("/n");
        }
        return stringBuffer.toString();
    }
}
