package Compubots;

import robocode.*;

public class VelgBotNavnHer extends Robot {
	public void run() {
		while (true) {
			ahead(100);  // går forover
			turnRight(360);  // snurrer 360 grader
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

	public void onHitByBullet(HitByBulletEvent e) {
		turnRight(e.getBearing() + 90);  // snur seg 90 grader bort fra skuddet
	}
}