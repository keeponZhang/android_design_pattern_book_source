package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/15.
 */
public class predictPartyVictory {
    //RD R

    //RDD RD D

    //RRDD RRD RR
    public String predictPartyVictory(String senate) {
        int n = senate.length(), cntR = 0, cntD = 0;
        char[] temp = senate.toCharArray();

        for (int i = 0; i <senate.length() ; i++) {
            if(senate.charAt(i) == 'R'){
                cntR++;
            }else {
                cntD++;
            }
        }

        if (cntR == 0) {
            return "Dire";
        }
        if (cntD == 0) {
            return "Radiant";
        }

        while (cntR > 0 && cntD > 0) {
            for (int i = 0; i < n; ++i) {
                if (temp[i] == 'R') {
                    for (int j = i + 1; j < i + n; ++j) {
                        if (temp[j % n] == 'D') {
                            temp[j % n] = 'B';
                            --cntD;
                            break;
                        }
                    }
                } else if (temp[i] == 'D') {
                    for (int j = i + 1; j < i + n; ++j) {
                        if (temp[j % n] == 'R') {
                            temp[j % n] = 'B';
                            --cntR;
                            break;
                        }
                    }
                }
            }
        }

        return cntR != 0 ? "Radiant" : "Dire";
    }
}
