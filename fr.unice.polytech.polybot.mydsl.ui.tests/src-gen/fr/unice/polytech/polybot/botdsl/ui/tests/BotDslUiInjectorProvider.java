/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.polybot.botdsl.ui.tests;

import com.google.inject.Injector;
import fr.unice.polytech.polybot.mydsl.ui.internal.MydslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class BotDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MydslActivator.getInstance().getInjector("fr.unice.polytech.polybot.botdsl.BotDsl");
	}

}
