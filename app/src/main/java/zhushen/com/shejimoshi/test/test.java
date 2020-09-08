package zhushen.com.shejimoshi.test;

/**
 * Created by Zhushen on 2018/9/26.
 */
public class test {
    public static void main(String[] args){
        String cmd = "ff00ff00ff04b1303031fcfcfc";
        byte[] test = HexStrngToByteArray(cmd);

        String[] ascii = new String[]{"30","31","32","33","34","35","36","37","38","39","41","42","43"};
        String result = HexAsciiToString(ascii);


        String cmd2 = "FF00FCFCFF00FF00FC";
        String[] temp = cmd2.split("FC");

        for (String str:temp) {
            if(str.startsWith("",3)){
                System.out.println(str);
            }else {
                System.out.println("error " + str);
            }
        }
        int x = 0;

    }

    public static String HexAsciiToString(String[] ascii){
        String result = "";
        for (String str:ascii) {
            result += HexAsciiToString(str);
        }
        boolean a = true;
        boolean b = false;

        boolean c = a^a^true;
        boolean d = a^b^true;
        boolean e = b^b^true;



        return result;
    }

    public static String HexAsciiToString(String ascii){
        // TODO: 2018/9/27 hex to dex
        // TODO: 2018/9/27 int to char
        int x = Integer.parseInt(ascii,16);
        char c = (char) x;
        return "" + c;
    }


    public static byte[] HexStrngToByteArray(String hex){
        int len = (hex.length() / 2);
        byte[] result = new byte[len];
        char[] achar = hex.toCharArray();
        for (int i = 0; i < len; i++) {
            int pos = i * 2;
            result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
        }
        return result;
    }

    private static int toByte(char c) {
        byte b = (byte) "0123456789ABCDEF".indexOf(c);
        return b;
    }


    private void test(int n){
        //初始化路径，都为最大值。
        int path[][]=new int[n+1][n+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++)
                path[i][j]=Integer.MAX_VALUE;
        }
        //这里需要输入path[i][j]的具体内容，如果有重复数据的话，需要更新路径为最小值。
        int minLen[]=new int[n+1];
        //visit初始为0，防止回溯
        int visit[]=new int[n+1];
        //初始化1到其他点的距离。
        for(int i=1;i<n+1;i++){
            minLen[i]=path[1][i];
        }
//        void Dijkstra(){
//            minLen[1]=0;
//            visit[1]=1;
//            int minj=1;
//            for(int i=1;i<n+1;i++){
//                int min=Integer.MAX_VALUE;
//                for(int j=1;j<n+1;j++){
//                    if(visit[j]==0&&minLen[j]<min){
//                        min=minLen[j];
//                        minj=j;
//                    }
//                }
//                visit[minj]=1;
//                for(int j=1;j<n+1;j++){
//                    if(visit[j]==0&&minLen[minj]!=Integer.MAX_VALUE&&path[minj][j]!=
//                            Integer.MAX_VALUE&&minLen[j]>(minLen[minj]+path[minj][j])){
//                        minLen[j]=minLen[minj]+path[minj][j];
//                    }
//                }
//            }
//        }
    }



}
