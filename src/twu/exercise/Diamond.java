package twu.exercise;

/**
 * Created by dan on 15-7-30.
 */
public class Diamond {

    public String drawIsoscelesTriangle(int rows) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows-i; j++) {
                stringBuffer.append(" ");
            }
            int num = 2*i-1;
            while(num>0){
                stringBuffer.append("*");
                num--;
            }
            stringBuffer.append("/n");
        }

        return stringBuffer.toString();
    }

    public String drawDiamond(int upperRows) {
        return drawIsoscelesTriangle(upperRows)+drawDownIsoscelesTriangle(upperRows-1);
    }

    private String drawDownIsoscelesTriangle(int rows) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i <= rows; i++) {
            int num = i;
            while(num>0){
                stringBuffer.append(" ");
                num--;
            }
            int tmp = 2*(rows-i) + 1;
            while (tmp>0){
                stringBuffer.append("*");
                tmp--;
            }
            stringBuffer.append("/n");
        }

        return stringBuffer.toString();
    }

    public String drawDiamondWithName(int upperRows) {
        return drawUpperIsoscelesTriangle(upperRows-1)
                +drawMiddleText("Bill")
                +drawDownIsoscelesTriangle(upperRows-1);
    }

    private String drawUpperIsoscelesTriangle(int rows) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j <= rows-i; j++) {
                stringBuffer.append(" ");
            }
            int num = 2*i-1;
            while(num>0){
                stringBuffer.append("*");
                num--;
            }
            stringBuffer.append("/n");
        }

        return stringBuffer.toString();
    }

    private String drawMiddleText(String name) {
        return "Bill/n";
    }
}
