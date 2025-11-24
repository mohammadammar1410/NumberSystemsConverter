/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad
 */
public class CkeckBeforeConvert {
    private final String [] inputno;
    private final int sysTyp;
    private final String [] Octsys,Decisys,Hexasys;
    public CkeckBeforeConvert(String inputno ,int systyp){
        this.inputno = inputno.split("");
        this.sysTyp = systyp;
        Octsys = new String[8];
        for(int i=0;i<8;i++){
            Octsys[i] = i+"";
            
        }
        Decisys = new String[10];
        for(int i=0;i<10;i++){
            Decisys[i] = i+"";
        }
        Hexasys = new String[16];
        for(int i=0;i<10;i++){
            Hexasys[i] = i+"";
        }
        Hexasys[10] = "A";
        Hexasys[11] = "B";
        Hexasys[12] = "C";
        Hexasys[13] = "D";
        Hexasys[14] = "E";
        Hexasys[15] = "F";
    }
    public boolean CheckInput(){
        boolean inputIsWrite = false;
        
         switch (sysTyp){
            case 1 :
                for(String a : inputno){
                    for(int j=0;j<Octsys.length; j++){
                        if(a.equals("0") || a.equals("1"))
                            inputIsWrite = true;
                        else inputIsWrite = false;
                    }
                }
                break;
            case 2 :
                for(String a : inputno){
                    for(int j=0;j<Octsys.length; j++){
                        if(a.equals( Octsys[j])){
                            inputIsWrite = true;
                            break;
                        }
                        else inputIsWrite = false;
                    }
                 }
                break;
            case 3 :
                for(String a : inputno){
                    for(int j=0;j<Decisys.length; j++){
                        if(a.equals( Decisys[j])){
                            inputIsWrite = true;
                            break;
                        }
                        else inputIsWrite = false;
                    }
                 }
                break;
            case 4 :
                for(String a : inputno){
                    for(int j=0;j<Hexasys.length; j++){
                        if(a.equals( Hexasys[j])){
                            inputIsWrite = true;
                            break;
                        }
                        else inputIsWrite = false;
                    }
                 }
             break;
        }
        return inputIsWrite;
    }        
}
