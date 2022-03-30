package practica4;

import java.util.Scanner;
import java.util.Random;

public class Mexicano {
    public String pn;
    public String sn;
    public String ap;
    public String am;
    public String st;
    public String gen;
    public String dia;
    public String mes;
    public String año;
    public String CURP;
    public String RFC;

    public Mexicano(String pn, String sn, String ap, String am, String st, String gen, String dia, String mes, String año, String CURP, String RFC) {
        this.pn = pn;
        this.sn= sn;
        this.ap=ap;
        this.am=am;
        this.st=st;
        this.gen=gen;
        this.dia=dia;
        this.mes=mes;
        this.año=año;
        this.CURP=CURP;
        this.RFC=RFC;
    }

    public Mexicano() {
        this.pn = null;
        this.sn=null;
        this.ap=null;
        this.am=null;
        this.st=null;
        this.gen=null;
        this.dia=null;
        this.mes=null;
        this.año=null;
        this.CURP= null;
        this.RFC= null;
    }
    public void asignarPn(String pn){
        this.pn = pn;
    }
    public String getPn(){
        return this.pn;
    }
    public void asignarSn(String sn){
        this.sn= sn;
    }
    public String getSn(){
        return this.sn;
    }
    public void asignarAp(String ap) {this.ap = ap;}
    public String getAp(){
        return this.ap;
    }
    public void asignarAm(String am){
        this.am = am;
    }
    public String getAm(){
        return this.am;
    }
    public void asignarSt(String st){
        this.st = st;
    }
    public String getSt(){return this.st;}
    public void asignarGen(String gen){
        this.gen = gen;
    }
    public String getGen(){
        return this.gen;
    }
    public void asignarDia(String dia){
        this.dia = dia;
    }
    public String getDia(){
        return this.dia;
    }
    public void asignarMes(String mes){
        this.mes = mes;
    }
    public String getMes(){
        return this.mes;
    }
    public void asignarAño(String año){
        this.año = año;
    }
    public String getAño(){
        return this.año;
    }

