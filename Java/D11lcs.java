import java.util.*;
import java.lang.*;
import java.io.*;

public class D11lcs {
    public static ArrayList<Character> lcs(char[] chara, char[] charb, int lena, int lenb) {
        ArrayList<Character> rtn = null;
        if (lena == 0 || lenb == 0)
            return new ArrayList<Character>();
        if (chara[lena - 1] == charb[lenb - 1]) {
            rtn = lcs(chara, charb, lena - 1, lenb - 1);
            rtn.add(chara[lena - 1]);
        } else {
            ArrayList<Character> rtnl = lcs(chara, charb, lena, lenb - 1);
            ArrayList<Character> rtnr = lcs(chara, charb, lena - 1, lenb);
            if (rtnl.size() > rtnr.size())
                rtn = rtnl;
            else
                rtn = rtnr;
        }
        return rtn;
    }

    public static void main(String args[]) {
        String stra = "agbdba";
        String strb = "abdbga";
        int lena = stra.length();
        int lenb = strb.length();
        char[] chara = stra.toCharArray();
        char[] charb = strb.toCharArray();

        // int [][]arr = new int[lena];
        // ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(lena);
        ArrayList<Character> ans = lcs(chara, charb, lena, lenb);
        System.out.println(ans.toString());
    }
}
