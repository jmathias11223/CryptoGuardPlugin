package myfirstplugin.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import vt.edu.gradleguard.core.*;

public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		String versions = String.format("CryptoGuard Version: %s\nGradleGuard Version: %s", 
		    util.Utils.projectVersion, Utils.projectVersion);
		MessageDialog.openInformation(
				window.getShell(),
				"Versions", versions);
		// Pass in .class file
		// Base.entryPoint()
		return null;
	}
}
