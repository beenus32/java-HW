import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Homework8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Map<String, String> account = new HashMap<>();
        account.put("myld", "myPass");
        account.put("myld2", "myPass2");
        account.put("myld3", "myPass3");

        while(true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim();
            if(!account.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
                continue;
            }
            System.out.print("password : ");
            String pw = sc.nextLine().trim();
            if(!account.get(id).equals(pw)){
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
                continue;
            }
            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }
        sc.close();
    }
}

