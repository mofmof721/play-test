package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * コントローラークラス
 *
 */
public class Application extends Controller {

	/**
	 * index画面アクセス時処理
	 *
	 * @return 処理結果
	 */
	public Result index() {
		// index画面を表示する
		return ok(index.render("Your new application is ready."));
	}

}
