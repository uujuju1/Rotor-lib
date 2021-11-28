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
	
	public RotorLib() {
		Events.on(ClientLoadEvent.class, e -> {
        		Time.runTask(10f, () -> {
                		BaseDialog dialog = new BaseDialog("frog");
        	        	dialog.cont.add("This mod dont have an example. If you dont want the example use the other jar file.").row();
                		dialog.cont.button("Hmmm", dialog::hide).size(100f, 50f);
                		dialog.show();
        		});
        	});
	}
	@Override
	public void loadContent() {
		Log.info("no example to load");
	}
}
