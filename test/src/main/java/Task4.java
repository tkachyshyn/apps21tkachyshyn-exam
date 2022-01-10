import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        int number = -1;
        String[] results = {"three"};
        //todo: refactor this.
        String[] three = {"three", "3", "３", "三", "삼"};
        String[] two = {"two", "2", "２", "二", "이"};
        String[] one = {"one", "1", "１", "一", "일"};
        for (String res : results) {
            if(check(three, results)){
                number = 3;
            } else if(check(two, results)){
                number = 2;
            }else if(check(one, results)){
                number = 2;
            }
        }
        System.out.println("" + number);
    }

    private static boolean check(String[] nums, String[] results) {
        for (String res : results){
            for (String num : nums){
                if (res.toLowerCase().contains(num)){
                    return true;
                }
            }
        }
        return false;
    }
}

