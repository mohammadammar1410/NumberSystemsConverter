/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad
 */
public class ToDecimal {
    private String inputNo,inputNoInverted="";
    private int sysFrm,resultNo,digit,base;
    
    public ToDecimal(String inputNumber,int selectedSysFrm){
        this.inputNo = inputNumber.trim();
        this.sysFrm = selectedSysFrm;

    }
    public int getDecimal(){

        for (int i = 0; i < inputNo.length(); i++){

            inputNoInverted = inputNo.charAt(i) + inputNoInverted; 
        }
        for(int i=0; i<=inputNoInverted.length()-1; i++){
            String digitString = inputNoInverted.substring(i,i+1);
            switch(digitString){
                case "A":
                    digit = 10;
                    break;
                case "B":
                    digit = 11;
                    break;
                case "C":
                    digit = 12;
                    break;
                case "D":
                    digit = 13;
                    break;
               case "E":
                    digit = 14;
                    break;
               case "F":
                    digit = 15;
                    break;
               default :
                   digit = Integer.parseInt(digitString);
                   break;
            }

            switch( sysFrm){
                case 1 :
                    base = 2;
                    break;
                case 2 :
                    base = 8;
                    break;
                case 3 :
                    base = 10;
                    break;
                case 4 :
                    base = 16;
                    break;
            } 
            resultNo = resultNo + (int) (digit * Math.pow(base,i));
        }
        return resultNo;
    }
}
