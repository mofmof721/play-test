package controllers;

import java.util.List;

import models.UserMaster;
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
		// ユーザーマスタを検索する
		List<UserMaster> userMasterList = UserMaster.getFind().all();
		for (UserMaster data : userMasterList) {
			// 利用者名を出力する
			System.out.println(data.getUserName());
		}
		// index画面を表示する
		return ok(index.render("Your new application is ready."));
	}

}
