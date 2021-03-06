/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.polybot.botdsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import polybot_modelling_language.Scene

@RunWith(XtextRunner)
@InjectWith(BotDslInjectorProvider)
class BotDslParsingTest {
	@Inject
	ParseHelper<Scene> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: �errors.join(", ")�''', errors.isEmpty)
	}
}
