package cn.xeblog.snake;

import cn.xeblog.snake.ui.SnakeGameUI;

import javax.swing.*;

/**
 * 启动游戏
 *
 * @author anlingyi
 * @date 2022/8/2 3:41 PM
 */
public class StartGame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("不贪吃蛇");
        frame.setSize(400, 320);
        frame.setLocationRelativeTo(null);
        JPanel gamePanel = new SnakeGameUI(400, 300);
        frame.add(gamePanel);
        gamePanel.requestFocus();
    }

}
