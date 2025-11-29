import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
class Homework9{
    public static Map<String, String> DB(String filename){
        Map<String, String> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()){
                    continue;
                }

                String[] s = line.split("\\s+");
                if (s.length >= 2) {
                    map.put(s[0].trim(), s[1].trim());
                }
            }
        }
        catch(IOException e){
            System.out.println("file not found");
        }
        return map;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Map<String, String> account = DB("db.txt");
        String id = "";
        String pw = "";

        // 디버깅 코드 추가
        System.out.println("--- 로드된 ID 목록 ---");
        for (String key : account.keySet()) {
            // 따옴표를 사용하여 공백이나 숨겨진 문자를 시각적으로 확인
            System.out.println("키: \"" + key + "\" (길이: " + key.length() + ")");
        }
        System.out.println("--------------------");

        while(true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            id = sc.nextLine().trim();
            if(!account.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
                continue;
            }
            System.out.print("password : ");
            pw = sc.nextLine().trim();
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
