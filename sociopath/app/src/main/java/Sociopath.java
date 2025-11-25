import java.util.List;


public class Sociopath {

    public int findTheSociopath (int groupSize, List<int []> likeList) {
        if (groupSize <= 0) return -1;

        int[] likesReceived = new int[groupSize + 1];
        int[] likesGiven = new int[groupSize + 1];

        for (int[] pair : likeList){
            int likes = pair[0];
            int likedby = pair[1];

            if (likes <= 0 || likes > groupSize || likedby <= 0 || likedby > groupSize ) return -1;

            likesGiven[likes]++;
            likesReceived[likedby]++;
        }


        for (int i = 1; i <= groupSize; i++) {
            if (likesGiven[i] == 0 && likesReceived[i] == groupSize-1) {
                return i;
            }
        }
        return -1;
    }
}
