/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.polybot.botdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BotDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/unice/polytech/polybot/botdsl/parser/antlr/internal/InternalBotDsl.tokens");
	}
}
