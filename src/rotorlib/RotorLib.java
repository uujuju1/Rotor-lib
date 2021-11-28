package rotorlib;

import arc.*;
import arc.util.*;

import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import rotorlib.content.*;

public class RotorLib extends Mod {

	@Override
	public loadContent() {
		new LibCopter().load();
	}
}