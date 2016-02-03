package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import po.User;

public class LoginAction extends ActionSupport implements ModelDriven {
//    private String username;
//    private String password;

    private User user = new User();

    public String login() {
//        System.out.println(username);


        System.out.println(user.getUsername());
        System.out.println(user.getBookList().get(0).getUsername());
        System.out.println(user.getBookList().get(1).getUsername());

        return SUCCESS;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    //    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }


    @Override
    public Object getModel() {
        return user;
    }

    @Override
    public void validate() {
        if (user.getUsername() == null || "".equals(user.getUsername().trim())) {
            this.addFieldError("username", "用户名不能为空");
//            return INPUT;
        }
    }
}
