package javacore.chapter02.condition.exercise;

public class SmartHomeSecurity {
    public static void main(String[] args){
        boolean isHouseEmpty = true;
        boolean isOwnerAsleep = true;
        boolean areAllDoorsAndWindowsClosed = true;
        boolean isAlarmActivated = true;
        boolean isSafeModeActivated ;
        if (isHouseEmpty || isOwnerAsleep && areAllDoorsAndWindowsClosed && isAlarmActivated){
            isSafeModeActivated = true;
        }
    }
}
