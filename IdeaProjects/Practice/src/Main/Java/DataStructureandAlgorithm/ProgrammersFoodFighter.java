package Main.Java.DataStructureandAlgorithm;

public class ProgrammersFoodFighter {
    public static void main(String[] args) {
        int[] food = new int[]{1, 3, 4, 6};
        System.out.println(solution(food)); // answer = "1223330333221"
    }
    public static String solution(int[] food) {
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < food.length; i++) {
                if(food[i]%2==0){
                    for(int j=1; j <= food[i]/2; j++) {
                        sb.append(Integer.toString(i));
                    }
                } else {
                    for(int k=1; k <= (food[i]-1)/2; k++) {
                        sb.append(Integer.toString(i));
                    }
                }
            }
            String answer = sb.toString() + "0" + sb.reverse().toString();
            return answer;
        }
}

