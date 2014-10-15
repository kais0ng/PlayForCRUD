package controllers;

import java.util.HashMap;
import java.util.Map;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
		return redirect(routes.Application.login());
    }
    public static Result login(){
		return ok(login.render(null));
	}
	public static Result postLoginForm(){
		DynamicForm requestData = Form.form().bindFromRequest();
		String email = requestData.get("email");
		String pwd = requestData.get("password");
		return redirect(routes.Products.list());
	}
}
