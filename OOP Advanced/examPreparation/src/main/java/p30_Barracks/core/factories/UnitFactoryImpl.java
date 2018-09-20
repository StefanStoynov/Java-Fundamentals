package p30_Barracks.core.factories;

import jdk.jshell.spi.ExecutionControl;
import p30_Barracks.contracts.Unit;
import p30_Barracks.contracts.UnitFactory;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"p30_Barracks.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
		// TODO: implement for problem 3


		throw new ExecutionControl.NotImplementedException("message");
	}
}
