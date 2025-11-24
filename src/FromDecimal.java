/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad
 */
public class FromDecimal {
    private String Result = "";
    private int SysType,InputNum;

    public FromDecimal(int inputNum,int sysType) {
        this.InputNum = inputNum;
        this.SysType = sysType;
    }

    public String getSysType (){
        int base = 0;

        while (InputNum != 0) {

            switch (SysType) {
                case 1:
                    base = 2;
                    break;
                case 2:
                    base = 8;
                    break;
                case 3:
                    base = 10;
                    break;
                case 4:
                    base = 16;
                    break;
            }
            int remainder = InputNum % base;
            String remStr = remainder + "";
            switch (remainder) {
                case 10:
                    remStr = "A";
                    break;
                case 11:
                    remStr = "B";
                    break;
                case 12:
                    remStr = "C";
                    break;
                case 13:
                    remStr = "D";
                    break;
                case 14:
                    remStr = "E";
                    break;
                case 15:
                    remStr = "F";
                    break;
                default :
                    break;
            }
            Result = remStr + Result ;
            InputNum = InputNum / base;
        }
        return Result;
    }
}
