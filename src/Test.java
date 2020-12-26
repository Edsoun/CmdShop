import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        File file =new File("F:\\Idea\\src\\user.xlsx");
        ReadExcel re = new ReadExcel();
        User[] users = re.readExcel(file);

        Scanner in = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = in.next();
        System.out.println("请输入密码：");
        String password = in.next();
        int flag = 0;
        for(User us:users){
             if(username.equals(us.getUsername()) && password.equals(us.getPassword())){
                 System.out.println("登陆成功！");
                 flag=1;
             }
        }
        if(flag!=1){
            System.out.println("用户名或密码错误！");
        }

    }
}
