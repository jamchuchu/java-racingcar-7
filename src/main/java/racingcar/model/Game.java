package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Car> cars;
    private final int tryTimes;
    private int maxPosition;

    public Game(int tryTimes) {
        this.cars = new ArrayList<>();
        this.tryTimes = tryTimes;  // 생성자에서 한 번만 초기화
    }

    public void addCar(Car car) {
        if(true){// valid
            cars.add(car);
        }
    }

    public void moveCars(){
        for (Car car : cars) {
            car.move();
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getTryTimes() {
        return tryTimes;
    }

    public List<Car> getWinners(){
        List<Car> winners = new ArrayList<>();
        for(Car car : cars){
            if(car.getPosition() == maxPosition){
                winners.add(car);
            }
        }
        return winners;
    }

}