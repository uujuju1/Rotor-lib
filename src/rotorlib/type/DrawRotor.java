package rotorlib.type;

import arc.Core;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.Time;
import mindustry.gen.Unit;

public class DrawRotor {
	public final String name;
	public float x = 0, y = 0, rotorSpeed = 15; 
	float speedMultiplier;
	public TextureRegion rotorRegion, jointRegion;

	public DrawRotor(String name) {
		this.name = name;
	}

	public void load() {
		rotorRegion = Core.atlas.find(name);
		jointRegion = Core.atlas.find(name + "-joint");
	}

	public void draw(Unit unit) {
		if (unit.isFlying()) {
			speedMultiplier = 1f;
		} else {
			speedMultiplier = 0f;
		}

		float speed = rotorSpeed * speedMultiplier;
		float angleX = unit.x + Angles.trnsx(unit.rotation + 90, x, y);
		float angleY = unit.y + Angles.trnsy(unit.rotation + 90, x, y);

		if (unit.dead) {
			speed = rotorSpeed * speedMultiplier/2;
		}

		Draw.rect(rotorRegion, angleX, angleY, Time.time * speed + unit.rotation);
		Draw.rect(jointRegion, angleX, angleY, unit.rotation - 90);
	}
}
