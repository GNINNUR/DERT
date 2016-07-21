package gov.nasa.arc.dert.action.mapelement;

import gov.nasa.arc.dert.action.MenuItemAction;
import gov.nasa.arc.dert.state.ConfigurationManager;
import gov.nasa.arc.dert.state.ScaleState;

import com.ardor3d.math.Vector3;
import com.ardor3d.math.type.ReadOnlyVector3;

/**
 * Context menu item for adding a 3D scale at a point on the landscape.
 *
 */
public class AddScaleAction extends MenuItemAction {

	private Vector3 position;

	/**
	 * Constructor
	 * 
	 * @param position
	 * @param normal
	 */
	public AddScaleAction(ReadOnlyVector3 position) {
		super("3D Scale");
		this.position = new Vector3(position);
	}

	@Override
	protected void run() {
		ScaleState state = new ScaleState(position);
		ConfigurationManager.getInstance().getCurrentConfiguration().addMapElementState(state);
	}

}