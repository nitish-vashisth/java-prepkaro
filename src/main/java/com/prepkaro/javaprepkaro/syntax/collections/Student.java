package com.prepkaro.javaprepkaro.syntax.collections;

import java.util.*;
import java.util.logging.Level;

class Student {

    public static void main(String[] args) {

        Student solution = new Student();

        List<String> str = solution.restoreIpAddresses("101023");

        for(String s : str)
            System.out.println(s);

    }

    public List<String> restoreIpAddresses(String s) {
        List<String> ret = new LinkedList<String>();
        List<StringBuilder> brList = restoreIpAddresses(s, 1);
        for(StringBuilder br : brList)
            ret.add(br.toString());
        return ret;
    }

    public List<StringBuilder> restoreIpAddresses(String s, int level) {

       // System.out.println("Level : " + level + "  String is " + s);

        List<StringBuilder> br = new LinkedList<StringBuilder>();

        int len = s.length();

        if(!validString(s, level, len)) {
            return br;
        }

        if(level == 4) {

            int xx = Integer.parseInt(s);
            if(xx < 0 || xx > 255)
                return br;

            StringBuilder sb = new StringBuilder();
            sb.append(".");
            sb.append(s);
            br.add(sb);
           // System.out.println(br.toString());
            return br;
        }

        for(int i=1; i<=3; i++) {

            if(i > len)
                continue;

            String k = s.substring(i, len);
            int gg = level+1;
            //System.out.println("Func called : " + "Level "  +  gg + " " + k);

            String ttt = s.substring(0, i);
            int xx = Integer.parseInt(ttt);
            if(xx < 0 || xx > 255)
                continue;

            List<StringBuilder> brF =  restoreIpAddresses(k, level+1);
            for(StringBuilder y : brF){
                StringBuilder sb = new StringBuilder();

                if(level!=1)
                    sb.append(".");
                String t = s.substring(0, i);
                sb.append(t);
                sb.append(y);
                br.add(sb);
                //System.out.print(sb + " ");
            }
        }

        return br;
    }


    public boolean validString(String s, int level, int len) {

        if(level == 1) {
            if(len>=4 && len<=12)
                return true;
            return false;
        } else if(level == 2) {
            if(len>=3 && len<=9)
                return true;
            return false;
        } else if (level == 3) {
            if(len>=2 && len<=6)
                return true;
            return false;
        } else if(level == 4) {
            if(len>=1 && len<=3)
                return true;
            return false;
        } else {
            return false;
        }
    }



}
