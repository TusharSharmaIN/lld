package design_patterns.structural.facade_pattern;

import java.util.Scanner;

public class FacadePatternRunner {
    public void main(String[] args) {
        MediaPlayerFacade mediaPlayerFacade = new MediaPlayerFacade();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Multimedia App!");
        System.out.println("Choose an action: playMusic, playVideo, viewImage");
        String action = scanner.nextLine();
        mediaPlayerFacade.performAction(action);
        scanner.close();
    }
}