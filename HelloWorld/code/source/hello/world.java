package hello;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class world

{
	// ---( internal utility methods )---

	final static world _instance = new world();

	static world _newInstance() { return new world(); }

	static world _cast(Object o) { return (world)o; }

	// ---( server methods )---




	public static final void jtest (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(jtest)>> ---
		// @sigtype java 3.5
		IDataUtil.put(pipeline.getCursor(),"Message","Hello World!!!");
		IDataUtil.put(pipeline.getCursor(),"Message2","Hello World!!!");
		IDataUtil.put(pipeline.getCursor(),"Message3","Hello World!!!");
		// --- <<IS-END>> ---

                
	}
}

