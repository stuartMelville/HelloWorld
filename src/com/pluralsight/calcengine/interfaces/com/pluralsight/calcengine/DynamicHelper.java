package com.pluralsight.calcengine.interfaces.com.pluralsight.calcengine;

/**
 * Created by stuart on 7/29/2016.
 */
public class DynamicHelper {
    private MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers){
        this.handlers = handlers;
    }

    public String process (String statement){
        // IN: add 1.0 2.0
        // OUT: 1.0 +2.0 = 3.0
        String[] parts = statement.split(MathProcessing.SEPERATOR);
        String keyword = parts[0];  //add
        MathProcessing theHandler = null;

        for(MathProcessing handler :handlers){
            if(keyword.equalsIgnoreCase((handler.getKeyWord()))){
                theHandler = handler;
                break;
            }
        }
        double leftVal = Double.parseDouble((parts[1]));  // 1.0
        double rightVal = Double.parseDouble((parts[2])); // 2.0

        double result = theHandler.doCalculation(leftVal,rightVal);

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftVal);
        sb.append(' ');
        sb.append(theHandler.getSymbol());
        sb.append(' ');
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();
    }
}
