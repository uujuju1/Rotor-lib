package rotorlib.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.struct.*;
import arc.graphics.Color;
import mindustry.ai.types.*;
import mindustry.ctype.*;
import mindustry.ctype.ContentList;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;
import mindustry.entities.effect.MultiEffect;
import mindustry.graphics.Pal;
import mindustry.type.ammo.ItemAmmoType;
import mindustry.type.weapons.PointDefenseWeapon;
import mindustry.world.meta.BlockFlag;

import rotorlib.type.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;
import static mindustry.Vars.tilesize;
import static mindustry.content.Bullets.*;

public class LibCopter implements ContentList {
	public static UnitType ketzimine;

	@Override
	public void load() {
		ketzimine = new RotorUnitType("ketzimine") {{
			localizedName = "Ketzimine";
			health = 69420;
			speed = 3f;
			accel = 0.04f;
			drag = 0.016f;
			faceTarget = true;

			rotors.add(
				new DrawRotor(name + "-rotor") {{
					x = y = 0f;
					rotorSpeed = 15f;
				}}
			);
		}};
	}
}