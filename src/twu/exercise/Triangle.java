package twu.exercise;

/**
 * Created by dan on 15-7-30.
 */
public class Triangle {
    public String drawAsterisk() {
        return "*";
    }

    public String drawHorizontalLine(int pixels) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0; i<pixels; i++){
            stringBuffer.append("*");
        }
        return stringBuffer.toString();
    }
}
