

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-10-26 13:04:51 IST
// -----( ON-HOST: centos.inbda.01

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class demo

{
	// ---( internal utility methods )---

	final static demo _instance = new demo();

	static demo _newInstance() { return new demo(); }

	static demo _cast(Object o) { return (demo)o; }

	// ---( server methods )---




	public static final void hello (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(hello)>> ---
		// @sigtype java 3.5
		IDataUtil.put(pipeline.getCursor(), "result", "Hello World!!!");
		IDataUtil.put(pipeline.getCursor(), "result", "Hello World!!!");
		// --- <<IS-END>> ---

                
	}
}

