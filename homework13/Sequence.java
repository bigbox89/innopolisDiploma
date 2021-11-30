public class Sequence {
    public static int[] filter(int[] array, ByCondition condition) {
        int[] returnArr = new int[100];
        int j = 0;
        for (int i:array) {
           if( condition.isOk(i)){
              returnArr[j] = i;
              j++;
           }
        }
        return returnArr;
    }
}