    public String getV(){
        String v = ap.toUpperCase();
        for(int i=0; i<v.length(); i++) {
            if(v.substring(i,i+1) == "A"||
                    v.substring(i,i+1) == "E"||
                    v.substring(i,i+1) == "I"||
                    v.substring(i,i+1) == "O"||
                    v.substring(i,i+1) == "U")
            {return v = v.substring(i,i+1);}
        }
        return v;
    }
    public String getConsAp(){
        String cons = ap.toUpperCase();
        for(int i=0; i<cons.length(); i++) {
            if(cons.substring(i,i+1) != "A"|| cons.substring(i,i+1) != "E"|| cons.substring(i,i+1) != "I"|| cons.substring(i,i+1) != "O"|| cons.substring(i,i+1) != "U")
            {cons = cons.substring(i,i+1);}
        }
        return cons;
    }
    public String getCons2Am(){
        String cons2 = am.toUpperCase();
        for(int i=0; i<cons2.length(); i++) {
            if(cons2.substring(i,i+1) != "A"|| cons2.substring(i,i+1) != "E"|| cons2.substring(i,i+1) != "I"|| cons2.substring(i,i+1) != "O"|| cons2.substring(i,i+1) != "U")
            {cons2 = cons2.substring(i,i+1);}}
        return cons2;
    }
    public String getCons3Pn(){
        String cons3 = pn.toUpperCase();
        for(int i=0; i<cons3.length(); i++) {
            if(cons3.substring(i,i+1) != "A"|| cons3.substring(i,i+1) != "E"|| cons3.substring(i,i+1) != "I"|| cons3.substring(i,i+1) != "O"|| cons3.substring(i,i+1) != "U")
            {cons3 = cons3.substring(i,i+1);}
        }
        return cons3;
    }
    public String getRandom(){
        char [] chars = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".toCharArray();
        int charsLength = chars.length;
        Random random = new Random();
        char instancia = (chars[random.nextInt(charsLength)]);
        String random1 = String.valueOf(instancia);
        return random1;
    }
    public String getClaveSt(){
        String claveSt = this.st.toUpperCase();
        if(claveSt == "AGUASCALIENTES"){claveSt = "AS";}
        if(claveSt == "BAJA CALIFORNIA SUR"){claveSt = "BS";}
        if(claveSt == "COAHUILA"){claveSt = "CL";}
        if(claveSt == "CHIAPAS"){claveSt = "CS";}
        if(claveSt == "DISTRITO FEDERAL"){claveSt = "DF";}
        if(claveSt == "GUANAJUATO"){claveSt = "GT";}
        if(claveSt == "HIDALGO"){claveSt = "HG";}
        if(claveSt == "MÉXICO" || claveSt == "MEXICO"){claveSt = "MC";}
        if(claveSt == "MORELOS"){claveSt = "MS";}
        if(claveSt == "NUEVO LEÓN" || claveSt == "NUEVO LEON"){claveSt = "NL";}
        if(claveSt == "PUEBLA"){claveSt = "OL";}
        if(claveSt== "QUINTANA ROO"){claveSt = "QR";}
        if(claveSt == "SINALOA"){claveSt = "SL";}
        if(claveSt == "TLAXCALA"){claveSt = "TL";}
        if(claveSt == "YUCATAN" || claveSt == "YUCATAN"){claveSt = "YN";}
        if(claveSt  == "BAJA CALIFORNIA"){claveSt  = "BC";}
        if(claveSt  == "CAMPECHE"){claveSt  = "CC";}
        if(claveSt  == "COLIMA"){claveSt  = "CM";}
        if(claveSt == "CHIHUAHUA"){claveSt  = "CH";}
        if(claveSt  == "DURANGO"){claveSt  = "DG";}
        if(claveSt  == "GUERRERO"){claveSt  = "GR";}
        if(claveSt  == "JALISCO"){claveSt  = "JC";}
        if(claveSt  == "MICHOACÁN" || claveSt  == "MICHOACAN"){claveSt  = "MN";}
        if(claveSt  == "NAYARIT"){claveSt  = "NT";}
        if(claveSt  == "OAXACA"){claveSt  = "OC";}
        if(claveSt  == "QUERÉTARO" || claveSt  == "QUERETARO"){claveSt  = "QT";}
        if(claveSt  == "SAN LUIS POTOSÍ" || claveSt  == "SAN LUIS POTOSI"){claveSt  = "SP";}
        if(claveSt  == "SONORA"){claveSt  = "SR";}
        if(claveSt  == "TAMAULIPAS"){claveSt  = "TS";}
        if(claveSt  == "VERACRUZ"){claveSt  = "VZ";}
        if(claveSt  == "ZACATECAS"){claveSt  = "ZS";}
        if(claveSt  == "NACIDO EN EL EXTRANJERO"){claveSt  = "NE";}
        return claveSt ;
    }
    public void metodoCurp(String pn, String sn, String ap, String am, String gen, String st, String dia, String mes, String año){
        String L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16,L17,L18;
        L1 = ap.substring(0,2);
        //L2 = getV();
        L3 = am.substring(0,1);
        L4 = pn.substring(0,1);
        L5 = año.substring(2,3);
        L6 = año.substring(3,4);
        L7 = mes.substring(0,1);
        L8 = mes.substring(1,2);
        L9 = dia.substring(0,1);
        L10 = dia.substring(1,2);
        L11 = gen.substring(0,1);
        L12 = getClaveSt().substring(0,1);
        L13 = getClaveSt().substring(1,2);
        L14 = getConsAp();
        L15 = getCons2Am();
        L16 = getCons3Pn();
        L17 = getRandom();
        L18 = getRandom();
        this.CURP = L1 + L3 + L4 + L5 + L6 + L7 + L8 + L9 + L10 + L11 + L12 + L13 + L14 + L15 + L16 + L17 + L18;
        this.CURP = CURP.toUpperCase();
        System.out.println("Su CURP es:"+CURP);
    }
    public void metodoRFC(String pn, String sn, String ap, String am, String gen, String st, String dia, String mes, String año){
        String RFC, rand1, rand2, rand3;
        rand1 = getRandom();
        rand2 = getRandom();
        rand3 = getRandom();
        RFC = this.CURP.substring(0,9) + rand1 + rand2 + rand3;
        System.out.println("Su RFC es:"+RFC);
    }
}
