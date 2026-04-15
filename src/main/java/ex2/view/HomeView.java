package ex2.view;

import ex2.Ex2Application;
import ex2.controller.Controller;
import ex2.dto.ResponseDto;
import ex2.util.Input;

import java.util.HashMap;
import java.util.Map;

public class HomeView implements View {
    @Override
    public void render () {
        homeMenu();
        String cmd = Input.nextLine();
        ResponseDto<Map<String, Object>> response = Controller.homeController(cmd);
        if (response.getStatus() == 100) {
            Ex2Application.running = false;
            return;
        }
        if (response.getStatus() != 200) {
            homeError(response.getData().get("message").toString());
            return;
        }
    }
    private void homeMenu() {
        Map<String, String> props = new HashMap<>();
        props.put("title", "홈 메뉴");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1. 계좌 생성\n");
        stringBuilder.append("2. 은행 서비스 이용하기\n");
        stringBuilder.append("q. 프로그램 종료\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
    }

    private void homeError(String message) {
        Map<String, String> props = new HashMap<>();
        props.put("title", "문제 발견");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("오류 메세지: ");
        stringBuilder.append(message);
        stringBuilder.append("\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
        Input.nextWait();
    }


}
