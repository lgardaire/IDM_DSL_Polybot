/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.polybot.botdsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BotDslStandaloneSetup extends BotDslStandaloneSetupGenerated {

	def static void doSetup() {
		new BotDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
