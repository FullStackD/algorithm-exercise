package leetcode.weekend;


import java.util.Arrays;

public class W5345 {

    /*
        1. 解题关键是排序问题
        2. 选取合适的数据结构存储数据
        3. 自定义compare方法
     */
    public static void main(String[] args) {
        //String[] votes = {"ABC","ACB","ABC","ACB","ACB"};
        //String[] votes = {"WXYZ","XYZW"};
        //String[] votes = {"BCA", "CAB", "CBA", "ABC", "ACB", "BAC"};
        String[] votes = {"FVSHJIEMNGYPTQOURLWCZKAX", "AITFQORCEHPVJMXGKSLNZWUY", "OTERVXFZUMHNIYSCQAWGPKJL", "VMSERIJYLZNWCPQTOKFUHAXG", "VNHOZWKQCEFYPSGLAMXJIUTR", "ANPHQIJMXCWOSKTYGULFVERZ", "RFYUXJEWCKQOMGATHZVILNSP", "SCPYUMQJTVEXKRNLIOWGHAFZ", "VIKTSJCEYQGLOMPZWAHFXURN", "SVJICLXKHQZTFWNPYRGMEUAO", "JRCTHYKIGSXPOZLUQAVNEWFM", "NGMSWJITREHFZVQCUKXYAPOL", "WUXJOQKGNSYLHEZAFIPMRCVT", "PKYQIOLXFCRGHZNAMJVUTWES", "FERSGNMJVZXWAYLIKCPUQHTO", "HPLRIUQMTSGYJVAXWNOCZEKF", "JUVWPTEGCOFYSKXNRMHQALIZ", "MWPIAZCNSLEYRTHFKQXUOVGJ", "EZXLUNFVCMORSIWKTYHJAQPG", "HRQNLTKJFIEGMCSXAZPYOVUW", "LOHXVYGWRIJMCPSQENUAKTZF", "XKUTWPRGHOAQFLVYMJSNEIZC", "WTCRQMVKPHOSLGAXZUEFYNJI"};
        System.out.println(rankTeams(votes));
    }

    public static String rankTeams(String[] votes) {
        if (votes.length == 1) {
            return votes[0];
        }
        int[][] d = new int[26][27];//存储所有字母及每个位置的数量
        for (int i = 0; i < 26; i++) {
            d[i][0] = 'A' + i;
        }
        //对每个投票进行处理
        for (int i = 0; i < votes.length; i++) {
            for (int j = 0; j < votes[i].length(); j++) {
                d[votes[i].charAt(j) - 'A'][j + 1] += 1;
            }
        }

        Arrays.sort(d, (d1, d2) -> {
            for (int i = 1; i < 26; i++) {
                if (d1[i] < d2[i]) {
                    return 1;
                }
                if (d1[i] > d2[i]) {
                    return -1;
                }
            }
            return d1[0] - d2[0];
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < votes[0].length(); i++) {
            sb.append((char) (d[i][0]));
        }
        return sb.toString();
    }


}
