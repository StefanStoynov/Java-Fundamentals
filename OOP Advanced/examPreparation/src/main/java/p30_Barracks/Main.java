package p30_Barracks;

import p30_Barracks.contracts.Repository;
import p30_Barracks.contracts.Runnable;
import p30_Barracks.contracts.UnitFactory;
import p30_Barracks.core.Engine;
import p30_Barracks.core.factories.UnitFactoryImpl;
import p30_Barracks.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(repository, unitFactory);
		engine.run();
	}
}
